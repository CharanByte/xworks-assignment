class Brand{
	
	public static void size(byte size ,short quantity, String color){
		System.out.println("running size in Brand");
		System.out.println("size : "+size);
		System.out.println("quantity : "+quantity);
		System.out.println("color : "+color);
		
		if(size<40 && size>=0){
			System.out.println("slim-fit");
		}
		else{
			System.out.println("large");
		}
		
	}
	
	/*public static void name(String name , String color,int quantity){
		System.out.println("running name in Brand");
		System.out.println("name : "+name);
		System.out.println("color : "+color);
		System.out.println("quantity : "+quantity);
	}*/
	
}