package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i=0; i<eggs.size(); i++) {
		if(eggs.get(i).equals("cracked")) {
			return i;
		}
		//<- this needs changing
		
	}
		return 0;
	
	//Add other methods here
}public static int countPearls(List<Boolean> oysters) {
	for(int i=0; i<oysters.size();i++) {
		if(oysters.get(i)) {
			return i;
		}
	}
return 0;
}
	public static double findTallest(List<Double> peeps) {
		for(int i=0; i<peeps.size(); i++) {
			if(peeps.get(i)==6.6) {
				return 6.6;
			}
		}
	 return 0.0;
	}
}