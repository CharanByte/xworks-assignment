public class Owner {
     String name;
    int age;
    String gender;

    Owner(String name,int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }


    public  void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
}
