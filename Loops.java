public class Loops{
	public static void main(String[] args){
		for(int i = 1;i <= 5;i++){
			System.out.print(i+"\t");
		}
		int a = 1;
		while(a <= 5){
			System.out.print("@\t");
			a++;
		}
		int b = 1;
		do{
			System.out.print("$\t");
			b++;
		}while(b <= 5);
	}
}