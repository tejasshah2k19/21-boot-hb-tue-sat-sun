package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(allowSetters = true,value = "password")
public class UserEntity {

	@Id
	@GeneratedValue
	Long userId;

	@NotBlank(message = "Please Enter firstName")
	String firstName;

	@Column(nullable = false, updatable = false)
	String email;
	// jsong ignroe will disable both getters and setters
//	@JsonIgnore 
	
	@JsonProperty(access = Access.WRITE_ONLY)
	String password;

	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	Date createdAt;

//	@CreationTimestamp
//	Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	Date updatedAt;

//	@UpdateTimestamp
//	Date updatedAt;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
