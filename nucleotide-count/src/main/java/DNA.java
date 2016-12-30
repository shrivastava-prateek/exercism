import java.util.HashMap;
import java.util.Map;

public class DNA {
	private String DNA ;

	public DNA(String string) {
		
		this.DNA = string;
	}

	public Integer count(char c) {
		int noOfMatches=0;
		if(c !='A' && c != 'C' && c != 'G' && c != 'T'){
			throw new IllegalArgumentException();
		}
		char[] seq = DNA.toUpperCase().toCharArray();
		for(char Nucleotide: seq){
			if (c==Nucleotide){
				noOfMatches++;
			}
		}
		return noOfMatches;
	}

	public Map<Character, Integer> nucleotideCounts() {
		Map<Character, Integer> ncCounts = new HashMap<Character, Integer>();
		
		//checking for 'A'
		int A = count('A');
		//checking for 'C'
		int C = count('C');
		//checking for 'G'
		int G = count('G');
		//checking for 'T'
		int T = count('T');
		
		ncCounts.put('A', A);
		ncCounts.put('C', C);
		ncCounts.put('G', G);
		ncCounts.put('T', T);
		
		return ncCounts;
	}
}
