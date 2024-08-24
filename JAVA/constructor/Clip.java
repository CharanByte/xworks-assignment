public class Clip {
    String color;
    String type;

    Clip(String color,String type){
        this.color=color;
        this.type=type;
    }
    public void details(){
        System.out.println(color);
        System.out.println(type);
    }
}
