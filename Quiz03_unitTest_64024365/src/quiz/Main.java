package quiz;

public class Main {
	public static void main(String[] args) {
		QuizOneJunit test = new QuizOneJunit();

		int result1 = test.square(10);
		int result2 = test.countLetterA("University of Phayao,Thailand");

		boolean result3 = test.checkTwoLetter("AABCAA");
		System.out.println("Square Area is :" + result1 + "" + "\nNumber of A Letter is : " + result2 + ""
				+ "\nAre two Letter are the same : " + result3);
	}
}
