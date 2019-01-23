
public class HoppyBeverage {

	public static int pouchesOfHops (double gallons) {
		int ouncesOfHopsNeededPerGallon = 3;
		int ouncesOfHopsInBag = 2;
		int pouchesOfHops = (int)Math.ceil(gallons * ouncesOfHopsNeededPerGallon / ouncesOfHopsInBag);
		return pouchesOfHops;
	}
	
	public static double poundsOfMalt (double gallons) {
		double poundsOfMaltNeededPerGallon = 2.5;
		double poundsOfMalt = gallons * poundsOfMaltNeededPerGallon;
		return poundsOfMalt;
	}
	
	public static int packetsOfYeast (double gallons) {
		double packetsOfYeastPerGallon = .2;
		int packetsOfYeast = (int)Math.ceil(gallons * packetsOfYeastPerGallon); 
		return packetsOfYeast;
	}
	
	public static double totalCost (double gallons) {
		double priceOfHopsPerBag = 3.99;
		double priceOfMaltPerPound = 1.50;
		double priceOfYeastPerPacket = 2.59;
		double totalHopsCost = pouchesOfHops(gallons) * priceOfHopsPerBag;
		double totalMaltCost = poundsOfMalt(gallons) * priceOfMaltPerPound;
		double totalYeastCost = packetsOfYeast(gallons) * priceOfYeastPerPacket;
		double totalCost = totalHopsCost + totalMaltCost + totalYeastCost;
		return totalCost;
	}
	
	
	public static void main(String[] args) {
		double myGallons = 15;
		System.out.println(totalCost(myGallons));
		
	}

}
