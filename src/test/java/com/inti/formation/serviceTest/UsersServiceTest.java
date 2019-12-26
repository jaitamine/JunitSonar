package com.inti.formation.serviceTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.inti.formation.entity.User;
import com.inti.formation.repository.UserRepository;
import com.inti.formation.service.IUserService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UsersServiceTest {

	@Autowired
	IUserService userService;
	
	@MockBean
	UserRepository userRepo;
	
	
	public void getALLTest() {
		
		when(userRepo.findAll()).thenReturn(Stream.of(new User(1,"user1"), new User(2,"user2")).collect(Collectors.toList()));
		
		assertEquals(2, userService.getAll().size());

	}
}
