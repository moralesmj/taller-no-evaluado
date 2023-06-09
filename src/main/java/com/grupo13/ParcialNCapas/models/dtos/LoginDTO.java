package com.grupo13.ParcialNCapas.models.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO {
	
	
	private String userName;
	@Email
	@NotEmpty
	private String email;
	
	
	private String password;
	//TODO: encrypt password

}
