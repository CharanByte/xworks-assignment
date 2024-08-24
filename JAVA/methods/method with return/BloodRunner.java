public class BloodRunner {
    public static void main(String[] args){
        System.out.println("runnig main method");
        String result=Blood.group("B+");
        System.out.println("Blood Group : "+result);

        System.out.println("runnig main method");
        String name=Blood.personName("raju");
        System.out.println("Blood Group : "+name);

        System.out.println("runnig main method");
        double cost=Blood.cost(2000);
        System.out.println("Blood Group : "+cost);

        System.out.println("runnig main method");
        char tested=Blood.hospitalTested('y');
        System.out.println("Blood Group : "+tested);

        System.out.println("runnig main method");
        boolean sick=Blood.sickness(true);
        System.out.println("Blood Group : "+sick);

        System.out.println("runnig main method");
        boolean donate=Blood.donate(true);
        System.out.println("Blood Group : "+donate);

    }
    
}
