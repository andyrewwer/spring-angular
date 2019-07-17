package com.corelogic.schemaconverter.service;

import com.corelogic.schemaconverter.entity.MyEntity;
import com.corelogic.schemaconverter.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final MyRepository repository;

    @Autowired
    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public MyEntity getEntity(Long id) { return repository.findOne(id); }
}