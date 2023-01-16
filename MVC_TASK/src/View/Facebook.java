package View;
import Model.PostModel;
public class Facebook {

	public void print(PostModel post) {
		System.out.println(post.getName()+" posted: "+post.getPost());
		System.out.println("number of comments: "+ post.getComments().size());
		if(post.getComments().size()>0) {
			for(int i=0;i<post.getComments().size();i++) {
				System.out.println(post.getComments().get(i).getCommenter()+" commented: "+post.getComments().get(i).getComment());
			}
		}
	}
}
