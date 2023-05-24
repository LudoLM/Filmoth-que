package fr.eni.movielibrary.bo;

public class Opinion {

	private int note;
	private String comment;

	public Opinion(int note, String comment) {
		super();
		this.note = note;
		this.comment = comment;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
