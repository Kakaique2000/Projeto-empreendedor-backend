package br.com.projetoempregobackend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoempregobackend.model.dto.JobDto;

@RestController
@RequestMapping("/")
public class TestController {

	@GetMapping
	public List<JobDto> getJobs() {
		List<JobDto> jobs = new ArrayList<JobDto>();
		jobs.add(new JobDto(1, "matar pessoas"));
		jobs.add(new JobDto(2, "matador profissional"));
		return jobs;
	}
	
}
