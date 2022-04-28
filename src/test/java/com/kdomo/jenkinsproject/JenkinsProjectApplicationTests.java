package com.kdomo.jenkinsproject;

import com.kdomo.jenkinsproject.Controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class JenkinsProjectApplicationTests {


	@Test
	public void 테스트() throws Exception{
		String hello = "hello";
		assertThat("hello").isEqualTo(hello);
	}

	@Test
	public void 테스트2() throws Exception{
		String hello2 = "hello2";
		assertThat("hello2").isEqualTo(hello2);
	}
}
