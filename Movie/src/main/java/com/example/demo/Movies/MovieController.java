package com.example.demo.Movies;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello From SpringBoot";
	}
	// Method to List All Movies
	// (List) Operation
	@RequestMapping("/movie")
	public List<Movie> getMovies(){
		return movieService.getAllMovies();
	}
	
	// let us define a method that fetches a particular given movie by ID
	// (Search) Operation
	@RequestMapping("/movie/{id}")
	public Optional<Movie> getMovieById(@PathVariable String id) {
		return movieService.getMovie(id);
	}
	
	//let us define a function that adds the movie into Movies List
	// (Add) Operation
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST,value="/movie")
	public void addMovie(@RequestBody Movie mov) {
		movieService.addMovie(mov);
	}
	
	
	// This Function Contains the Logic to update the Movie Details.
	//(Update) Operation
	
	@RequestMapping(method=RequestMethod.PUT,value="/movie/{id}")
	public void updateMovie(@RequestBody Movie mov ,@PathVariable String id) {
		
		movieService.updateMovie(mov,id);
	}
	
	
	// This Function Explains the Programming Logic to Delete the Movie Details
	// (Delete) Operation
	
	@RequestMapping(method=RequestMethod.DELETE,value="/movie/{id}")
	public void deleteMovie(@PathVariable String id) {
		movieService.deleteMovie(id);
	}
	
	
}





