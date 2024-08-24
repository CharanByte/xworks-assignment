class TrainRunner{
	public static void main(String[] args){
		System.out.println("Running A main Method");
		Train.book("kolar ","Bengaluru");
		Train.book("Bengaluru","mysuru",3);
		Train.book("mysuru","mumbai",3,5000.00);
		Train.cancel(123);
		Train.cancel("mysuru","mumbai");
		
	}
}