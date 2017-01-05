import java.text.Normalizer;

public class Bob {

	private static final String quesResponse = "Sure.";
	private static final String yellResponse = "Whoa, chill out!";
	private static final String addressResponse = "Fine. Be that way!";
	private static final String defaultResponse = "Whatever.";
	
	
	public String hey(String string) {
			
		/*
		 * Normalizing text -- removing accents
		 */
		string = Normalizer.normalize(string, Normalizer.Form.NFD);
		string = string.replaceAll("[^\\p{ASCII}]", "");
		

		String temp =string.replaceAll("[^a-zA-Z]", "");
		
		
		int len = temp.length();
		
		if(checkForForcefulness(temp) && len > 0){
			return yellResponse;
		}
		
		else if(string.endsWith("?")){
				return quesResponse;
			}
		else if(string.endsWith("!")){
				return defaultResponse;
		}
		else if(string.trim().equals(""))
			return addressResponse;
		else{
			return defaultResponse;
		}
	
	}

	public boolean checkForForcefulness(String string){
		
		char[] arr = string.toCharArray();
		if(arr.length == 0){
			return false;
		}
		for(char a:arr){
			if(!(a >= 65 && a <= 90)){
				return false;
			}
		}
		return true;
	}
	
}
