package test;

public class GenericInterface {
	//���ͽӿ�
	public static void main(String[] args) {
		Generator fg =new FruitGenerator<String>();
		for(int i=0;i<10;i++)
			System.out.println(fg.next());
	}
}
