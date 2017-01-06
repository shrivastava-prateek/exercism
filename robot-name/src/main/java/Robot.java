import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Robot {

	private static List<String> names = new ArrayList<String>();
	private static Random random = new Random();
	private String name;

	public Robot(){
		
		this.name = getRobotName();
	}

	
	public String getName(){
		if(!this.name.isEmpty())
		return this.name;
		else return getRobotName();
	}
	

	public String getRobotName() {
        
		name = generateRandomName();

		while(names.contains(name)){
			name = generateRandomName();
		}

		names.add(name);
		return name;
	}


	public String generateRandomName(){

		String name = "";

		name = name + (char)(random.nextInt(26)+65);		
		name = name + (char)(random.nextInt(26)+65);
		name = name + random.nextInt(10);
		name = name + random.nextInt(10);
		name = name + random.nextInt(10);

		return name;
	}


	public void reset() {
 
		names.remove(name);
		this.name = "";
		
	}


}