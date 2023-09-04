package com.saadahmedsoft.rendertestpr.controller;

import com.saadahmedsoft.rendertestpr.dto.HelloResponse;
import com.saadahmedsoft.rendertestpr.dto.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RenderController {

    @GetMapping("/")
    public ResponseEntity<?> getHome() {
        return new ResponseEntity<>(new HelloResponse("Hello Render Hosted Application"), HttpStatus.OK);
    }

    @GetMapping("/render")
    public ResponseEntity<?> render() {
        List<UserResponse> userResponses = new ArrayList<>();

        userResponses.add(new UserResponse(1, "Saad", "Software Engineer"));
        userResponses.add(new UserResponse(2, "Imran", "MERN Stack Engineer"));
        userResponses.add(new UserResponse(3, "Sourav", "Spring Boot Developer"));

        return new ResponseEntity<>(userResponses, HttpStatus.OK);
    }
}
