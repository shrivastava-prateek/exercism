
public class Bob {

	private static final String quesResponse = "Sure.";
	private static final String yellResponse = "Whoa, chill out!";
	private static final String addressResponse = "Fine. Be that way!";
	private static final String defaultResponse = "Whatever.";
	
	
	public String hey(String string) {
			
		String temp =string.replaceAll("[^a-zA-Z]", "");
		if(checkForForcefulness(temp)){
			return yellResponse;
		}
		
		if(string.endsWith("?")){
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
			if(!((a >= 65 && a <= 90) ||a == 32)){
				return false;
			}
		}
		return true;
	}
	/*public static void main(String[] args) {
		new Bob().hey("4?");
	}*/
}
