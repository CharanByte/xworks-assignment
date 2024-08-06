class Mask {
    double cost;
    char size;
    String material;

   
    Mask() {
        System.out.println("No-parameter constructor:");
      
    }

    
    Mask(double cost) 
	{
        System.out.println("Constructor with cost parameter:");
        System.out.println(this.cost);
      
    }

  
     Mask(char size) 
	{
        System.out.println("Constructor with size parameter:");
        System.out.println(this.size);
        System.out.println(size);
       
    }

   
    Mask(String material)
	{
        System.out.println("Constructor with material parameter:");
        System.out.println(this.material);
        System.out.println(material);
    }

   
     Mask(double cost, char size, String material) 
	{

        System.out.println("Constructor with cost, size, and material parameters:");
        System.out.println(this.cost);
        System.out.println(cost);
        System.out.println(this.size);
        System.out.println(size);
        System.out.println(this.material);
        System.out.println(material);
    }

   
    Mask(double cost, char size) 
	{
        System.out.println("Constructor with cost and size parameters:");
        System.out.println(this.cost);
        System.out.println(cost);
        System.out.println(this.size);
        System.out.println(size);
    }
}