package com.techtalentsouth.techtalentblog.blogpost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {
	//Id (Primary Key)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	//Title of the blog post
	private String title;
	
	//Author
	private String author;
	
	//Blog Entry itself.
	private String blogEntry;
	
	//In order for BlogPost to work with the JPA and be stored...there is 
	//a requirement that there has to be a default(empty) constructor.
	public BlogPost()
	{
		super();
	}

	public BlogPost(String title, String author, String blogEntry) {
		super();
		this.title = title;
		this.author = author;
		this.blogEntry = blogEntry;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "BlogPost [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
	}		
}
