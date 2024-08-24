public class SimCard {
    String company;
    int price;
    int noOfDay;


    SimCard(String simCompany,int simPrice,int noOfDays){
        System.out.println("const");
        System.out.println(simCompany);
        System.out.println(simPrice);
        System.out.println(noOfDays);
        company=simCompany;
        price=simPrice;
        noOfDay=noOfDays;
        System.out.println(company);
        System.out.println(simPrice);
        System.out.println(noOfDay);
    }
    public static void main(String[] args) {
        SimCard simCard=new SimCard("Airte",299,28);
		SimCard simCard1=new SimCard("ji0",249,28);
		SimCard simCard2=new SimCard("VI",299,28);
		SimCard simCard3=new SimCard("BSNL",149,28);
		SimCard simCard4=new SimCard("Airte",149,24);
		SimCard simCard5=new SimCard("Airte",299,28);
		SimCard simCard6=new SimCard("Airte",299,28);
		SimCard simCard7=new SimCard("jio",299,28);
		SimCard simCard8=new SimCard("Airte",299,28);
		SimCard simCard9=new SimCard("jio",119,14);
		SimCard simCard10=new SimCard("Airte",299,28);
    }
}
