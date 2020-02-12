package com.practice.fuzzysearch.service.impl;

import com.practice.fuzzysearch.model.DataFromАdministration;
import com.practice.fuzzysearch.repository.DataFromAdministrationRepository;
import com.practice.fuzzysearch.service.DataFromAdministrationService;

import java.util.HashSet;
import java.util.Set;

public class DataFromAdministrationImpl implements DataFromAdministrationService {

    private final DataFromAdministrationRepository dataRepository;

    public DataFromAdministrationImpl(DataFromAdministrationRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public Set<DataFromАdministration> findAll() {
        Set<DataFromАdministration> data = new HashSet<>();
        dataRepository.findAll().forEach(data :: add);
        return data;
    }

    @Override
    public DataFromАdministration findById(Long aLong) {
        return dataRepository.findById(aLong).orElse(null);
    }

    @Override
    public DataFromАdministration save(DataFromАdministration object) {
        return dataRepository.save(object);
    }

    @Override
    public void delete(DataFromАdministration object) {
        dataRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        dataRepository.deleteById(aLong);
    }
}
