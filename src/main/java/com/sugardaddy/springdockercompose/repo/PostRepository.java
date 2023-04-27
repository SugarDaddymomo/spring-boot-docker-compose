package com.sugardaddy.springdockercompose.repo;

import com.sugardaddy.springdockercompose.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post, Integer> {
}
