package com.example.demo.repository;

import com.example.demo.models.dto.request.QuestionRequestDto;
import com.example.demo.models.entitys.Answer;
import com.example.demo.models.entitys.Result;
import org.springframework.data.domain.Page;

public class QuestionRepositoryImpl implements QuestionRepositoryCriteria{



    @Override
    public Page<QuestionRequestDto> getQuestionByCriteria(Answer answers, Result results) {
        return null;
    }
}
