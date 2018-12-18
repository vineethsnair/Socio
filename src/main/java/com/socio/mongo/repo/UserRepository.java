package com.socio.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.socio.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
