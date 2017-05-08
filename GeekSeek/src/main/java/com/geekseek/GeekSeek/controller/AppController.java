package com.geekseek.GeekSeek.controller;

import java.util.*;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.Authentication;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.geekseek.GeekSeek.model.Article;
import com.geekseek.GeekSeek.model.Contact;
import com.geekseek.GeekSeek.model.Subscribe;
import com.geekseek.GeekSeek.model.User;
import com.geekseek.GeekSeek.service.ArticleService;
import com.geekseek.GeekSeek.service.SecurityService;
import com.geekseek.GeekSeek.service.SubscribeService;
import com.geekseek.GeekSeek.service.UserService;
import com.geekseek.GeekSeek.validator.UserValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
 
@Controller
@RequestMapping("/")
public class AppController {
	
	 @Autowired
	    private UserService userService;
	 
	 @Autowired
	 private ArticleService articleService;
	 
	 @Autowired
	 private SubscribeService subscribeService;

	    @Autowired
	    private SecurityService securityService;

	    @Autowired
	    private UserValidator userValidator;
 
    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "home";
    }
 
  /*  @RequestMapping(value = { "/products"}, method = RequestMethod.GET)
    public String productsPage(ModelMap model) {
        return "products";
    }
 
    @RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
    public String contactUsPage(ModelMap model) {
        return "contactus";
    }*/
    
    @RequestMapping(value = "/tourguide", method = RequestMethod.GET)
    public String tourguide(ModelMap model) {

        return "tourguide";
    }
    
    @RequestMapping(value = "/tourgallery", method = RequestMethod.GET)
    public String tourgallery(ModelMap model) {

        return "tourgallery";
    }
    
   /* @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(ModelMap model) {
    	Contact contactForm = new Contact();    
         model.put("contactForm", contactForm);
        return "contact";
    }*/
    

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
     public String contact(ModelMap model) {
         return "contact";
     }
    
    @RequestMapping(value = "/exoticplaces", method = RequestMethod.GET)
    public String exoticplaces(ModelMap model) {

        return "exoticplaces";
    }
    
    @RequestMapping(value = "/AddArticle", method = RequestMethod.GET)
    public String AddArticle(ModelMap model) {
    	Article articleForm = new Article();    
         model.put("articleForm", articleForm);
  	   List<String> categoryList = new ArrayList<String>();
  	   categoryList.add("Travel");
  	   categoryList.add("Food");
  	   categoryList.add("Technology");
  	   categoryList.add("Entertainment");
         model.put("categoryList", categoryList);
        return "AddArticle";
    }
    
    @RequestMapping(value = "/AddArticle", method = RequestMethod.POST)
    @ResponseStatus(value=HttpStatus.OK)
    public String AddArticle1(@ModelAttribute("articleForm") Article article,
            Map<String, Object> model) { 
 	   Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
 	     String currentPrincipalName = authentication.getName();
 	     article.setArticle_author(currentPrincipalName);
 	    articleService.save(article);
        return "home";
    }
    
    @RequestMapping(value ="/myarticles", method = RequestMethod.GET)
    public String myarticles(ModelMap model) {
 	   Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
 	     String currentPrincipalName = authentication.getName();
 	   List<Article> myarticles = articleService.findbyowner(currentPrincipalName);  
 	   System.out.println("printing......." );
 	   model.addAttribute("myarticles", myarticles);
 		return "myarticles";
    }
    
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(ModelMap model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, ModelMap model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }
    
    @RequestMapping(value = "/Subscribe", method = RequestMethod.POST)
    @ResponseStatus(value=HttpStatus.OK)
    public String subscribe(@RequestParam("email") String email) { 
 	    Subscribe subscribe=new Subscribe();
 	    subscribe.setEmailid(email);
 	    System.out.println("................."+subscribe.getEmailid());
    	subscribeService.save(subscribe);
        return "home";
    }

   @RequestMapping(value ="/welcome", method = RequestMethod.GET)
    public String welcome(ModelMap model) {
        return "welcome";
    }
}