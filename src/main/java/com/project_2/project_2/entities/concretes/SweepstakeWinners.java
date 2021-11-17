package com.project_2.project_2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name="sweeepstakewinners")
public class SweepstakeWinners {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="users_id")
	private int usersId;
	
	@Column(name="comments")
	private String comments;
		
}
