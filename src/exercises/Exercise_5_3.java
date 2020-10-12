package exercises;
//抽象类是定义了方法但没有定义具体实现的类

public class Exercise_5_3 {

}

//错误：class alarmclock {abstract void alarm();}

//错误：abstract alarmclock {abstract void alarm();}

//错误：class abstract alarmclock {abstract void alarm();}

abstract class alarmclock {
	abstract void alarm();
}

//错误：abstract class alarmclock {	abstract void alarm() {	System.out.println("alarm");}}