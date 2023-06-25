package com.example.demo.repository;

import com.example.demo.models.dto.request.QuestionRequestDto;
import com.example.demo.models.entitys.Answer;
import com.example.demo.models.entitys.Result;
import org.springframework.data.domain.Page;

public interface QuestionRepositoryCriteria {
    Page<QuestionRequestDto> getQuestionByCriteria(Answer ansers, Result results);

}
