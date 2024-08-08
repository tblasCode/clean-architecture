package com.vass.jos.backend.port;

public interface MongoDbRepository {

  String findById(String id);

  boolean existsById(String id);
}
