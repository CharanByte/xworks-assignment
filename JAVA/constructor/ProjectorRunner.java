 
 public class ProjectorRunner {
    public static void main(String[] args) {
 Projector projector1 = new Projector();
        Projector projector2 = new Projector("Epson", "LCD", "White", 2.5);
        Projector projector3 = new Projector();
        projector3.setCompany("BenQ");
        projector3.setType("DLP");
        projector3.setColor("Black");
        projector3.setWeight(3.0);

        // Printing details of Projector instances
        System.out.println("Projector 1 Details:");
        projector1.printDetails();
        System.out.println("Projector 2 Details:");
        projector2.printDetails();
        System.out.println("Projector 3 Details:");
        projector3.printDetails();
    }
}