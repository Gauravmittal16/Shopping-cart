package com.stu.demo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.stu.demo.model.Candidate;
import com.stu.demo.service.CandidateService;

@CrossOrigin(origins= "http://localhost:4200")
@Controller
public class SiteController 
{
	@Autowired
	CandidateService candidateService;
	
	@RequestMapping("/")
	public String homepage()
	{
		return "homepage.jsp";
	}
	
	@RequestMapping(value="/addProduct",method= {RequestMethod.POST,RequestMethod.GET})
	public String addCandidate(@RequestBody Candidate candidate)
	{
		return candidateService.saveCandidate(candidate);
	}
	@RequestMapping("/products")
	@ResponseBody
	public List<Candidate> getCandidates()
	{
		return candidateService.getCandites();
	}
	@RequestMapping("/products/{id}")
	@ResponseBody
	public Candidate getCandidate(@PathVariable("id") int id)
	{
		return candidateService.getCandet(id);
	}
	
	@RequestMapping(value="/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String updateCandidate(@RequestBody Candidate candidate)
	{
		return candidateService.UpdateCandidate(candidate);
	}
	
	@RequestMapping(value="/delete/{id}", method={RequestMethod.DELETE,RequestMethod.GET})
	@ResponseBody
	public ResponseEntity<String> deleteCandidate(@PathVariable("id") int id)
	{
		//return candidateService.deleteCandidate(id);
		return new ResponseEntity<String>("Deleted",HttpStatus.OK);
	}

}
