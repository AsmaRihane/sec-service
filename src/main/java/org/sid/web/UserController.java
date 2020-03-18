package org.sid.web;

import org.sid.entities.AppUser;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
public class UserController {
	@Autowired
	private AccountService accountService;
	@PostMapping("/register")
	public AppUser register(@RequestBody UserForm userForm) {
		return accountService.saveUser(userForm.getUsername(), userForm.getPassword(), userForm.getConfirmedPaswword());
	}

}
@Data
class UserForm{
	private String username;
	private String password;
	private String confirmedPaswword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmedPaswword() {
		return confirmedPaswword;
	}
	public void setConfirmedPaswword(String confirmedPaswword) {
		this.confirmedPaswword = confirmedPaswword;
	}
	
}