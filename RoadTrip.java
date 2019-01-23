
public class RoadTrip {

	public static void main(String[] args) {
		/*System.out.println("Hello");
		System.out.println(1+2+3);
		//type vName = expr
		int a = 3;
		int b = 5;
		System.out.println(a+a+a);
		System.out.println(a+b);*/
		
		//Let's say we're driving to Canada.
		double gallonsInTank = 5;
		double distanceToCanadaInMi = 200;
		double miPerGal = 30;
		//How much extra gas do we need to drive to Canada?
		double gallonsNeeded = distanceToCanadaInMi / miPerGal - gallonsInTank;
		System.out.println("Gallons needed: "+gallonsNeeded);
		//Alternatively, System.out.println("We need "+gallonsNeeded+" gallons")
	}

}
