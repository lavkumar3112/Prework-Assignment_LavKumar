public class Circle extends Shape{
	int radius;
	final double PI=3.14;
	public Circle(String color,int radius){
		super(color);
		this.radius=radius;
	}
	@Override
	public double calculateArea(){
		return PI*this.radius*this.radius;
	}
	@Override
	public double calculatePerimeter(){
		return 2*PI*this.radius;
	}
	@Override
	public void display(){
		System.out.println("This is a "+super.color+" "+"circle");
	}
}