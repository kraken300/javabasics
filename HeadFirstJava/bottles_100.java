public class bottles_100{
	public static void main(String[] args){
		int beerNum = 100;
		String bot = "bottles";
		while(beerNum > 0){
			
		if (beerNum == 1){
			bot = "bottle";
		}
			System.out.println(beerNum +" "+ bot +" of beer on the wall,");
			System.out.println(beerNum + " " + bot + " of beer!");
			System.out.println("Take one down,");
			System.out.println("Pass it around,");
			beerNum = beerNum-1;
			if(beerNum > 1){
			System.out.println(beerNum +" " +  bot + " of beer on the wall!");
			System.out.println();
			}
			else if(beerNum == 1){
					bot = "bottle";
					System.out.println(beerNum +" " +  bot + " of beer on the wall!");
					System.out.println();
			}
			else{
			System.out.println("No more bottles of beer on the wall!");
			}
			
		}
		
		
	}
}