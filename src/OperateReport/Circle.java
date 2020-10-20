package OperateReport;

public class Circle extends Shape2 {
	protected float r;
	public Circle(float xx, float yy,float rr) {
		super(xx, yy);
		this.r = rr;
	}
	public float Area() {
		return (float) (Math.PI*r*r); 
	}
}
