package com.app.financeManagement.DTO;

import lombok.Data;

@Data
public class CategoryDTO {
    private Long idCategory;
    private String name;
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
