public class VarTypeTest1{
   public static void main(String args[]){
              //정수 1.byte, 8비트, |(-128~127) 단독은 괜찮지만 더하는것은 에러가 난다
             //byte hakgub = 18;
             //System.out.println(hakgub);
             byte b1 = 20;
             byte b2 = 30;
             //byte b3 = b1 + b2;
             //System.out.println(b3);
            //정수 2.short, 16비트 (-32768~32767)
            //short s1 = 300;
            //short s2 = 1000;
            //short s3 = 2000;
            //short s4 = s2 + s3;
            //System.out.println("우리 학교 전교생수 : " + s1);



           //정수 3.int, 32비트 (-2147483648~2147483647) 
           int n1 = 2147483647;
           int n2 = 1;
           int n3 = n1 + n2;
           System.out.println(n1);
           System.out.println(n2);
           System.out.println(n3);
           //실수 4.double 123.456=> 1.23456*102
          float f1 = 12.3456F;
          float f2 =345.678F;
          float f3 =f1+f2;
          System.out.println(f1);
          System.out.println(f2);

          double d1 = 0.00000000000000000123456789;
          System.out.println(d1);
     
   }
}