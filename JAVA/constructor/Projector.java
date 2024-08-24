public class Projector {
     String company;
     String type;
     String color;
     double weight;

    // Default constructor
    public Projector() {
        this.company = "DefaultCompany";
        this.type = "DefaultType";
        this.color = "DefaultColor";
        this.weight = 0.0;
    }

    // Parameterized constructor
    public Projector(String company, String type, String color, double weight) {
        this.company = company;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    // Setter methods
    public void setCompany(String company) {
        this.company = company;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("Company: " + company + ", Type: " + type + ", Color: " + color + ", Weight: " + weight);
    }
}
