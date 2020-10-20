package test;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Student {
	//程序中属性定义私有化
	private int id;
	private String name;
	private String sex;
	private String date;
	public Student()
	{
		id = 0;
		name = "null";
		sex = "null";
		date = "null";
	}
	public Student(int Id, String Name,
			String Sex, String d)
	{
		id = Id;
		name = Name;
		sex = Sex;
		date = d;
	}
	//来自object基类的重载
	public String toString()
	{
		return "学号：" + id + "\t姓名：" + name +
				"\t性别：" + sex + "\t生日：" + date;
	}
	public static void main(String[] args) {
		Student stu= new Student();
		System.out.println(stu);
		Student gda = new Graduate();
		System.out.println(gda);
		Student stu1 = new Student();
		stu1.id = 201802175;
		/*等价于Graduate s = new Graduate(); System.out.println(s);需注意实例化对象的范围*/
		//set是集合
		Set<Student>setStu = new HashSet<Student>();
		setStu.add(stu);
		setStu.add(stu1);
		Vector vecStu = new Vector();
		vecStu.add(stu);
		vecStu.add(stu1);
		System.out.println("Vec Size: " + vecStu.size());
		System.out.println("Set Size: " + setStu.size());	
		//约瑟夫环
		int n = 10, m = 3;
		for (int i = 0; i < n; i++)
		{
			Student stu2 = 
					new Student(i, "张" + i,
							i % 2 == 0?"男":"女","20201015");
			vecStu.add(stu2);
		}
		int pos = 0;  //求得要删除的位置
		for (int i = 0; i < n - 1; i++)
		{
			//约瑟夫环的元素位置移动方式
			pos = (pos + m - 1) % vecStu.size();
			//删除指定位置的元素，并且把后面一个元素向前移动
			vecStu.removeElementAt(pos);
		}
		System.out.println("获胜者为：" + vecStu.get(0));
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getSex() {
		return sex;
	}
	public String getDate() {
		return date;
	}
		
}
