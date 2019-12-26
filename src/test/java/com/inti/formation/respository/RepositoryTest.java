package com.inti.formation.respository;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.inti.formation.entity.User;
import com.inti.formation.repository.UserRepository;

@DataJpaTest
@RunWith(SpringRunner.class)
public class RepositoryTest {
	
	@Autowired
	TestEntityManager testEntityManager;
	
	@Autowired
	UserRepository userRepo;
	
	@Test
	public void  saveTest() {
		
		User user = new User(8, "test");
		
		testEntityManager.persist(user);
		
		User fromDb = userRepo.getOne(user.getId());
		
		assertThat(fromDb).isEqualTo(user);
	}

}
