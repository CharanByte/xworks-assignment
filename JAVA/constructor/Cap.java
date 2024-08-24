public class Cap {
    String color;
    char size;
    String brand;

    Cap(String capColor,char capSize,String capBrand){
        System.out.println("const");
        System.out.println(capColor);
        System.out.println(capSize);
        System.out.println(capBrand);
        color=capColor;
        size=capSize;
        brand=capBrand;
        System.out.println(color);
        System.out.println(size);
        System.out.println(brand);
    }

    public static void main(String[] args) {
        Cap cap=new Cap("black", 'M',"nike");
		Cap cap1=new Cap("white", 'M',"nike");
		Cap cap2=new Cap("red", 'M',"puma");
		Cap cap3=new Cap("white", 'L',"nike");
		Cap cap4=new Cap("black", 'L',"nike");
		Cap cap5=new Cap("red", 'L',"puma");
		Cap cap6=new Cap("black", 'S',"nike");
		Cap cap7=new Cap("red", 'M',"nike");
		Cap cap8=new Cap("white", 'S',"rebook");
		Cap cap9=new Cap("black", 'M',"nike");
		Cap cap10=new Cap("white", 'S',"rebook");

    }
    
}
