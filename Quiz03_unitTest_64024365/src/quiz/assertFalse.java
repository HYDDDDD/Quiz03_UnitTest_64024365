package quiz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class assertFalse {
	QuizOneJunit test = new QuizOneJunit();

	boolean result3 = test.checkTwoLetter("AABFFDCAA");

	@After
	public void runAfter() {
		System.out.println("runnerAfter");
	}

	@Before
	public void runBefore() {
		System.out.println("runnerBefore");
	}

	@Test
	public void runTest03() {
		System.out.println("test03");
		assertFalse("AABCAA", (result3));
	}
}
