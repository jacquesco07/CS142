
public class Dimensional_Analysis {

	/*public static void main(String[] args) {
		This one is on the exercise sheet.
		double secondsTraveled = 20;
		double secondsPerMinute = 60;
		double hoursPerMinute = 1.0/60;
		double milesPerHour = 15;
		double feetPerMile = 5280;
		double feetCovered = secondsTraveled / secondsPerMinute * hoursPerMinute * milesPerHour * feetPerMile;
		System.out.println("The bicycle will cover "+feetCovered+" feet.");

		}*/


	public static double unknownWireWeight (double lenghtOfWireInInches) {
		//Sample exercises on exercise sheet.
		double wireWeightPerFoot = 19.8/1000;
		double inchesPerFoot = 12;
		double ouncesPerPound = 16;
		double weight = wireWeightPerFoot * ouncesPerPound / inchesPerFoot;
		return weight;
		
}
	
	
	public static void main(String[] args) {
		System.out.println("The wire would weigh "+unknownWireWeight(18)+" ounces.");
	}
}	