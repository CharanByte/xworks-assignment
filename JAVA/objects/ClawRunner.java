class ClawRunner {
    public static void main(String[] args) {
    
        Claw claw= new Claw ();
        claw.type="Retractable";
        claw.sharpness=true;
    
        System.out.println("claw type:" + claw.type);
        System.out.println("claw sharpness:" + claw.sharpness);
		System.out.println("claw length:" + claw.length);
    }
}