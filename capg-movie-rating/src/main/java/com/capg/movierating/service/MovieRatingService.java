package com.capg.movierating.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.movierating.model.MovieRating;
import com.capg.movierating.repo.MovieRatingRepo;

@Service
public class MovieRatingService {
	
	
    @Autowired
	MovieRatingRepo  movieRatingRepo;
    
	public MovieRating getMovieRatingById(int id){
		
		return movieRatingRepo.findById(id).get();
	}
}
