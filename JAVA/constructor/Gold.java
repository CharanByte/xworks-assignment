public class Gold {

    int price;
    double weight;
    int carat;

    Gold(int goldPrice,double goldWeight,int goldCarat){
        System.out.println("const");
        System.out.println(goldPrice);
        System.out.println(goldWeight);
        System.out.println(goldCarat);
        price=goldPrice;
        weight=goldWeight;
        carat=goldCarat;
        System.out.println(price);
        System.out.println(weight);
        System.out.println(carat);

    }
    public static void main(String[] args) {
        Gold gold=new Gold(6700, 1, 24);
		Gold gold1=new Gold(12700, 2, 24);
		Gold gold2=new Gold(6700, 1, 24);
		Gold gold3=new Gold(6700, 1, 23);
		Gold gold4=new Gold(18800, 3, 24);
		Gold gold5=new Gold(6700, 1, 23);
		Gold gold6=new Gold(12700, 2, 24);
		Gold gold7=new Gold(6700, 1, 24);
		Gold gold8=new Gold(12700, 2, 23);
		Gold gold9=new Gold(6700, 1, 23);
		Gold gold10=new Gold(6700, 1, 24);
    }
    
}
