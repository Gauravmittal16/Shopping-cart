package com.stu.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.stu.demo.model.Candidate;

public interface CandidateRepo extends CrudRepository<Candidate,Integer>
{

}
