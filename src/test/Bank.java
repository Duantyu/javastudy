package test;

public class Bank {
	/**
	 * �����˻����
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
		System.out.println(Thread.currentThread().getName()+ "������ܽ�" +balance);
	}
}
