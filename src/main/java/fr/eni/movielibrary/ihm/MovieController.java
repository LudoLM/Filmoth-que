package fr.eni.movielibrary.ihm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MovieController {

	@Autowired
	MovieService movieService;

	public MovieController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}


	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("show-movies")
	public String showAllMovies(Model model) {
	model.addAttribute("movies", movieService.getAllMovies());
		return "movie/movie-list";
	}

	@GetMapping("movie/{id}")
	public String movie(@PathVariable("id") int id, Model model) {
		Movie movie = movieService.getMovieById(id);
		model.addAttribute("movie", movie);
		return "movie/movie";
	}

}
