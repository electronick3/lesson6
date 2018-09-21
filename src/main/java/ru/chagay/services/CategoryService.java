package ru.chagay.services;

import ru.chagay.models.CategoryEntity;

import java.util.List;

public interface CategoryService {

    List<CategoryEntity> findAll();
}
