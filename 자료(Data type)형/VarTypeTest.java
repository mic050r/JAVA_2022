public class VarTypeTest{
   public static void main(String args[]){
         boolean gender = true; //8bit만 있으면 쓸수있음
         boolean hungry = true;
         System.out.println(gender);
         if (hungry ==true){      
            System.out.println("배고프다");
         }else{
            System.out.println("배부르다");
         }

   
         int a = 5; 
         if(a > 10) System.out.println("a는 10보다 크다");//boolean false
         if(a < 10) System.out.println("a는 10보다 작다");//boolean true
         
         char day = '월';
         System.out.println(day+"요일");

   }
}