package test;

public class StringTest {
	public static void main(String args[]) {
		String s = "This is a test String!";  //Ĭ�ϴ���ʵ��
		System.out.println("before changed, s = " + s);
		
		String t = s.toLowerCase();  // ���봴���µ�ʵ��������String��Ĳ���
		System.out.println("after changed, s = " + s);  //String��Ķ���ʵ�����ɸı�
		System.out.println("t= " + t);
		
		String str = "This is the first string.";
		//ʵ���ַ����ıȽ�,���Ƚ��⼸�������Ĳ�ͬ
		boolean result1 = str.equals("This is the first string."); 
		boolean result2 = str.equals("this is the first string.");
		boolean result3 = str.equalsIgnoreCase("this is the first string.");  //���Դ�Сд�Ĳ��
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		
		String s1 = "This is the second string.";
		String s2 = "This is the second string.";
		String s3 = new String("This is the second string.");
		String s4 = new String(s1);
		String s5 = s1;
		
		boolean result121 = s1.equals(s2);
		boolean result122 = s1 == s2;  //��ϵ�������==���ж����ַ��������Ƿ���ͬһʵ�����������ڴ��еĴ洢�ռ��Ƿ���ͬ
		boolean result131 = s1.equals(s3);
		boolean result132 = s1 == s3;  //new�������µ�ʵ������
		boolean result141 = s1.equals(s4);
		boolean result142 = s1 == s4;
		boolean result151 = s1.equals(s5);
		boolean result152 = s1 == s5;
		
		System.out.println("s1 equals s2 = " + result121);
		System.out.println("  s1 == s2 = " + result122);
		System.out.println("s1 equals s3 = " + result131);
		System.out.println("  s1 == s3 = " + result132);
		System.out.println("s1 equals s4 = " + result141);
		System.out.println("  s1 == s4 = " + result142);
		System.out.println("s1 equals s5 = " + result151);
		System.out.println("  s1 == s5 = " + result152);
	
	}
	 
}
