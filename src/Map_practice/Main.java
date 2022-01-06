package Map_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		Map<String, String> map2 = new TreeMap<String, String>();
		
		map1.put(0, "ブドウ");
		map1.put(3, "もも");
		System.out.println(map1);
		
		map1.put(0, "マスカット");
		System.out.println(map1);
		System.out.println("---------------------");
		
		System.out.println(map1.get(0));
		System.out.println(map1.get(1));
		System.out.println("---------------------");
		
		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("ブドウ"));
		System.out.println("---------------------");
		
		System.out.println(map1.size());
		System.out.println("---------------------");
		
		map1.remove(0);
		System.out.println(map1);
		map1.remove(3, "もも");
		System.out.println(map1);
		System.out.println("---------------------");
		
		map1.put(0, "ブドウ");
		map1.put(3, "もも");
		
		for (Integer key : map1.keySet()) {
			System.out.println(key);
		}
		System.out.println("---------------------");
		
		for (String name : map1.values()) {
			System.out.println(name);
		}
		System.out.println("---------------------");
		
		for (Map.Entry<Integer, String> map : map1.entrySet()) {
			  System.out.println(map.getKey() + "番は" + map.getValue());
		}
	}
	
	

}
