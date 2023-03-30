package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dto.User;
import service.UserService;

@RestController
@RequestMapping(path = "/api")
public class UserController {

	//private UserService userService = new UserServiceImpl();  BUNU YAZMAK YERİNE, Kİ BU BİR BAĞIMLILIK OLUŞTURUYOR
	
	@Autowired
	private UserService userService;

	@GetMapping(path = "/users/{userId}")
	public User getUserByID(@PathVariable("userId") Long userId) {
		return userService.getUserById(userId);

	}
}
