public class Lens {

    int refractive_index;
    String size;


    Lens( int lensRefractive_index,String lensSize){
        System.out.println("constructor");
        System.out.println(lensRefractive_index);
        System.out.println(lensSize);
        refractive_index=lensRefractive_index;
        size=lensSize;
		System.out.println(refractive_index);
        System.out.println(size);
    }
    public static void main(String[] args) {
        Lens lens=new Lens(3,"medium");
		Lens lens1=new Lens(9,"large");
		Lens lens2=new Lens(4,"medium");
		Lens lens3=new Lens(2,"small");
		Lens lens4=new Lens(8,"large");
		Lens lens5=new Lens(7,"medium");
		Lens lens6=new Lens(3,"small");
		Lens lens7=new Lens(6,"medium");
		Lens lens8=new Lens(3,"small");
		Lens lens9=new Lens(1,"small");
        Lens lens10=new Lens(8,"large");
    }
    
}
