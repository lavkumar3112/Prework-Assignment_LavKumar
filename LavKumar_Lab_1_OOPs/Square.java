public class Square extends Shape{
	int side;
	public Square(String color,int side){
		super(color);
		this.side=side;
	}
	@Override
	public double calculateArea(){
		return this.side*this.side;
	}
	@Override
	public double calculatePerimeter(){
		return 4*this.side;
	}
	@Override
	public void display(){
		System.out.println("This is a "+super.color+" square");
	}
}