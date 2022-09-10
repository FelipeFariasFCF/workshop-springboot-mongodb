package com.educandoweb.workshopspringbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.workshopspringbootmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
}