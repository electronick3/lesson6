package ru.chagay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.chagay.models.CategoryEntity;
import ru.chagay.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Qualifier("categoryRepository")
    @Autowired
    CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryEntity> findAll(){
        return (List<CategoryEntity>) categoryRepository.findAll();
    }
}
