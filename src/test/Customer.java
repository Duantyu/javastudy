package test;

public class Customer extends Thread{
	/**
	 * �� ���췽���Ĳ��������߳�
	 * @param s
	 */
	public Customer(String s)
	{
		super(s);
	}
	
	//�˿ͻ�����
	public void run()
	{
		for(int i = 0; i < 3; i++)
		{
			Bank.deposit(100);
		}
	}
	
}
