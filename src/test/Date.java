package test;
//程序5-2 构造方法与普通方法
public class Date {
	private int day, month, year;
	Date (int i, int j, int k) {  //这是个构造方法（1），参数为i,j,k
		day = i;
		month = j;
		year = k;
	}
	Date () {  //这是个构造方法（2），显示初始化
		day = 1;
		month = 1;
		year = 1998;
	}
	Date (Date d) {  //这是带一个参数的构造方法（ 3）
		day = d.day;
		month = d.month;
		year = d.year;
	}
		
	public void printDate() {  //定义控制台打印日期的方法
		System.out.println(day + "/" + month + "/" + year);		
	}
	
	public Date tomorrow() {  //定义返回Date类型的普通方法tomorrow()
		Date d = new Date(this);  //说明一个对象，this是调用自己
		d.day++;  //判断明天进入下一月份或下一年的情况
		if (d.day > d.daysInMonth()) {  //daysInMonth()返回每个月中不同的天数
			d.day = 1;  //重置天数
			d.month ++;  //月份加一
			if (d.month > 12) {				
				d.month = 1;  //重置月份
				d.year ++;  //年份加一
			}
	}
		return d;
	}
	private int daysInMonth() {  //返回每个月的天数
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			if (year % 4 == 0 && year % 100 != 0)  //闰年2月份天数为29
				return 29;
			else
				return 28;
		}
	}
	
	public static void main (String args[]) {
		Date d1 = new Date();  //new构造方法(2)
		System.out.println("The current date is (dd / mm / yy)：");
		d1.printDate();  //调用printDate()方法
		System.out.println();
		System.out.println("Its tomorrow is (dd / mm / yy)：");
		d1.tomorrow().printDate();  //可调用多重方法
		System.out.println();
		
		Date d2 = new Date(28, 2, 1964);  //new构造方法(1)
		System.out.println("The current date is (dd / mm / yy)：");
		d2.printDate();
		System.out.println();
		System.out.println("Its tomorrow is (dd / mm / yy)：");
		d2.tomorrow().printDate(); 
		System.out.println();		
	}
}
