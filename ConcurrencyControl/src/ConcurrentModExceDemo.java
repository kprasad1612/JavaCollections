

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModExceDemo {
public static void main(String[] args) {
	 Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
	map.put("key1", 1);
	map.put("key2", 1);
	map.put("key3", 1);
	for(String key: map.keySet()) {
		if(map.get(key) == 1)
			map.remove(key);
	}
	System.out.println("Successfully removed a pair!");
	
}

}
