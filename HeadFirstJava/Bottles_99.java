public class Bottles_99{
	public static void main(String[] args){
		int x = 100;
		while(x>=1){
			int a = x;
			int b = x-1;
			System.out.println(a +" bottles of beer on the wall,");
			System.out.println(a + " bottles of beer!");
			System.out.println("Take one down,");
			System.out.println("Pass it around,");
			if(x == 1){
				System.out.println("No more bottles of beer on the wall!");
			}
			else{
				System.out.println(b +" bottles of beer on the wall!");
			}
			System.out.println();
			x--;
		}

	}
}