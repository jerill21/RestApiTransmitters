package com.hello.es.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SimRepository extends MongoRepository<Sim, Integer> {
}
