package OperateReport;

public abstract class Shape2 {
	protected float x, y;
	//�����
	public Shape2(float xx, float yy) {
		this.x = xx;
		this.y = yy;
	}
	//�������ķ���
	public abstract float Area();
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float distance(Shape2 shape) {
		float d = 0;
		d = (float)Math.sqrt(Math.pow(x - shape.getX(), 2) + Math.pow(y - shape.getY(), 2));
		return d;
	}
}

