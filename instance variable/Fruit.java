public class Fruit {
        int quantity;
        double price;
        String name;
    
        Fruit(){
            System.out.println("Fruit constructor");
        }
    
        public static void main(String[] args) {
            Fruit fruit=new Fruit();
            fruit.quantity=2;
            fruit.price=20;
            fruit.name="apple";
            System.out.println(fruit.quantity);
            System.out.println(fruit.price);
            System.out.println(fruit.name);
    
    
        }
        
    }
    
    

