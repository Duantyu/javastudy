package test;

public class PassValue {
	float pvValue;  //�ص����ʣ�����main�����Ĺ�ϵ
	
	//�޸ĵ�ǰֵ�ķ���
	public void changeInt(int value) {
		value  = 55;
	}
	
	public void changeStr(String value) {
		value = new String ("different");  //changeStr()���ı�String���󣬵��ı���PassValue���������
	}
	public void changeObjValue (PassValue ref) {  //�˷����Ĳ�����һ������
		ref.pvValue = 99f;
	}	
	
	
	public static void main (String args[]) {
		String str;
		int val;
				
		//������õ�ʵ��
		PassValue pv = new PassValue();
		
		//�����ͱ�����ֵ
		val = 11;
		//�ı�val��ֵ
		pv.changeInt(val);  //����ִ���귽����䣬������val�������Ӱ��
		//val��ǰ��ֵ
		System.out.println("The val is: " + val);  //ֻ�Ǵ�����val��ֵ11����û�иı�val���������
		
		//���ַ���str��ֵ
		str = new String ("hello");
		pv.changeStr(str);  //���ݱ���������ִ���귽�����˳������ݲ��ı䡣
		//str��ǰ��ֵ
		System.out.println("The str value is: " + str); 
		
		//��ptValue��ֵ
		pv.pvValue = 101f;   
		//����ͨ���Զ������ø�ֵ
		pv.changeObjValue(pv);  //����pv��Ϊ�������ݸ�changeObjValue()��������������ݱ��ı���
		//��ǰ��ֵ��ʲô
		System.out.println("Current pvVlaue is: " + pv.pvValue);
	}
	
}
		
		
		
		
		
		
	

