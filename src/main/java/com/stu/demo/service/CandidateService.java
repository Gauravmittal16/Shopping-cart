package com.stu.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stu.demo.model.Candidate;
import com.stu.demo.repository.CandidateRepo;

@Service
public class CandidateService 
{
	@Autowired
	CandidateRepo candidateRepo;
	
	public List<Candidate> getCandites()
	{
		List<Candidate> cds=new ArrayList<Candidate>();
		candidateRepo.findAll().forEach(cds1->cds.add(cds1));
		return cds;
	}
	
	public Candidate getCandet(int id)
	{
		return candidateRepo.findById(id).get();
	}
	public String saveCandidate(Candidate candidate)
	{
		this.candidateRepo.save(candidate);
		return "saved successfully!";
	}
	
	public void deleteCandidate(int id)
	{
		candidateRepo.deleteById(id);
		
		//return "deleted successfully!";
	}
	
	public String UpdateCandidate(Candidate candidate)
	{
		candidateRepo.save(candidate);
		return "Data Updated successfully!";
	}
}
