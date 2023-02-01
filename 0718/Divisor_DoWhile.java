public class Divisor_DoWhile{
     public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
	int i = 1;
             do{
	  if(n%i == 0){
	     System.out.print(i + "  ");
	  }
	  i++;
             }while(i<=n) ;

   }
}