package ru.chagay.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.chagay.models.CategoryEntity;

@Data
@NoArgsConstructor
public class CategoryDTO {

    private String idcategory;
    private String categoryname;

    public CategoryDTO(final CategoryEntity category){
        if (category == null) return;
        idcategory = category.getIdcategory();
        categoryname = category.getCategoryname();
    }
}
