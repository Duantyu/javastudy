package test;

public class Customer extends Thread{
	/**
	 * 用 构造方法的参数区别线程
	 * @param s
	 */
	public Customer(String s)
	{
		super(s);
	}
	
	//顾客汇款操作
	public void run()
	{
		for(int i = 0; i < 3; i++)
		{
			Bank.deposit(100);
		}
	}
	
}
