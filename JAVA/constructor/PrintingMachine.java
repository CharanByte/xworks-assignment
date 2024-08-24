
public class PrintingMachine {
    String brand;
    double cost;

    PrintingMachine(String brand1,double cost1){
        System.out.println("constructor");
        System.out.println(brand1);
        System.out.println(cost1);
        brand=brand1;
        cost=cost1;
		System.out.println(cost);
        System.out.println(brand);

    }
 
    
    public static void main(String[] args) {
        PrintingMachine printingMachine=new PrintingMachine("sony", 400000);
		PrintingMachine printingMachine1=new PrintingMachine("lg", 600000);
		PrintingMachine printingMachine2=new PrintingMachine("hp", 700000);
		PrintingMachine printingMachine3=new PrintingMachine("sony", 200000);
		PrintingMachine printingMachine4=new PrintingMachine("mi", 800000);
		PrintingMachine printingMachine5=new PrintingMachine("sony", 400000);
		PrintingMachine printingMachine6=new PrintingMachine("mi", 400000);
		PrintingMachine printingMachine7=new PrintingMachine("sony", 400000);
		PrintingMachine printingMachine8=new PrintingMachine("sony", 400000);
		PrintingMachine printingMachine8=new PrintingMachine("LG", 400000);
		PrintingMachine printingMachine9=new PrintingMachine("sony", 400000);
        

    }
}