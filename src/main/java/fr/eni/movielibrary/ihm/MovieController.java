package fr.eni.movielibrary.ihm;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;

@Component("movieBean")
public class MovieController {

	MovieService movieService;

	public MovieController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}

	public Movie findMovie(int i) {
		return movieService.getMovieById(i);
	}

	public List<Movie> showAllMovies() {
		// TODO Auto-generated method stub
		return movieService.getAllMovies();
	}

}
