public class Person {
        public static void main(String[] args) {
            if(args.length==4){
            String name=args[0];
            String email=args[1];
            String age=args[2];
            String password=args[3];

            for(String i :args){
                System.out.println(i);
            }
    }
    else{
        System.out.println("enter four references");
    }
        
        
    }
    
}
