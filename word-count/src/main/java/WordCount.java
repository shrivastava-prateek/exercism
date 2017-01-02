import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public Map<String, Integer> phrase(String string) {

		Map<String, Integer> countWords = new HashMap<String, Integer>();

		String result = parseSentence(string);
		String[] strArr= result.split("\\s+");
		int len = strArr.length;
		int count,i,j;
		for (i=0;i<len;i++){
			count=1;
			if(!countWords.containsKey(strArr[i]))
			{
				for (j=i+1;j<len;j++){
					if (strArr[i].equalsIgnoreCase(strArr[j])){
						count++;
					}
				}

				countWords.put(strArr[i],count);
			}
		}
		return countWords;
	}


	public String parseSentence(String string){
		/*	char[] chArr = string.toCharArray();
		String parsed = "";
		for (Character character:chArr){
		//int character =Integer.parseInt(symbol);
		if((character >= 65 && character <= 90 ) || (character >=97 && character <= 122) || character == 32 || (character >=48 && character <= 57)){
			parsed = parsed+ character.toLowerCase(character);
		}
		}
		return parsed;*/
		return string.replaceAll("\\W", " ").toLowerCase();
	}
}
