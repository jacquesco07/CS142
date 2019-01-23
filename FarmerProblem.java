
public class FarmerProblem {

	/**
	 * Models a move in the Farmer Problem. The farmer is assumed to be moving. Print an error message if the move is not allowed. Print "You win" if the move results in a winning condition.
	 * @param wolfBefore Position of the wolf before the move (1 = left hand side, 2 = right hand side)
	 * @param goatBefore Position of goat in before picture
	 * @param cabbageBefore
	 * @param farmerBefore Position of farmer/boat in before picture
	 * @param wolfAfter Position of the wolf after the move
	 * @param goatAfter
	 * @param cabbageAfter
	 * @return True if the move is allowed, false if not
	 */
	public static boolean isMoveAllowed(int wolfBefore, int goatBefore, int cabbageBefore, int farmerBefore, int wolfAfter, int goatAfter, int cabbageAfter) {
		// 1. Only move one object at a time in the boat. 
		// (Only one thing should change between the before and after pictures.)
		int tallyMoving = 0;
		// (If the thing changes, it starts on the same side as the farmer.)
		// (The farmer's side should change.)
		// Is the wolf changing position?
		if (wolfBefore != wolfAfter) {
			tallyMoving = tallyMoving + 1;
			if (wolfBefore != farmerBefore) {
				// Wolf is moving but not with the boat
				System.out.println("Wolf must move with the boat!");
				return false;
			}
		}
		// Change the block of code to refer to goat
		// Is the goat changing position?
		if (goatBefore != goatAfter) {
			tallyMoving = tallyMoving + 1;
			if (goatBefore != farmerBefore) {
				// Goat is moving but not with the boat
				System.out.println("Goat must move with the boat!");
				return false;
			}
		}	
		// Is the cabbage changing position?
		if (cabbageBefore != cabbageAfter) {
			tallyMoving = tallyMoving + 1;
			if (cabbageBefore != farmerBefore) {
				//Cabbage is moving but not with the boat
				System.out.println("Cabbage must move with the boat!");
				return false;
			}
		}
		// After we've checked all three items to see if they are moving, we will know if too many are moving.
		if (tallyMoving > 1) {
			System.out.println("You can only move one thing along with the farmer at a time!");
			return false;
		}
		//2. Nothing can be eaten.
		//a) Wolf should not be left alone with the goat. (After picture should not have wolf and goat on a different side from the farmer.)
		// 3 - 2 = 1
		// 3 - 1 = 2
		// farmerAfter is opposite side of farmerBefore
		int farmerAfter = 3 - farmerBefore;
		if (wolfAfter == goatAfter && farmerAfter != wolfAfter) {
			System.out.println("The wolf will eat the goat!");
		}
		//b) Goat should not be left alone with the cabbage.
		if (goatAfter == cabbageAfter && farmerBefore == cabbageAfter) {
			System.out.println("The goat ate the cabbage!");
			return false;
		}
		// Note that if farmerBefore is with the goat's after,
		// farmerAfter would be away from the goat's after.
		
		if (goatBefore == cabbageBefore) {
			System.out.println("The goat ate the cabbage!");
			return false;
		}
	
		//3. If everything (wolf, goat, cabbage, farmer, boat) is on the right side, win!
		if (wolfAfter == 2 && goatAfter == 2 && cabbageAfter == 2 && farmerAfter ==2) {
			System.out.println("You win!");
			return true;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
