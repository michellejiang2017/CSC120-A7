/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        // maximum amount of coffee ounces, sugar packets, creams, and cups for the cafe instance.
        this.nCoffeeOunces = nCoffeeOunces; 
        this.nSugarPackets = nSugarPackets; 
        this.nCreams = nCreams; 
        this.nCups = nCups; 
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        this.nCoffeeOunces -= size; 
        this.nSugarPackets -= nSugarPackets; 
        this.nCreams -= nCreams; 
        this.nCups -= 1; 
        System.out.println("Coffee sold!");
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces; 
        this.nSugarPackets = nSugarPackets; 
        this.nCreams = nCreams; 
        this.nCups = nCups; 
        System.out.println("Restocked!");
    }
    
    public static void main(String[] args) {
        Cafe compassCafe = new Cafe("Compass Cafe", "1 Chapin Way", 1, 20, 100, 100, 50);
        while (compassCafe.nCoffeeOunces > 0) {
            compassCafe.sellCoffee(2, 2, 2);
        }
        compassCafe.restock(20, 100, 100, 50);
    }
    
}
