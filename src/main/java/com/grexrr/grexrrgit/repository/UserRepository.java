package com.grexrr.grexrrgit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grexrr.grexrrgit.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
