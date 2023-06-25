package com.example.demo.converter.question;

import com.example.demo.converter.DtoMapper;
import com.example.demo.converter.config.ConfigMapper;
import com.example.demo.models.dto.request.ResultRequestDto;
import com.example.demo.models.entitys.Result;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(config = ConfigMapper.class)
public interface ResultMapper extends DtoMapper<ResultRequestDto, Result> {
    default List<ResultRequestDto> toDto(Set<Result> results) {
        return toDto(new ArrayList<>(results));
    }

    default Set<Result> map(List<Long> resultsIds) {
        return resultsIds.stream()
                .map(id -> Result.builder().id(id).build())
                .collect(Collectors.toSet());
    }
}
