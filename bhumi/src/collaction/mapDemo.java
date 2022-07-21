package collaction;

import java.util.HashMap;
import java.util.Map.Entry;

public class mapDemo {
public static void main(String[] args) {
	
		HashMap<Integer, String> mMap = new HashMap<Integer, String>();
		//add
		mMap.put(2,"Java");				//Entry
		mMap.put(3,"Flutter");	//Entry
		mMap.put(4,"Pythom");	
		mMap.put(6,"SE");	
		
		System.out.println(mMap);
		
		//read
		System.out.println("value = "+mMap.get(4));
		
		//update
		mMap.replace(4, "C++");
		
		//remove
		mMap.remove(6);
		
		//read all recode
		
		for(Entry<Integer, String> entry : mMap.entrySet())
		{
			System.out.println("Key : "+entry.getKey()+"------value : "+entry.getValue());
		}
		for(int key : mMap.keySet())
		{
			System.out.println("key : "+key);
		}
		for(String value : mMap.values())
		{
			System.out.println("key : "+value);
		}
		
		//lambda function
		mMap.entrySet().forEach(entry ->{
			System.out.println("key : "+entry.getKey()+"---------value : "+entry.getValue());
		});
		
	}
}
  