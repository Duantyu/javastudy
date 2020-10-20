package test;

//定义抽象的类ObjectStorage
abstract class ObjectStorage {
	int objectnum = 0;
	//Objecct类是java的默认父类
	Object storage[] = new Object[100];
	
	//抽象的普通方法
	abstract void put(Object o);
	//抽象的构造方法
	abstract Object get();
}

//栈的存取
class Stack extends ObjectStorage{
	private int point = 0;
	
	//Stack类具体实现put方法
	public void put(Object o) {
		storage [point++] = o;
		objectnum++;
	}
	public Object get() {
		objectnum--;
		return storage[--point];
	}
}

//队列的存取
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
