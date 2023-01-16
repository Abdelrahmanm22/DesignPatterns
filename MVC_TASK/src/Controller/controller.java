package Controller;

import Model.CommentModel;
import Model.PostModel;

public class controller {
	private PostModel post;
	
	
	public controller(PostModel post) {
		super();
		this.post = post;
	}


	public void updatePost(CommentModel comment) {
		post.addComment(comment);
	}
}
