public class Rectangle extends Shape{
	int height,width;
	
	public Rectangle(String color,int height,int width){
		super(color);
		this.height=height;
		this.width=width;
	}
	@Override
	public double calculateArea(){
		return (this.height*this.width);
	}
	@Override
	public double calculatePerimeter(){
		return (2*(this.height+this.width));
	}
	@Override
	public void display(){
		System.out.println("This is a "+super.color+" "+"rectangle");
	}

}