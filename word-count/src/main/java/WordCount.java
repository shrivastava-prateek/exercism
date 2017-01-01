import java.util.Map;

public class WordCount {

	public Map<String, Integer> phrase(String string) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> countWords = new HashMap<String, Integer>();
		String[] strArr= string.split(" ");
		int len = strArr.length;
		int count,i,j;
		for (i=0;i<len;i++){
			count=1;
			if(countWords.containsKey(strArr[i])){
			for (j=i;j<len;j++){
				if (strArr[i].equalsIgnoreCase(strArr[j])){
					count++;
				}
			}
			countWords.put(strArr[i],count);
			}
		}
		return countWords;
	}
}
