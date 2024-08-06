 class Minister {
    static void serve(){
        Assistant.help();
    }
}


 class Location{
    static void display(){
        System.out.println("display  location on screen");
        Building.opengate();
    }
 }

 class Building{
    static void opengate(){
        System.out.println("opengate while someone comming from building");
        Metal.strength();
    }
 }
 class Metal{
    static void strength(){
        System.out.println("we can measure the strength of a metal");
        Factory.make();
    }
 }

 class Factory{
    static void make(){
        System.out.println("Factory make heavy machines");
        Machine.design();
    }
 }

 class Machine{
    static void design(){
        System.out.println("Design a Mechine");
        Enginner.nothing();
    }
 }

 class Enginner{
    static void nothing(){
        System.out.println("NA");
    }
 }