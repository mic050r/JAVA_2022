public class TypeCasting{
     public static void main(String[] args){
        //자동형변환
        byte b1 = 10;
        short s1 = b1;
        int i1 = 10000; 
        double d1= i1;

        //강제형변환 
        int i2 =255;
        byte b2 = (byte) i2;
        int i3 = 500;
        int i4 = 34567890;
        short s2 =(short)i4;
        byte b3 = (byte)i3;
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(s2);

        int n1 = 20;
        byte n2 = (byte)n1;
        System.out.println(n2);
     }
}