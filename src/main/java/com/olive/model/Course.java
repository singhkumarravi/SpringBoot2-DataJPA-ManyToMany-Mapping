package com.olive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "course_tab")
@AllArgsConstructor
@RequiredArgsConstructor
public class Course {
	@Id
	@Column(name = "cid")
	private Integer courseId;
	@Column(name = "cname")
	private String courseName;
	@Column(name = "cfees")
	private Double courseFees;
}
