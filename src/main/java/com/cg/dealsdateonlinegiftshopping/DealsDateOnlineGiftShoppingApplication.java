package com.cg.dealsdateonlinegiftshopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dealsdateonlinegiftshopping.dao.UserDao;
import com.cg.dealsdateonlinegiftshopping.entity.User;
import com.cg.dealsdateonlinegiftshopping.entity.User.login;
import com.cg.dealsdateonlinegiftshopping.entity.User.type;


@SpringBootApplication
public class DealsDateOnlineGiftShoppingApplication{

	@Autowired
public static void main(String[] args) {
	SpringApplication.run(DealsDateOnlineGiftShoppingApplication.class, args);
}
//	@Autowired
//  private UserDaoInterface userRepo;
//	public void run(String... args) throws Exception {
//	
//	User user1 = new User();
//	user1.setFirstname("vijay");
//	user1.setPassword("vijay123");
//	user1.setPhoneNumber("9493988488");
//	user1.setEmail("vijay@gmail.com");
//	user1.setConfirmPassword("vijay123");
//	user1.setLastname("Kumbam");
//	user1.setUserType(type.admin);
//	user1.setLoginStatus(login.LoggedIn);
//	userRepo.signUp(user1);
//}
}
