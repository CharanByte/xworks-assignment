public class SpeakerRunner {
    public static void main(String[] args) {
       
        Speaker speaker1 = new Speaker();
        Speaker speaker2 = new Speaker("Sony", "Medium", 150.75, 50);
        Speaker speaker3 = new Speaker();
        speaker3.setBrand("Bose");
        speaker3.setSize("Large");
        speaker3.setCost(299.99);
        speaker3.setOutput(100);

        System.out.println("Speaker 1 Details:");
        speaker1.printDetails();
        System.out.println("Speaker 2 Details:");
        speaker2.printDetails();
        System.out.println("Speaker 3 Details:");
        speaker3.printDetails();

      
    }
} 

       
       

       
       