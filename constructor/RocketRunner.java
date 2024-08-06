class RocketRunner{
    public static void main(String[] args){
        
        Rocket rocket1 = new Rocket();
        Rocket rocket2 = new Rocket("USA", 25000.0, 5000.0, 4);
        Rocket rocket3 = new Rocket();
        rocket3.setCountry("Russia");
        rocket3.setSpeed(30000.0);
        rocket3.setFuelCapacity(6000.0);
        rocket3.setNoOfThrusters(6);

       
        System.out.println("Rocket 1 Details:");
        rocket1.printDetails();
        System.out.println("Rocket 2 Details:");
        rocket2.printDetails();
        System.out.println("Rocket 3 Details:");
        rocket3.printDetails();
    }
}