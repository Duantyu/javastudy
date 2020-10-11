package test;

public class StringTest {
	public static void main(String args[]) {
		String s = "This is a test String!";  //默认创建实例
		System.out.println("before changed, s = " + s);
		
		String t = s.toLowerCase();  // 必须创建新的实例来进行String类的操作
		System.out.println("after changed, s = " + s);  //String类的对象实例不可改变
		System.out.println("t= " + t);
		
		String str = "This is the first string.";
		//实现字符串的比较,并比较这几个方法的不同
		boolean result1 = str.equals("This is the first string."); 
		boolean result2 = str.equals("this is the first string.");
		boolean result3 = str.equalsIgnoreCase("this is the first string.");  //忽略大小写的差别
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		
		String s1 = "This is the second string.";
		String s2 = "This is the second string.";
		String s3 = new String("This is the second string.");
		String s4 = new String(s1);
		String s5 = s1;
		
		boolean result121 = s1.equals(s2);
		boolean result122 = s1 == s2;  //关系运算符“==”判定两字符串对象是否是同一实例，它们在内存中的存储空间是否相同
		boolean result131 = s1.equals(s3);
		boolean result132 = s1 == s3;  //new创建了新的实例对象
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
