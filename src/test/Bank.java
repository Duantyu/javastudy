package test;

public class Bank {
	/**
	 * 银行账户金额
	 */
	public static int balance = 0;
	public synchronized static void deposit(int b)
	{
		balance += b;
		try
		{
			Thread.sleep((int) (1000));
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println(Thread.currentThread().getName()+ "汇款后的总金额：" +balance);
	}
}
