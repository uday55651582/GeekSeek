package com.geekseek.GeekSeek.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Contact {
	private int contact_id;
	private String contact_loginuser;
	private String contact_name;
	private String contact_emailid;
	private String contact_title;
	private String contact_subject;
	
	public String getContact_loginuser() {
		return contact_loginuser;
	}
	public void setContact_loginuser(String contact_loginuser) {
		this.contact_loginuser = contact_loginuser;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_emailid() {
		return contact_emailid;
	}
	public void setContact_emailid(String contact_emailid) {
		this.contact_emailid = contact_emailid;
	}
	public String getContact_title() {
		return contact_title;
	}
	public void setContact_title(String contact_title) {
		this.contact_title = contact_title;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public String getContact_subject() {
		return contact_subject;
	}
	public void setContact_subject(String contact_subject) {
		this.contact_subject = contact_subject;
	}
}
