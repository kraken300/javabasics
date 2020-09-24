public class PhraseOMatic{
	
	public static void main(String[] args){
		String[] list1 = {"24/7","multiTier","30,000 foot","B-to-B","win-win",
							"frontend", "web-based","pervasive", "smart",
							"sixsigma","critical-path", "dynamic"};
		
		String[] list2 = {"empowered", "sticky",
						"value-added", "oriented", "centric", "distributed",
						"clustered", "branded","outside-the-box", "positioned",
						"networked", "focused", "leveraged", "aligned",
						"targeted", "shared", "cooperative", "accelerated"};
		
		String[] list3 = {"process", "tippingpoint", "solution", "architecture", 
						"core competency","strategy", "mindshare", "portal", "space", "vision",
						"paradigm", "mission"};
						
		int lenlist1 = list1.length;
		int lenlist2 = list2.length;
		int lenlist3 = list3.length;
		
		int ran1 = (int)(Math.random()*lenlist1);
		int ran2 = (int)(Math.random()*lenlist2);
		int ran3 = (int)(Math.random()*lenlist3);
		
		String phrase = list1[ran1]+" "+list2[ran2]+" "+list3[ran3];
		
		System.out.println(phrase);
		
		
	}
	
}