public class Country {
    String name;
    String continent;
    State state=new State("karnataka", "bengaluru");

    Country(String name, String continent){
        this.name=name;
        this.continent=continent;
    }
    public void print(){
        System.out.println(name);
        System.out.println(continent);
        state.print();
    }
    
}
