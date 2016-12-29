import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
		//create a map same as return type
		Map<String, Integer> NEW = new TreeMap<String, Integer>();
		
		//get the list of thr keys from map
		//for each on keys
		//retrieves the list and foreach every element
		//put each entry on a map with same point value
		for(int point:old.keySet()){
			for(String alpha:old.get(point)){
				NEW.put(alpha.toLowerCase(), point);
			}
		}
		
        return NEW;
    }
}
