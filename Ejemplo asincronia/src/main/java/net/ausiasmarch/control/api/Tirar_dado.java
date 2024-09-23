package net.ausiasmarch.control.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import net.ausiasmarch.control.model.Dado;

@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class Tirar_dado {
    @PostMapping("/dado")
    public ResponseEntity<Integer> dado() {
        return new ResponseEntity<>(new Dado().getDado(), HttpStatus.OK);

    }
}