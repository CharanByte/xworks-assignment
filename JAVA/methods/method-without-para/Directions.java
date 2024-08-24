public class Directions {
    public static void main(String[] args){
        right();
    }


    static void right(){
        System.out.println("i am going Right");
        left();
    }
    static void left(){
        System.out.println("i am going left");
        right();
    }
}
