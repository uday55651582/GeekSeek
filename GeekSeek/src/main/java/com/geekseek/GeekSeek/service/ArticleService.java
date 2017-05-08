package com.geekseek.GeekSeek.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekseek.GeekSeek.model.Article;
import com.geekseek.GeekSeek.repository.ArticleRepository;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	
	 public void save(Article article) {
		 System.out.println(".........."+article.getArticle_author());
	        articleRepository.save(article);   	      
	    }
	 
		public List<Article> findbyowner(String emailid) {
			List<Article>articlelist=new ArrayList<Article>();
				for(Article x:articleRepository.findAll())
				{
					if(x.getArticle_author().equalsIgnoreCase(emailid))
					{
						articlelist.add(x);
					}
				}
			
		return articlelist;
		
		}


}
