package Model;

public class CommentModel {
	String commenter;
	String comment;
	public CommentModel(String commenter, String comment) {
		super();
		this.commenter = commenter;
		this.comment = comment;
	}
	public String getCommenter() {
		return commenter;
	}
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
