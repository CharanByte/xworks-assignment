public class BuyRunner {
    public static void main(String [] args){
        Buy.product("nike", 500);
        Buy.product("nike",400);
        Buy.product("idly",2,"good",30);
        Buy.product("idly",1,"good",30);
        Buy.product("idly",2,"good",40);
        Buy.product("idly",1,"good",100);
        Buy.bookMovieTicket("kalki2892AD","Prasanna",3,200);
        Buy.bookMovieTicket("kalki2892AD","Prasanna",4,200);
        Buy.bookMovieTicket("kalki2892AD","Prasanna",5,600);
        Buy.bookMovieTicket("kalki2892AD","Prasanna",6,300);
        Buy.buyEgg(8, 6);
        Buy.buyEgg(3, 6);
        Buy.buyShampoo(50,300,"Dove","2/3/2024" );
        Buy.buyShampoo(40,300,"Dove","2/3/2024" );
        Buy.buyCake('s', "square","chocolet", 800, 2);
        Buy.buyCake('s', "square","chocolet", 600, 2);
        Buy.buyLaptop("dell", 222, 30000, 6000, 15, "windows", 16, 8);
        Buy.buyLaptop("dell", 222, 29000, 6000, 15, "windows", 16, 8);
        Buy.buySmartWatch("boat",2500,"black",'M',102);
        Buy.buySmartWatch("boat",2000,"black",'M',102); 
        
    }
    
}
