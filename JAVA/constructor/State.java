public class State {
    String name;
    String location;
    CapitalCity capitalCity=new CapitalCity();

    State(String name,String location){
        this.location=location;
        this.name=name;

    }
    public void print(){
        System.out.println(name);
        System.out.println(location);
        capitalCity.print();
    }
    
}
