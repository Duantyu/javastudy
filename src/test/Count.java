package test;

//�������ĳ����������˵�൱���������������е�ȫ�ֱ�����Ϊ���ж�����������������ڴ�ռ�����Ķ���ʱ���Ѿ�������

public class Count {
	private int serialNumber;
	private static int counter = 0;  //��̬����counter�������,������Ķ���
	public Count () {
		counter++;
	    serialNumber = counter;
	}
	public static void main(String args[]) {
		Count c1 = new Count(); //����ʵ������c1
		System.out.println(c1.serialNumber);
		System.out.println("Count.counter is " + Count.counter);
		//�������ʹ��
		Count Tom = new Count();
		Count John = new Count();
		System.out.println("Tom's serialNumber is " + Tom.serialNumber);
		System.out.println("John's serialNumber is " + John.serialNumber);
		System.out.println("Now Count.counter is " + Count.counter);
		}
	}
