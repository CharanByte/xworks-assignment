public class Forest {
        public static void main(String[] forest) {
            if(forest.length==4){
            String name=forest[0];
            String area=forest[1];
            String year=forest[2];
            String state=forest[3];

            for(String i :forest){
                System.out.println(i);
            }
    }
        else{
            System.out.println("enter four references");
        }       
        
    }
    
}
