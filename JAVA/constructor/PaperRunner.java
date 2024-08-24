public class PaperRunner {
    public static void main(String[] args) {

 Paper paper1 = new Paper();
        Paper paper2 = new Paper(0.5, "A4", "High", "White");
        Paper paper3 = new Paper();
        paper3.setThickness(0.3);
        paper3.setSize("A3");
    }
}