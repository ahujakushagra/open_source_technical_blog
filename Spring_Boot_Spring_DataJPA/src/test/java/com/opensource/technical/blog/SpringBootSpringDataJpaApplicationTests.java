package com.opensource.technical.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootSpringDataJpaApplicationTests {
	
	@InjectMocks
	SpringBootSpringDataJpaApplication app;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void main() {
		String [] ary = {"start"};
		app.main(ary);
	}

}

