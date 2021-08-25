package com.olive.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "Student_tab")
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
	@Id
	@Column(name = "sid")
	private Integer stdId;
	@Column(name = "sname")
	private String stdName;
	@Column(name = "smail")
	private String stdmail;
	@ManyToMany
	@JoinTable(name="stdcrs_tab",
	 joinColumns = @JoinColumn(name="sid_FK"),
	 inverseJoinColumns = @JoinColumn(name="cid"))
	private Set<Course> course;
}
