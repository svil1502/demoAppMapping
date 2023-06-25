package com.example.demo.service.entity;

import com.example.demo.models.entitys.Question;

public interface QuestionService {
    void save(Question question);

    void deleteById(Long id);
}
