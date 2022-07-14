package com.example.demo.Movies;
import org.springframework.data.repository.*;
public interface movieRepo extends CrudRepository<Movie,String> {

}
