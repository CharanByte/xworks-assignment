public class Coil {
    double weight;
    String size;


    Coil(double coilWeight,String coilSize){
        System.out.println("const");
        System.out.println(coilWeight);
        System.out.println(coilSize);
        weight=coilWeight;
        size=coilSize;
		System.out.println(weight);
        System.out.println(size);
    }
    public static void main(String[] args) {
        Coil coil=new Coil(40,"small");
		Coil coil1=new Coil(30,"small");
        Coil coil2=new Coil(70,"medium");
        Coil coil3=new Coil(90,"large");
        Coil coil4=new Coil(35,"medium");
        Coil coil5=new Coil(96,"large");
        Coil coil6=new Coil(20,"small");
        Coil coil7=new Coil(50,"medium");
        Coil coil8=new Coil(10,"small");
        Coil coil9=new Coil(29,"small");
        Coil coil10=new Coil(80,"large");
        

        
    }
    
}
