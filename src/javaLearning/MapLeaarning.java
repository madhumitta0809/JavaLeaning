package javaLearning;

import java.util.HashMap;

public class MapLeaarning {
public static void main(String[] args) {
	HashMap<Object, Object> hm=new HashMap<Object, Object>();
	hm.put("Dhoni", 1);
	hm.put("Raina", 2);
	hm.put("Rutu", 2);
	hm.put("jadeja",3);
	hm.put("jadeja",4);
	hm.put("Dhoni", null);
	hm.put("Rohit", null);
	hm.put(null, 3);
	hm.put(null, 4);
	System.out.println(hm);
	
	HashMap<Object, Object> hm1=new HashMap<Object, Object>();
	hm1.putAll(hm);
	System.out.println(hm1);
	System.out.println(hm1.clone());
	System.out.println(hm1.keySet());
	System.out.println(hm1.values());
	System.out.println(hm1.entrySet());
	
	
	
}

}
