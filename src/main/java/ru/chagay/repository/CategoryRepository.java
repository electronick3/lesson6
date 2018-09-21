package ru.chagay.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ru.chagay.models.CategoryEntity;

@Repository(CategoryRepository.NAME)
public interface CategoryRepository extends PagingAndSortingRepository<CategoryEntity, String> {

    @NonNull
    String NAME = "categoryRepository";
}
