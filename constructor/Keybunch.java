public class Keybunch {
    String material;
    Key key;

    Keybunch(String material,Key key){
        this.material=material;
        this.key=key;
    }

    public void details(){
        System.out.println(material);
        key.details();
    }
    
}
