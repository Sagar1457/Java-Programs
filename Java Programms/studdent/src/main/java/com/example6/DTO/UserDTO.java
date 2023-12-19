package com.example6.DTO;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserDTO 
{
	  private Integer userId;
	   
	   private String userName;
	   
	   private String password;
}
