package com.example.demo.service.entity.impl;

import com.example.demo.models.entitys.Question;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.service.entity.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    @Override
    public void save(Question question) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
