package com.geekseek.GeekSeek.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "article")
public class Article {
	private int article_id;
	private String article_author;
	private String article_category;
	private String article_title;
	private String article_filename;
	private String article_link;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getArticle_id() {
		return article_id;
	}
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	public String getArticle_category() {
		return article_category;
	}
	public void setArticle_category(String article_category) {
		this.article_category = article_category;
	}
	public String getArticle_title() {
		return article_title;
	}
	public void setArticle_title(String article_name) {
		this.article_title = article_name;
	}
	public String getArticle_filename() {
		return article_filename;
	}
	public void setArticle_filename(String article_filename) {
		this.article_filename = article_filename;
	}
	public String getArticle_link() {
		return article_link;
	}
	public void setArticle_link(String article_link) {
		this.article_link = article_link;
	}
	public String getArticle_author() {
		return article_author;
	}
	public void setArticle_author(String article_author) {
		this.article_author = article_author;
	}
	
	
}
