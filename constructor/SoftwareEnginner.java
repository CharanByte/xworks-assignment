public class SoftwareEnginner {
    String name;
    int exp;
    String designation;
    double salary;

    SoftwareEnginner( String name,int exp,String designation,double salary){
        this.name=name;
        this.exp=exp;
        this.designation=designation;
        this.salary=salary;

    }
    public  void print(){
        System.out.println(name);
        System.out.println(exp);
        System.out.println(designation);
        System.out.println(salary);
    }
}
