import java.util.Scanner;

public class ProblemSet3 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();
		ps3.dateFashion(0, 0);
		ps3.fizzString("fb");
		ps3.squirrelPlay(0, true);
		ps3.fizzStringAgain(0);
		ps3.makeBricks(0, 0, 0);
		ps3.loneSum(0, 0, 0);
		ps3.luckySum(0, 0, 0);
		ps3.factorialFor(0);
		ps3.factorialWhile(0);
		ps3.isPrime(0);
		in.close();
	}
	
	/*
	 * You and your date are trying to get a table at a restaurant. The
	 * parameter "you" is the stylishness of your clothes, in the range
	 * 0..10, and "date" is the stylishness of your date's clothes. The
	 * result getting the table is encoded as an int value with (0 = no,
	 * 1 = maybe, 2 = yes). If either of you is very stylish, 8 or more,
	 * then the result is 2 (yes). With the exception that if either of
	 * you has style of 2 or less, then the result is 0 (no). Otherwise
	 * the result is 1 (maybe). Print YES, NO, or MAYBE. Nothing more,
	 * nothing less.
	 * 
	 * dateFashion(5, 10) â†’ YES
	 * dateFashion(5, 2) â†’ NO
	 * dateFashion(5, 5) â†’ MAYBE
	 */
	
	public void dateFashion(int you, int date) {
		System.out.println("Rate your style from 1-10.");
		you = in.nextInt();
		System.out.println("Rate your date's style from 1-10.");
		date = in.nextInt();
		in.nextLine();
		if (you <= 2 || date <= 2) {
			System.out.println("NO");
		} else if (you >= 8 || date >= 8) {
			System.out.println("YES");
		} else {
			System.out.println("MAYBE");
		}
	}
	
	/*
	 * Given a string str, if the string starts with "f" print FIZZ.
	 * If the string ends with "b" print BUZZ. If both the "f" and "b"
	 * conditions are true, print FIZZBUZZ. In all other cases, print
	 * the string unchanged.
	 * 
	 * fizzString("fig") â†’ FIZZ
	 * fizzString("dib") â†’ BUZZ
	 * fizzString("fib") â†’ FIZZBUZZ
	 */
	
	public void fizzString(String str) {
		System.out.println("Please enter a string.");
		str = in.nextLine();
		if (str.charAt(0) == 'f' || str.charAt(0) == 'F') {
			if (str.charAt(str.length()-1) == 'b' || str.charAt(str.length()-1) == 'B') {
				System.out.println("FIZZBUZZ.");
			} else {
				System.out.println("FIZZ.");
			}
		} else if (str.charAt(str.length()-1) == 'b' || str.charAt(str.length()-1) == 'B') {
			System.out.println("BUZZ.");
		} else {
			System.out.println(str);
		}
	}
	
	/*
	 * The squirrels in Palo Alto spend most of the day playing. In particular,
	 * they play if the temperature is between 60 and 90 (inclusive). Unless it
	 * is summer, then the upper limit is 100 instead of 90. Given an int
	 * temperature and a boolean isSummer, print YES if the squirrels play and
	 * NO otherwise.
	 * 
	 * squirrelPlay(70, false) â†’ YES
	 * squirrelPlay(95, false) â†’ NO
	 * squirrelPlay(95, true) â†’ YES
	 */
	
	public void squirrelPlay(int temp, boolean isSummer) {
		System.out.println("What is the temperature?");
		temp = in.nextInt();
		System.out.println("It is summer. (Respond 'true' or 'false')" );
		isSummer = in.nextBoolean();
		in.nextLine();
		if (isSummer = true) {
			if (temp <= 100 && temp >= 60) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else if (isSummer = false) {
			if (temp <= 90 && temp >= 60) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	
	/*
	 * Given an int n, print the string form of the number followed by "!". So the
	 * int 6 yields "6!". Except if the number is divisible by 3 print FIZZ instead of
	 * the number; if the number is divisible by 5 print BUZZ; if divisible by
	 * both 3 and 5, print FIZZBUZZ.
	 * 
	 * fizzStringAgain(1) â†’ 1!
	 * fizzStringAgain(2) â†’ 2!
	 * fizzStringAgain(3) â†’ FIZZ!
	 */
	
	public void fizzStringAgain(int n) {
		System.out.println("Pick an integer.");
		n = in.nextInt();
		in.nextLine();
		if (n % 3 == 0) {
			if (n % 5 == 0) {
			System.out.println("FIZZBUZZ!");
			} else {
				System.out.println("FIZZ!");
			}
		} else if (n % 5 == 0) {
			System.out.println("BUZZ!");
		} else {
			System.out.println(n + "!");
		}
	}
	
	/*
	 * We want to make a row of bricks that is goal inches long. We have a number of small
	 * bricks (1 inch each) and big bricks (5 inches each). Print YES if it is possible
	 * to make the goal by choosing from the given bricks, otherwise print NO. This is a
	 * little harder than it looks and can be done without any loops.
	 * 
	 * makeBricks(3, 1, 8) â†’ YES
	 * makeBricks(3, 1, 9) â†’ NO
	 * akeBricks(3, 2, 10) â†’ YES
	 */
	
	public void makeBricks(int small, int big, int goal) {
		System.out.println("How many small bricks do you have?");
		small = in.nextInt();
		System.out.println("How many big bricks do you have?");
		big = in.nextInt();
		System.out.println("How long would you like your row to be? (in inches)");
		goal = in.nextInt();
		in.nextLine();
		if (small < 0 || big < 0 || goal <= 0) {
			System.out.println("Please enter positive values.");
		}
		while (goal >= 5 && big > 0) {
			goal -= 5;
			big--;
		}
		while (goal >= 1 && small > 0) {
			goal--;
			small--;
		}
		if (goal != 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
	
	/*
	 * Given 3 int values, a b c, print their sum. However, if one of the values is the
	 * same as another of the values, it does not count towards the sum.
	 * 
	 * loneSum(1, 2, 3) â†’ 6
	 * loneSum(3, 2, 3) â†’ 2
	 * loneSum(3, 3, 3) â†’ 0
	 */
	
	public void loneSum(int a, int b, int c) {
		System.out.println("Please state 3 integers, one on each line.");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		in.nextLine();
		if (a == b && b == c) {
			System.out.println("0");
		} else if (a == b) {
			System.out.println(c);
		} else if (b == c) {
			System.out.println(a);
		} else if (a == c) {
			System.out.println(b);;
		} else {
			System.out.println(a + b + c);
		}
	}
	
	/*
	 * Given 3 int values, a b c, return their sum. However, if one of the values is 13
	 * then it does not count towards the sum and values to its right do not count. So for
	 * example, if b is 13, then both b and c do not count.
	 * 
	 * luckySum(1, 2, 3) â†’ 6
	 * luckySum(1, 2, 13) â†’ 3
	 * luckySum(1, 13, 3) â†’ 1
	 */
	
	public void luckySum(int a, int b, int c) {
		System.out.println("Please state 3 integers, one on each line.");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if (a == 13) {
			System.out.println("0");
		} else if (b == 13) {
			System.out.println(a);
		} else if (c == 13) {
			System.out.println(a+b);
		} else {
			System.out.println(a+b+c);
		}
	}
	
	/*
	 * Given an integer value, n, compute the factorial of n. You are required to use a
	 * for loop to solve this exercise.
	 * 
	 * factorialFor(3) â†’ 6
	 * factorialFor(4) â†’ 24
	 * factorialFor(5) â†’ 120
	 */
	
	public void factorialFor(int n) {
		System.out.println("Please select an integer.");
		n = in.nextInt();
		in.nextLine();
		int num = 1;
		for (; n >= 1; n--) {
			num *= n;
		}
		if (n < 1){
			System.out.println("Please enter a number greater than 0.");
		} else {
		System.out.println(num);
		}
	}
	
	/*
	 * Given an integer value, n, compute the factorial of n. You are required to use a
	 * while loop to solve this exercise. Your method should print n! = y (where n is the
	 * input and y is the output). Nothing more, nothing less.
	 * 
	 * factorialWhile(3) â†’ 6
	 * factorialWhile(4) â†’ 24
	 * factorialWhile(5) â†’ 120
	 */
	
	public void factorialWhile(int n) {
		System.out.println("Please select an integer.");
		n = in.nextInt();
		in.nextLine();
		int num = 1;
		while (n >= 1) {
			num *= n;
			n--;
		}
		if (n < 1){
			System.out.println("Please enter a number greater than 0.");
		} else {
		System.out.println(num);
		}
	}
	
	/*
	 * Given an integer value, n, determine whether or not n is a prime number. Your method
	 * should either print PRIME or NOT PRIME. Nothing more, nothing less.
	 * 
	 * isPrime(11) â†’ YES
	 * isPrime(17) â†’ YES
	 * isPrime(112) â†’ NO
	 */
	
	public void isPrime(int n) {
		System.out.println("Please enter an integer.");
		n = in.nextInt();
		int rem = 1;
		int num = n - 1;
		while (num > 1 && rem != 0) {
			rem = n % num;
			num--;
		}
		if (rem == 0 || n == 0 || n == 1) {
			System.out.println("NOT PRIME");
		} else {
			System.out.println("PRIME");
		}
	}
}
