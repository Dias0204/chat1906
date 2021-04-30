package kz.aitu.chat1906.controller;

import kz.aitu.chat1906.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
    private UserRepository UserRepository;

    @GetMapping({""})
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(UserRepository.findAll());
    }
//
//    @GetMapping({"/api/getById"})
//    public ResponseEntity<?> getById() {
//        return ResponseEntity.ok(UserRepository.findById());
//    }
//
//    @GetMapping({"/api/getAllById"})
//    public ResponseEntity<?> getAllById() {
//        return ResponseEntity.ok(UserRepository.findAllById());
//    }
}
