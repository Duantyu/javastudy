package test;

public class PassValue {
	float pvValue;  //重点疑问，类与main函数的关系
	
	//修改当前值的方法
	public void changeInt(int value) {
		value  = 55;
	}
	
	public void changeStr(String value) {
		value = new String ("different");  //changeStr()不改变String对象，但改变了PassValue对象的内容
	}
	public void changeObjValue (PassValue ref) {  //此方法的参数是一个对象
		ref.pvValue = 99f;
	}	
	
	
	public static void main (String args[]) {
		String str;
		int val;
				
		//创建类得的实例
		PassValue pv = new PassValue();
		
		//给整型变量赋值
		val = 11;
		//改变val的值
		pv.changeInt(val);  //仅仅执行完方法语句，并不对val本身产生影响
		//val当前的值
		System.out.println("The val is: " + val);  //只是传递了val的值11，并没有改变val本身的属性
		
		//给字符串str赋值
		str = new String ("hello");
		pv.changeStr(str);  //传递变量参数，执行完方法并退出后，内容不改变。
		//str当前的值
		System.out.println("The str value is: " + str); 
		
		//给ptValue赋值
		pv.pvValue = 101f;   
		//现在通过对对象引用改值
		pv.changeObjValue(pv);  //对象pv作为参数传递给changeObjValue()，对象的属性内容被改变了
		//当前的值是什么
		System.out.println("Current pvVlaue is: " + pv.pvValue);
	}
	
}
		
		
		
		
		
		
	

