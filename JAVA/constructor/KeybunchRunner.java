public class KeybunchRunner {
public static void main(String[] args) {
    Key key=new Key(4, "n");
    Keybunch keybunch=new Keybunch("plastic", key);
    keybunch.details();

    System.out.println("*************************************");
    Key key1=new Key(5, "p");
    Keybunch keybunch1=new Keybunch("rubber", key1);
    keybunch1.details();

}
    
}
