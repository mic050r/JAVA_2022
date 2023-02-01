public class Fact_While{
     public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
	int i = 1;
             int fac = 1;
             while(i<=n){
    	   fac*=i ;
	   i++;
             }
	   System.out.print("n! = " + fac );
   }
}