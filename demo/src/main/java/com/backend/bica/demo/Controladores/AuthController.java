package com.backend.bica.demo.Controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.bica.demo.DTOs.LoginRequest;
import com.backend.bica.demo.DTOs.LoginResponse;
import com.backend.bica.demo.DTOs.RegisterRequest;
import com.backend.bica.demo.Modelo.Usuario;
import com.backend.bica.demo.Repositorios.UsuarioDAO;
import com.backend.bica.demo.Seguridad.JwtUtils;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = {"*", "localhost:8080", "127.0.0.1"}, allowedHeaders = "*")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest){
        if(this.existsByUsername(registerRequest.getUsername())){
            return ResponseEntity.badRequest().body("El usuario ya existe");
        }
        else{
            Usuario usuario = new Usuario(registerRequest.getUsername(), passwordEncoder.encode(registerRequest.getPassword()));
            return ResponseEntity.ok(usuarioDAO.save(usuario));
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtUtils.generateJwtToken(authentication);
            LoginResponse rta = new LoginResponse();
            rta.setToken(jwt);
            rta.setUsername(loginRequest.getUsername());
            return ResponseEntity.ok(rta);


        } catch (AuthenticationException e) {
            return ResponseEntity
                    .badRequest()
                    .body("Error: Nombre de usuario o contraseña incorrectos");
        } catch (Exception e){
            return ResponseEntity.status(403).body("Error: " + e.getMessage());
        }
    }





    public boolean existsByUsername(String username) {
        return usuarioDAO.findByUsername(username) != null;
    }
}
