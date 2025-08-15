package com.app.financeManagement.Service;

import com.app.financeManagement.DTO.CategoryDTO;
import com.app.financeManagement.Entity.Category;

import java.util.List;

public interface CategoryService {
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO getCategoryById(long id);
    List<CategoryDTO> getAllCategories();
    CategoryDTO updateCategory(long id, CategoryDTO categoryDTO);
    void deleteCategory(long id);
}
