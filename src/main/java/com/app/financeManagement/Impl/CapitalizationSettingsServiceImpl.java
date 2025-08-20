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
    public CapitalizationSettingsDTO getCapitalizationSettingsById(long id) {
        return fakeDb.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not found"));
    }

    @Override
    public CapitalizationSettingsDTO updateCapitalizationSettings(long id, CapitalizationSettingsDTO dto) {
        deleteCapitalizationSettings(id);
        fakeDb.add(dto);
        return dto;
    }

    @Override
    public void deleteCapitalizationSettings(long id) {
        fakeDb.removeIf(s -> s.getId() == id);
    }
}
