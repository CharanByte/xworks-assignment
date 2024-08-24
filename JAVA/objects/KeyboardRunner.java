class KeyboardRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in KeyboardRunner ");
	  
	  Keyboard keyboard=new Keyboard();
	  keyboard.cost=10;
	  System.out.println("keyboard cost :"+keyboard.cost);
	  System.out.println("keyboard company :"+keyboard.company);
	  System.out.println("keyboard quantity:"+keyboard.quantity);
	  
	  
	   System.out.print("end main in KeyboardRunner");
  }
 }