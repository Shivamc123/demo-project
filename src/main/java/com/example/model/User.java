package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String firstName;
	private String lastname;
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastname=" + lastname + "]";
	}
	
}
