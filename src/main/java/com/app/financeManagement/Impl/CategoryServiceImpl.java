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

    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository, UserRepository userRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        if (!userRepository.existsById(categoryDTO.getUserId())) {
            throw new RuntimeException("User with ID " + categoryDTO.getUserId() + " does not exist.");
        }
        var category = modelMapper.map(categoryDTO, com.app.financeManagement.Entity.Category.class);
        category = categoryRepository.save(category);
        return modelMapper.map(category, CategoryDTO.class);
    }

    @Override
    public CategoryDTO getCategoryById(long id) {
        var category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category with ID " + id + " does not exist."));
        return modelMapper.map(category, CategoryDTO.class);
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        var categories = categoryRepository.findAll();
        return categories.stream()
                .map(category -> modelMapper.map(category, CategoryDTO.class))
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO) {
        var category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category with ID " + id + " does not exist."));
        category.setName(categoryDTO.getName());
        category.setUserId(categoryDTO.getUserId());
        var updatedCategory = categoryRepository.save(category);
        return modelMapper.map(updatedCategory, CategoryDTO.class);
    }

    @Override
    public void deleteCategory(Long id) {
        if (!categoryRepository.existsById(id)) {
            throw new RuntimeException("Category with ID " + id + " does not exist.");
        }
        categoryRepository.deleteById(id);
    }