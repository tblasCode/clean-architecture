package com.vass.jos.backend.adapter.service;

import com.vass.jos.backend.port.MongoDbRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ServiceRepositoryImpl implements MongoDbRepository {

    @Override
    public String findById(String id) {
        return "";
    }

    @Override
    public boolean existsById(String id) {
        return false;
    }
}
