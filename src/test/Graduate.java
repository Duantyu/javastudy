package test;

public class Graduate extends Student {
	private String subject;
	private String advise;
	public Graduate ()
	{
		super();
		subject = "רҵδ��";
		advise = "��ʦδ��";
	}
	public Graduate (int Id, String Name,
			String Sex, String d,
			String sub, String adv)
	{
		super(Id, Name, Sex, d);
		subject = sub;
		advise = adv;
	}
	public String toString()
	{
		//�����еĻ������ԣ���ֱ�ӵ��ø��ඨ��ķ���
		return super.toString() + 
				"\tרҵ��" + subject + "\t��ʦ��" + advise;
	}

}
