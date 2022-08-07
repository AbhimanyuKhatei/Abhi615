package com.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Movie {
	@Id
	@Column(name="MID")
	@NonNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer mid;
	@Column(name="MNAME",length = 20)
	@NonNull
	private String mname;
	@Column(name="DATE",length = 20)
	@NonNull
	private String date;
	@Column(name="RATING")
	@NonNull
	private Float rating;
	
	
}
