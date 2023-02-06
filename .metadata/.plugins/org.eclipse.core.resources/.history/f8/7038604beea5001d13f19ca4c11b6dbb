package quiz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class asserEqual {

	QuizOneJunit test = new QuizOneJunit();

	int word1 = test.countLetterA("Kantamas");
	int word2 = test.countLetterA("AABCAA");

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
		assertEquals(word1, word2);
	}

}
