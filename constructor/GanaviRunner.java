public class GanaviRunner {
    public static void main(String[] args) {

        Clip clip=new Clip("red", "claw");
        Ganavi ganavi=new Ganavi("xyz@gmail.com", clip);
        ganavi.details();
        System.out.println("*********************************");

        Clip clip1=new Clip("green", "butterfly");
        Ganavi ganavi1=new Ganavi("abcd@gmail.com", clip1);
        ganavi1.details();
    }

    
}
