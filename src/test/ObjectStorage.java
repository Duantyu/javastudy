package test;

//����������ObjectStorage
abstract class ObjectStorage {
	int objectnum = 0;
	//Objecct����java��Ĭ�ϸ���
	Object storage[] = new Object[100];
	
	//�������ͨ����
	abstract void put(Object o);
	//����Ĺ��췽��
	abstract Object get();
}

//ջ�Ĵ�ȡ
class Stack extends ObjectStorage{
	private int point = 0;
	
	//Stack�����ʵ��put����
	public void put(Object o) {
		storage [point++] = o;
		objectnum++;
	}
	public Object get() {
		objectnum--;
		return storage[--point];
	}
}

//���еĴ�ȡ
class Queue extends ObjectStorage {
	private int top = 0;
	private int bottom = 0;
	
	public void put(Object o) {
		storage[top++] = o;
		objectnum++;
	}
	public Object get() {
		objectnum--;
		return storage[bottom++];
	}
}
