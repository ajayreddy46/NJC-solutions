package com.example.REST.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user_manager {
	
	@Id
	@GeneratedValue
	
	@Column(name="tutorial_id")
	private int tutorial_id;
	
	@Column(name="tutorial_title")
	private String tutorial_title;
	
	@Column(name="tutorial_author")
	private String tutorial_author;
	
	
	public user_manager() {
		
	}


	public int getTutorial_id() {
		return tutorial_id;
	}


	public void setTutorial_id(int tutorial_id) {
		this.tutorial_id = tutorial_id;
	}


	public String getTutorial_title() {
		return tutorial_title;
	}


	public void setTutorial_title(String tutorial_title) {
		this.tutorial_title = tutorial_title;
	}


	public String getTutorial_author() {
		return tutorial_author;
	}


	public void setTutorial_author(String tutorial_author) {
		this.tutorial_author = tutorial_author;
	}
	
	
	
	
	

}