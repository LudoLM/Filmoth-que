package fr.eni.movielibrary.bo;

import java.util.List;

public class Movie {

	private Long id;
	private String title;
	private int year;
	private int duration;
	private String synopsis;
	private Participant director;
	private Genre genre;
	private Member member;
	private List<Participant> actor;
	private List<Opinion> opinions;

	public Movie(long id, String title, int year, int duration, String synopsis) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.synopsis = synopsis;
	}

	public Movie(long id, String title, int year, int duration, String synopsis, Participant director, Genre genre,
			Member member, List<Participant> actor, List<Opinion> opinions) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.synopsis = synopsis;
		this.director = director;
		this.genre = genre;
		this.member = member;
		this.actor = actor;
		this.opinions = opinions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setActor(List<Participant> actor) {
		this.actor = actor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Participant getDirector() {
		return director;
	}

	public void setDirector(Participant director) {
		this.director = director;
	}

	public List<Participant> getActor() {
		return actor;
	}

	public void setActors(List<Participant> actor) {
		this.actor = actor;
	}

	public List<Opinion> getOpinions() {
		return opinions;
	}

	public void setOpinions(List<Opinion> opinions) {
		this.opinions = opinions;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", duration=" + duration + ", synopsis="
				+ synopsis + ", director=" + director + ", genre=" + genre + ", member=" + member + ", actor=" + actor
				+ ", opinions=" + opinions + "]";
	}

}
