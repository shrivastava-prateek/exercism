import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	private String inputWord;
	private char[] inputArray;

	public Anagram(String string) {
		this.inputWord=string.toLowerCase();
		this.inputArray=inputWord.toCharArray();
		Arrays.sort(inputArray);

	}

	public List<String> match(List<String> asList) {
		List<String> anagrams = new ArrayList<String>();
		for(String word:asList){
			if(inputWord.equalsIgnoreCase(word)){
				continue;
			}
			else if(checkAnagram(word)){
				anagrams.add(word);
			}

		}
		return anagrams;
	}


	public boolean checkAnagram(String word){

		char[] arr = (word.toLowerCase()).toCharArray();

		Arrays.sort(arr);

		return Arrays.equals(arr, inputArray); 
	}
}
