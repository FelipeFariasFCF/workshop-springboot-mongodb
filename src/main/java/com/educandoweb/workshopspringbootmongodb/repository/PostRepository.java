package com.educandoweb.workshopspringbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.workshopspringbootmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
}