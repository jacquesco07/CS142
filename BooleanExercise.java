
public class BooleanExercise {

/*	public static boolean isDozen(int amount) {
		// Update to work with either 12 or 13
		
		return amount == 12 || amount == 13;
		
	}
	
	public static void main(String[] args) {
		System.out.println(isDozen(10)); // false
		System.out.println(isDozen(12)); // true
		System.out.println(isDozen(13)); // true
		System.out.println(isDozen(14)); // false
	}
*/
	
/*	public static boolean dogIsHappy (boolean fed, boolean walked, boolean playedWith) {
		return fed && (walked || playedWith);
		
	}
	
	public static void main(String[] args) {
		System.out.println(dogIsHappy(true, true, true)); 		// true
		System.out.println(dogIsHappy(true, false, true)); 		// true
		System.out.println(dogIsHappy(false, true, true));		// false
		System.out.println(dogIsHappy(false, false, false));	// false
		System.out.println(dogIsHappy(true, true, false));		// true
		
	}
*/
	public static boolean isInSquare (int x, int y) {
		return (x >= 0 && x <= 10) && (y >= 0 && y <= 10);
	}
	
	public static void main(String[] args) {
		System.out.println(isInSquare(5, 9));			// true
		System.out.println(isInSquare(3, 7));			// true
		System.out.println(isInSquare(10, 10));			// true
		System.out.println(isInSquare(-1, 7));			// false
		System.out.println(isInSquare(5, -9));			// false
		System.out.println(isInSquare(-5, -5));			// false
	} 
}
