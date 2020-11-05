package test;



public class Generic {
	//����
	public static <T> void DisplayArray (T[] anArray)
	{
		for (T t: anArray) 
		{
			System.out.println(t);   //Ĭ�ϵ�����toString();
			System.out.println("----");
		}
	}
	
	public static void main(String[] args)
	{
		String[] strArray = {"ABC", "DEF", "HIJ"};
		DisplayArray(strArray);
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		DisplayArray(intArray);
		
		Car[] carArray =new Car[2];
		carArray[0] = new Car("Ferrari",3,4);
		carArray[1] = new Car("Porsche",5,8);
		DisplayArray(carArray);
 	}
}
