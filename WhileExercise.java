
public class WhileExercise {
	
	// Write a method that prints
	// count-many multiples of a number n
	// For example, if n is 3, and count is 5
	// print 3, 6, 9, 12, 15
	// If n is 4 and count 3,
	// print 4, 8, 12
	
	public static void multiples (int n, int count) {
		// Fill this in!
		// You may need to declare a variable!
		// You probably shouldn't modify n!
		int numbers = n * count + 1;
		int number = n;
		while (number < numbers) {
			System.out.println(number);
		number = number + n;
		}
		System.out.println("End");
	}

	public static void main(String[] args) {
		multiples(4, 20);

	}

}
