package com.example.demo.webapp.facade.admin;

import com.example.demo.models.dto.request.QuestionRequestDto;

public interface AdminQuestionServiceFacade {
    void save(QuestionRequestDto dto);
    void delete(Long id);
}
