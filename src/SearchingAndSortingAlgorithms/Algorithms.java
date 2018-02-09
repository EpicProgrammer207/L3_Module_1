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
	
	public static String findLongestWord(List<String> words) {
		String s= "";
		for(int i=0; i<words.size(); i++) {
		int j =	words.get(i).length();
		if(j>s.length()) {
			s= words.get(i);
			
		}
		
		}
	return s;
	}
public static boolean containsSOS(List<String> l) {
	for(int i=0; i<l.size(); i++) {
		String j= l.get(i);
		if(j.contains("... --- ...")) {
			return true;
		}
	}
	
	return false;
	
}
public static List<Double> sortScores(List<Double> results) {
	for(int i=0; i<results.size();i++) {
for(int j=i+1; j<results.size(); j++) {
	if(results.get(i)>results.get(j)) {
		Double k= results.get(i);
		results.set(i, results.get(j));
		results.set(j, k);
	}
}
	}
	return results;

}
public static List<String> sortDNA(List<String> l){
	for(int i=0; i<l.size(); i++) {
		for(int j=i+1; j<l.size(); j++) {
			if(l.get(i).length()>l.get(j).length()) {
				String k = l.get(i);
				l.set(i, l.get(j));
				l.set(j, k);
			}
		}
	}
	return l;
}
public static List<String> sortWords(List<String> words) {
	for(int i=0; i<words.size(); i++) {
		for(int j=i+1; j<words.size(); j++) {
			if(words.get(i).compareTo(words.get(j))>0){
				String k = words.get(i);
				words.set(i, words.get(j));
				words.set(j, k);
			}
		}
	}
	return words;
}
}