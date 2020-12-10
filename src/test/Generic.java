package test;
//强调的问题：1.toString方法
//2.this(that)指代
//3.Vector数组

import java.util.HashMap;
import java.util.Map;

public class Generic {
	//泛型
	public static <T,K> void DisplayArray (T[] anArray, K[] twoArray)
	{
		for (T t: anArray) 
		{
			System.out.println(t);   //默认调用了toString();
			System.out.println("----");
		}
		for (K k: twoArray) 
		{
			System.out.println(k);   //默认调用了toString();
			System.out.println("----");
		}
	}
	
	public static void main(String[] args)
	{
//		String[] strArray = {"ABC", "DEF", "HIJ"};
//		DisplayArray(strArray);
//		
//		Integer[] intArray = {1, 2, 3, 4, 5};
//		DisplayArray(intArray);
//		
//		Car[] carArray =new Car[2];
//		carArray[0] = new Car("Ferrari",3,4);
//		carArray[1] = new Car("Porsche",5,8);
//		DisplayArray(carArray);
		
		Map<Integer,String> map = new HashMap<>();
		map.put(201802222, "姚佳");
		map.put(201944144, "李宰旭");
		System.out.println(map.get(201944144));
		
		Map<String, Car> carmap = new HashMap<String, Car>();
		carmap.put("Porsche", new Car("Porsche",5, 8));
		carmap.put("Ferrari", new Car("Ferrari",3, 4));
		System.out.println(carmap.get("Porsche"));
		
		Map<String, Course> coursemap = new HashMap<String, Course>();
		coursemap.put("201922031", new Course("JAVA","SCS", "4242414",4));
		System.out.println(coursemap.get("201922031"));
 	}
}
