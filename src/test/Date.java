package test;
//����5-2 ���췽������ͨ����
public class Date {
	private int day, month, year;
	Date (int i, int j, int k) {  //���Ǹ����췽����1��������Ϊi,j,k
		day = i;
		month = j;
		year = k;
	}
	Date () {  //���Ǹ����췽����2������ʾ��ʼ��
		day = 1;
		month = 1;
		year = 1998;
	}
	Date (Date d) {  //���Ǵ�һ�������Ĺ��췽���� 3��
		day = d.day;
		month = d.month;
		year = d.year;
	}
		
	public void printDate() {  //�������̨��ӡ���ڵķ���
		System.out.println(day + "/" + month + "/" + year);		
	}
	
	public Date tomorrow() {  //���巵��Date���͵���ͨ����tomorrow()
		Date d = new Date(this);  //˵��һ������this�ǵ����Լ�
		d.day++;  //�ж����������һ�·ݻ���һ������
		if (d.day > d.daysInMonth()) {  //daysInMonth()����ÿ�����в�ͬ������
			d.day = 1;  //��������
			d.month ++;  //�·ݼ�һ
			if (d.month > 12) {				
				d.month = 1;  //�����·�
				d.year ++;  //��ݼ�һ
			}
	}
		return d;
	}
	private int daysInMonth() {  //����ÿ���µ�����
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
			if (year % 4 == 0 && year % 100 != 0)  //����2�·�����Ϊ29
				return 29;
			else
				return 28;
		}
	}
	
	public static void main (String args[]) {
		Date d1 = new Date();  //new���췽��(2)
		System.out.println("The current date is (dd / mm / yy)��");
		d1.printDate();  //����printDate()����
		System.out.println();
		System.out.println("Its tomorrow is (dd / mm / yy)��");
		d1.tomorrow().printDate();  //�ɵ��ö��ط���
		System.out.println();
		
		Date d2 = new Date(28, 2, 1964);  //new���췽��(1)
		System.out.println("The current date is (dd / mm / yy)��");
		d2.printDate();
		System.out.println();
		System.out.println("Its tomorrow is (dd / mm / yy)��");
		d2.tomorrow().printDate(); 
		System.out.println();		
	}
}
