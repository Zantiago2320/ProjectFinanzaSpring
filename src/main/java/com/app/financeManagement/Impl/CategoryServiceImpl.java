package com.app.financeManagement.Impl;

import com.app.financeManagement.DTO.CategoryDTO;
import com.app.financeManagement.Repository.CategoryRepository;
import com.app.financeManagement.Repository.UserRepository;
import com.app.financeManagement.Service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    public CategoryServiceImpl(ModelMapper modelMapper, UserRepository userRepository, CategoryRepository categoryRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.categoryRepository = categoryRepository;
    }

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl() {
    }


    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        // Check if the user exists
        if (userRepository.existsById(categoryDTO.getUserId())) {
            return null;
        }
        throw new RuntimeException("User with ID " + categoryDTO.getUserId() + " does not exist.");
    }

    @Override
    public CategoryDTO getCategoryById(long id) {
        // Check if the category exists
        if (!categoryRepository.existsById(id)) {
            throw new RuntimeException("Category with ID " + id + " does not exist.");
        }
        // Fetch the category and convert it to DTO
        return null;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(category -> modelMapper.map(category, CategoryDTO.class))
                .toList();
    }

    @Override
    public CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO) {
        // Implementation logic here
        return null;
    }

    @Override
    public void deleteCategory(Long id) {
        // Implementation logic here
    }