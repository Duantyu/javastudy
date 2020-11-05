package test;

public class GenericMethod {
	public static <T> void displayArray(T[] anArray)
	{
		// 现实泛型类型项的数组的内容
		for (T arrayEntry: anArray)
		{
			System.out.print(arrayEntry);
			System.out.print(' ');
		} //end for
		System.out.println();
	}//end displayArray
	public static void main(String args[])
	{
		String[] stringArray = {"apple", "banana", "carrot", "dandelion"};
		System.out.print("stringArray contains ");
		displayArray(stringArray);
		
		Character[] characterArray = {'a', 'b', 'c', 'd'};
		System.out.print("characterArray contains ");
		displayArray(characterArray);
	}//end main
}//end example
