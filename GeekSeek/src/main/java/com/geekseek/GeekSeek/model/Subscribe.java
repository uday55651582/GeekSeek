package com.geekseek.GeekSeek.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subscribe")
public class Subscribe {
	private String emailid;
	private int subscribe_id;

	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getSubscribe_id() {
		return subscribe_id;
	}
	public void setSubscribe_id(int subscribe_id) {
		this.subscribe_id = subscribe_id;
	}

}
