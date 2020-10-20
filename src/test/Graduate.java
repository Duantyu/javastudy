package test;

public class Graduate extends Student {
	private String subject;
	private String advise;
	public Graduate ()
	{
		super();
		subject = "专业未定";
		advise = "导师未定";
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
		//基类中的基本属性，可直接调用父类定义的方法
		return super.toString() + 
				"\t专业：" + subject + "\t导师：" + advise;
	}

}
