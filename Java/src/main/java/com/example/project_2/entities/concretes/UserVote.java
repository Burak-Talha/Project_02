package com.example.project_2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usersvote")
public class UserVote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="users_id")
	private int usersId;
	
	@Column(name="subject_options_id")
	private int subjectOptionsId;
	
	@Column(name="added_at")
	private LocalDateTime addedAt;
}