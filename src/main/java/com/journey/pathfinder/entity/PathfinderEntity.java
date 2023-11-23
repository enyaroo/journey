package com.journey.pathfinder.entity;

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
@Table(name="pathfinder")
@Entity
public class PathfinderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="userId")
	private int userId;
	
	private String title;
	private String body;
	
	@Column(name="limitDate")
	private ZonedDateTime limitDate;

	private String importance;
	
	@UpdateTimestamp
	@Column(name="createdAt", updatable=false)
	private ZonedDateTime createdAt;
	
	@UpdateTimestamp
	@Column(name="updatedAt")
	private ZonedDateTime updatedAt;
	
}

