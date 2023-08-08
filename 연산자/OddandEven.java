public class OddandEven{
	public static void main(String args[]){
		System.out.println("**Â¦¼ö**");
			for(int even=1; even<=100; even++){
				if(even%2==0){
					System.out.print(even+"\t");
				}
			}
		System.out.println();
		System.out.println("**È¦¼ö**");
			for(int odd=1; odd<=100; odd++){
				if(odd%2!=0){
					System.out.print(odd+"\t");
				}
			}
			
	}
}