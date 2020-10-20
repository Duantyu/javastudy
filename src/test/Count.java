package test;

//类变量从某种意义上来说相当于其他程序语言中的全局变量，为所有对象所共享，类变量的内存空间在类的定义时就已经分配了

public class Count {
	private int serialNumber;
	private static int counter = 0;  //静态变量counter负责计数,类变量的定义
	public Count () {
		counter++;
	    serialNumber = counter;
	}
	public static void main(String args[]) {
		Count c1 = new Count(); //创建实例对象c1
		System.out.println(c1.serialNumber);
		System.out.println("Count.counter is " + Count.counter);
		//类变量的使用
		Count Tom = new Count();
		Count John = new Count();
		System.out.println("Tom's serialNumber is " + Tom.serialNumber);
		System.out.println("John's serialNumber is " + John.serialNumber);
		System.out.println("Now Count.counter is " + Count.counter);
		}
	}
