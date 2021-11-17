package com.project_2.project_2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usersvote")
public class UsersVote {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="users_id")
	private int usersId;
	
	@Column(name="subject_options_id")
	private int subjectOptionsId;
	
	@Column(name="added_at")
	private char addedAt;
}
