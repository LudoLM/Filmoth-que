package fr.eni.movielibrary.bo;

import java.util.List;

public class Genre {

	private long id;

	public Genre(long id, String label) {
		super();
		this.id = id;
		this.label = label;
	}

	private String label;
	private List<Movie> movies;

	public Genre(String label) {
		super();
		this.label = label;
	}

	public Genre(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
