package com.aashish.joblisting.repository;

import com.aashish.joblisting.model.Post;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
