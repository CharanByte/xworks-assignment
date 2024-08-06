class WithRunner{
	public static void main(String[] args){
	
	int result=	WithReturn.quantity(4);	
	System.out.println("result : "+result);
	
	System.out.println("********************************");
	
	 boolean result1=WithoutReturn.isGoing(true);
	 System.out.println("result : "+result1);
	 
	 System.out.println("********************************");

	Product.car("BMW");
	}
}