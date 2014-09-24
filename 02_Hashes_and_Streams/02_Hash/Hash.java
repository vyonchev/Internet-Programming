import java.util.HashMap;
import java.util.Map.Entry;


public class Hash {

	
	public static void main(String[] args) {
		HashMap<String, Integer> countries = new HashMap<String, Integer>();
		countries.put("Orchidna", 20);
		countries.put("Shatigon", 200);
		countries.put("Melisara", 4);
		countries.put("Kyprosa", 50);
		countries.put("Dahuta", 60);
		countries.put("Eanna", 10);
		countries.put("Aier", 15);
		
		for (Entry<String, Integer> next : countries.entrySet()) {
			if(next.getValue() > 10)
				System.out.printf("The country %s has more than 10 million people. It has %d million\n",
				next.getKey(), next.getValue());
			
			
			}
		
		
		}
}
