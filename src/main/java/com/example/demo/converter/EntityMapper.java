package com.example.demo.converter;

import java.util.List;

public interface EntityMapper<D, E> {
    E toEntity(D d);

    List<E> toEntity(List<D> dList);
}