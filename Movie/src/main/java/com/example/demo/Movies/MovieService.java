package com.example.demo.Movies;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
    @Autowired
	movieRepo movieRepository;
	List<Movie> movies = new ArrayList<>( Arrays.asList(
			new Movie("avenger","Avengers Endgame","Watch Ironman in Action."),
			new Movie("kgf","KGF Chapter2","A young Kid ruling gold Mines."),
			new Movie("karate","Karate Kid 2","A boy learns karate.")
			));
	
	
	public List<Movie> getAllMovies(){
		ArrayList<Movie> moviearr=new ArrayList<>();
		movieRepository.findAll().forEach(moviearr::add);
	return moviearr;	
	}


	public Optional<Movie> getMovie(String id) {
		return movieRepository.findById(id);
	}

	public void addMovie(Movie m) {
		movieRepository.save(m);
	}


	public void updateMovie(Movie mov, String id) {
		
		// Alogrithm.
		// Traverse Through all Movies(list) and compare each movie id with the given id.
		// if the id matches with existing movie id update the movie with the
		// movie data provided by client.
		
		movieRepository.save(mov);
			}
		
		
		
	


	public void deleteMovie(String id) {
		// TODO Auto-generated method stub
		movieRepository.deleteById(id);
	}
	
}




