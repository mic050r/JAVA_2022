public class VarTest4{
     public static void main(String[] args){
        int a = 19; //O
        //int b = 2147483648 //X=>에러 = > integer number too large
        //int c = 3.14; //X 소수라서 안됨 자동형변환 X
        double d = 5; //자동형변화
        double e = 5 +3.14;  //5=> double로 형변환 
        System.out.println(e);
     }
}