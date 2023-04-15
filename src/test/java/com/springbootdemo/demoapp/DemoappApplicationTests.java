package com.springbootdemo.demoapp;

import com.springbootdemo.demoapp.ProfileRestController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;


@SpringBootTest
class DemoappApplicationTests {

	@Test
	void ProfileRestControllerTest() {
		assertNotNull(ProfileRestController.Profile());
	}

}
