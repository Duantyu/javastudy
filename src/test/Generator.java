package test;

//<T>抽象中的抽象
public interface Generator<T> {
	//使用泛型定义接口的返回参数
	public T next();  	
}
