package com.practice.fuzzysearch.service.impl;

import com.practice.fuzzysearch.model.DataFromUsers;
import com.practice.fuzzysearch.repository.DataFromUsersRepository;
import com.practice.fuzzysearch.service.DataFromAdministrationService;
import com.practice.fuzzysearch.service.DataFromUsersService;

import java.util.HashSet;
import java.util.Set;

public class DataFromUsersImpl implements DataFromUsersService {

    private final DataFromUsersRepository dataRepository;

    private final DataFromAdministrationService dataFromAdministrationService;

    public DataFromUsersImpl(DataFromUsersRepository dataRepository, DataFromAdministrationService dataFromAdministrationService) {
        this.dataRepository = dataRepository;
        this.dataFromAdministrationService = dataFromAdministrationService;
    }

    @Override
    public Set<DataFromUsers> findAll() {
        Set<DataFromUsers> data = new HashSet<>();
        dataRepository.findAll().forEach(data :: add);
        return data;
    }

    @Override
    public DataFromUsers findById(Long aLong) {
        return dataRepository.findById(aLong).orElse(null);
    }

    @Override
    public DataFromUsers save(DataFromUsers object) {
        return dataRepository.save(object);
    }

    @Override
    public void delete(DataFromUsers object) {
        dataRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        dataRepository.deleteById(aLong);
    }
}
