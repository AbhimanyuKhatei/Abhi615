package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Movie;
import com.nit.service.IMovieMgmtService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	@Autowired
	private IMovieMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		
		Movie movie=new Movie();
		movie.setMname("RRR");
		movie.setDate("2022");
		movie.setRating(4.5f);
		try {
			System.out.println(service.registerMovie(movie));
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
