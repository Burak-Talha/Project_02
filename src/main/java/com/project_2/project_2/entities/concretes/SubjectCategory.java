package com.project_2.project_2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project_2.project_2.entities.abstracts.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="subjectcategory")
public class SubjectCategory implements Category {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="subject_category")
	private String subjectCategory;
}
