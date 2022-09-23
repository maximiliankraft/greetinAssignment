package at.spengergasse.spengermed;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@SpringBootTest
@AutoConfigureMockMvc
class SpengermedApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void testGreeting() throws Exception {

		String testName = " Hößmüller";

		mockMvc
				.perform(get(String.format("/hello/%s", testName))) // perform request
				.andExpect(status().isOk()) // check for 200 status code
				.andExpect(content().string(equalTo(String.format("Hello, %s", testName)))); // check contents
	}

}
