package com.app.financeManagement.Impl;

import com.app.financeManagement.DTO.CapitalizationSettingsDTO;
import com.app.financeManagement.Entity.CapitalizationSettings;
import com.app.financeManagement.Repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.app.financeManagement.DTO.CapitalizationSettingsDTO;
import com.app.financeManagement.Service.CapitalizationSettingsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CapitalizationSettingsServiceImpl implements CapitalizationSettingsService {

    private final List<CapitalizationSettingsDTO> fakeDb = new ArrayList<>();

    @Override
    public List<CapitalizationSettingsDTO> getAllCapitalizationSettings() {
        return fakeDb;
    }

    @Override
    public CapitalizationSettingsDTO createCapitalizationSettings(CapitalizationSettingsDTO dto) {
        fakeDb.add(dto);
        return dto;
    }

    @Override
    public CapitalizationSettingsDTO getCapitalizationSettingsById(Long id) {
        return null;
    }

    @Override
    public CapitalizationSettingsDTO updateCapitalizationSettings(Long id, CapitalizationSettingsDTO dto) {
        return null;
    }

    @Override
    public void deleteCapitalizationSettings(Long id) {

    }
}
