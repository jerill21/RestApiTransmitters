package com.hello.es.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ModemRepository extends MongoRepository<Modem, Integer> {

}
