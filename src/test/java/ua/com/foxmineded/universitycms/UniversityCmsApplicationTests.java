package ua.com.foxmineded.universitycms;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class UniversityCmsApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}

}
