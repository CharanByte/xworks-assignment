public class CabCompany {
    int no_employes;
    String location;
    String name;

    CabCompany(){
        System.out.println("AutoDriver constructor");
    }

    public static void main(String[] args) {
        CabCompany cabCompany=new CabCompany();
        cabCompany.no_employes=150;
        cabCompany.location="bengaluru";
        cabCompany.name="ola";
        System.out.println(cabCompany.no_employes);
        System.out.println(cabCompany.location);
        System.out.println(cabCompany.name);


    }
    
}
