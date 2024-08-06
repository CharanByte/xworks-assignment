public class Lamp {
    double weight;
    double height;

    Lamp(double lampWeight,double lampHeigth){
        System.out.println("constructor");
        System.out.println(lampWeight);
        System.out.println(lampHeigth);
        height=lampHeigth;
        weight=lampWeight;
        System.out.println(height);
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Lamp lamp =new Lamp(10.5,3.4);
		 Lamp lamp1 =new Lamp(5,6);
		 Lamp lamp2 =new Lamp(3.4,2.1);
		 Lamp lamp3 =new Lamp(6,8.9);
		 Lamp lamp4 =new Lamp(1.1,2.8);
		Lamp lamp5 =new Lamp(7.8,9.0);
		Lamp lamp6 =new Lamp(9.5,3.5);
		Lamp lamp7 =new Lamp(8.9,3.2);
	    Lamp lamp8 =new Lamp(7.8,5.5);
		Lamp lamp9 =new Lamp(7.7,8.1);
		Lamp lamp10 =new Lamp(5.9,4.4);
        
    }
}
