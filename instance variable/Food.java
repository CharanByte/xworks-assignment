    public class Food {
        
        boolean isgood;
        double price;
        String name;

        Food(){
            System.out.println("Food constructor");
        }

        public static void main(String[] args) {
            Food food=new Food();
            food.isgood=true;
            food.price=200;
            food.name="biryani";
            System.out.println(food.isgood);
            System.out.println(food.price);
            System.out.println(food.name);


        }
    }
