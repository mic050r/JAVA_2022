public class Fact_DoWhile{
     public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
	int i = 1;
             int fac = 1;
             do{
    	   fac*=i ;
	   i++;
             }while(i<=n) ;
	   System.out.print("n! = " + fac );
   }
}