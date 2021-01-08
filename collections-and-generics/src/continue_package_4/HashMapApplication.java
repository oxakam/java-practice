package continue_package_4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapApplication {

	public static void main(String[] args) {
		
		//HashMap implements the map interface (LinkedHashMap is same, but prints in order of insertion)
		
		HashMap<String, String> dictionary = new HashMap<String, String>();		//<key,value>
		
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage");
		dictionary.put("Comply", "(of a person or group) act in accordance with a wish or command");
		dictionary.put("Voice", "the sound produced in a person's larynx and uttered through the mouth, as speech or song");
		dictionary.put("Meeting", "an assembly of people for discussion or entertainment");
		
//		for(String word : dictionary.keySet()) {			
//			String value = dictionary.get(word);			
//			System.out.println(word + " = " + value);
//		}
		
		//or
		for(Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		
		//TreeMap sorts the keys in alphabetical order
		TreeMap<String, String> dictionary2 = new TreeMap<String, String>();		
		
		dictionary2.put("Brave", "ready to face and endure danger or pain; showing courage");
		dictionary2.put("Comply", "(of a person or group) act in accordance with a wish or command");
		dictionary2.put("Voice", "the sound produced in a person's larynx and uttered through the mouth, as speech or song");
		dictionary2.put("Meeting", "an assembly of people for discussion or entertainment");
		
		for(Map.Entry<String, String> entry2 : dictionary2.entrySet()) {
			System.out.println(entry2.getKey() + " = " + entry2.getValue());
		}
	}

}
