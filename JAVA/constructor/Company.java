public class Company {
    
    int id;
    String name;
    String location;
    SoftwareEnginner softwareEnginner=new SoftwareEnginner("raj",3,"HR",600000);

    Company(int id,String name,String location){
        this.id=id;
        this.name=name;
        this.location=location;
    }
    public  void print(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(location);
        softwareEnginner.print();

    }
}
