package com.nit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Movie;
import com.nit.repository.IMovieRepo;

@Service
public class MovieMgmtServiceImpl implements IMovieMgmtService{
	@Autowired
	private IMovieRepo movieRepo;
	@Override
	public String registerMovie(Movie movie) {
		System.out.println("InMemory Proxy class name::"+movieRepo.getClass()+"..........."+Arrays.toString(movieRepo.getClass().getInterfaces()));
		System.out.println("Before saving "+movie);
		Movie movie1=movieRepo.save(movie);
		System.out.println("After saving "+movie1);
		return "Movie is registered with id ="+movie1.getMid();
	}

}
