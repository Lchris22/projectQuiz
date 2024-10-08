package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Integer> {

}
