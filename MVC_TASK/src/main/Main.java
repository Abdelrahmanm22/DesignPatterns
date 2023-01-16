package main;

import Controller.controller;
import Model.CommentModel;
import Model.PostModel;
import View.Facebook;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostModel post = new PostModel("Abdelrahman","Iam happy");
		controller c =new controller(post);
		
		c.updatePost(new CommentModel("Mohamed","habiby"));
		
		Facebook view = new Facebook();
		view.print(post);
	}

}
