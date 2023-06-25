package com.example.demo.webapp.rest;


import com.example.demo.models.entitys.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin/medias")
public class AdminMediasRestController {

    @PostMapping("/{id}/questions")
    public ResponseEntity<Void> addQuestions(@RequestBody List<Question> questions) {
//...
        return ResponseEntity.ok().build();
    }

}
