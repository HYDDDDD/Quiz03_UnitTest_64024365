package quiz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class assertNull {
	QuizOneJunit test = new QuizOneJunit();

	int word1 = test.countLetterA("Kantamas");

	@After
	public void runAfter() {
		System.out.println("runnerAfter");
	}

	@Before
	public void runBefore() {
		System.out.println("runnerBefore");
	}

	@Test
	public void runTest01() {
		System.out.println("test01");
		assertNull(word1);
	}
}
