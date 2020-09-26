package test;

class StaticVar {
	public static int number;
}
public class OtherClass {
	public void method () {
		int x = StaticVar.number;
	}

}
