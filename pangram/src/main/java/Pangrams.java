
import java.util.HashSet;
import java.util.Set;

public class Pangrams {

	public static boolean isPangram(String string) {
		String temp = string.toLowerCase();
		temp=temp.replaceAll(" ", "");
		temp=temp.replaceAll("[^a-z ]", "");
		
		char[] charArr = temp.toCharArray();
	
		Set<Character> letters = new HashSet<Character>();
		
		for(char c:charArr){
			letters.add(c);
		}
		
		if(letters.size()==26){
			return true;
		}
		
		return false;
	}
	

}
