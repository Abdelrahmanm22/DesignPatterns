package Model;

import java.util.ArrayList;

public class PostModel {
	String postWriter;
	String post;
	ArrayList<CommentModel> comments;
	public PostModel(String name, String post) {
		super();
		this.postWriter = name;
		this.post = post;
		comments =new ArrayList<CommentModel>();
	}
	public String getName() {
		return postWriter;
	}
	public void setName(String name) {
		this.postWriter = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public ArrayList<CommentModel> getComments() {
		return comments;
	}
	public void setComments(ArrayList<CommentModel> comments) {
		this.comments = comments;
	}
	public void addComment(CommentModel c) {
		comments.add(c);
	}
}
