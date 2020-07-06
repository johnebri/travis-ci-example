package com.johnebri.traviscicd;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.johnebri.traviscicd.controller.HomeController;

@WebMvcTest(HomeController.class)
@RunWith(SpringRunner.class)
class TravisCiCdApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testWelcome() throws Exception {
		mockMvc.perform(get("/hello")).andExpect(status().isOk());
	}

}
