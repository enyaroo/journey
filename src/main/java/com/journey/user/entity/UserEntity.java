package com.journey.user.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name="user")
@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="loginId")
	private String loginId;
	
	private String password;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="userProfileImage")
	private String userProfileImage;
	
	@Column(name="userIntroduce")
	private String userIntroduce;
	
	@Column(name="userMainImage")
	private String userMainImage;
	
	@UpdateTimestamp
	@Column(name="createdAt", updatable=false)
	private ZonedDateTime createdAt;
	
	@UpdateTimestamp
	@Column(name="updatedAt")
	private ZonedDateTime updatedAt;
}
