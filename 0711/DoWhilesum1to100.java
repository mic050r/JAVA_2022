public class DoWhilesum1to100{
     public static void main(String args[]){
        int i = 1;
        int total = 0;
        do{
	total+=i ;
	i++;
        }while(i<=100) ;
	System.out.print( total +"\n" );
   }
}