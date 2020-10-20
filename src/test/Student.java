package test;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Student {
	//���������Զ���˽�л�
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
	//����object���������
	public String toString()
	{
		return "ѧ�ţ�" + id + "\t������" + name +
				"\t�Ա�" + sex + "\t���գ�" + date;
	}
	public static void main(String[] args) {
		Student stu= new Student();
		System.out.println(stu);
		Student gda = new Graduate();
		System.out.println(gda);
		Student stu1 = new Student();
		stu1.id = 201802175;
		/*�ȼ���Graduate s = new Graduate(); System.out.println(s);��ע��ʵ��������ķ�Χ*/
		//set�Ǽ���
		Set<Student>setStu = new HashSet<Student>();
		setStu.add(stu);
		setStu.add(stu1);
		Vector vecStu = new Vector();
		vecStu.add(stu);
		vecStu.add(stu1);
		System.out.println("Vec Size: " + vecStu.size());
		System.out.println("Set Size: " + setStu.size());	
		//Լɪ��
		int n = 10, m = 3;
		for (int i = 0; i < n; i++)
		{
			Student stu2 = 
					new Student(i, "��" + i,
							i % 2 == 0?"��":"Ů","20201015");
			vecStu.add(stu2);
		}
		int pos = 0;  //���Ҫɾ����λ��
		for (int i = 0; i < n - 1; i++)
		{
			//Լɪ�򻷵�Ԫ��λ���ƶ���ʽ
			pos = (pos + m - 1) % vecStu.size();
			//ɾ��ָ��λ�õ�Ԫ�أ����ҰѺ���һ��Ԫ����ǰ�ƶ�
			vecStu.removeElementAt(pos);
		}
		System.out.println("��ʤ��Ϊ��" + vecStu.get(0));
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
