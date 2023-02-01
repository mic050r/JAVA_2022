public class Divisor_While{
     public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
	int i = 1;
	while(i<=n){
	  if(n%i == 0){
	     System.out.print(i + "  ");
	  }
	  i++;
             }
   }
}