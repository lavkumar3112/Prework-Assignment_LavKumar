public class Main{
	public static void main(String args[]){
		Circle circle=new Circle("red",3);
		System.out.println("Area of Circle : "+circle.calculateArea());
		System.out.println("Perimeter of Circle : "+circle.calculatePerimeter());
		circle.display();

		Rectangle rectangle=new Rectangle("blue",5,6);
		System.out.println("Area of Rectangle : " +rectangle.calculateArea());
		System.out.println("Perimeter of Rectangle : "+rectangle.calculatePerimeter());
		rectangle.display();

		Square square=new Square("green",8);
		System.out.println("Area of Square : "+square.calculateArea());
		System.out.println("Perimeter of Square : "+square.calculatePerimeter());
		square.display();

		Triangle triangle=new Triangle("yellow",5,7);
		System.out.println("Area of Triangle: "+triangle.calculateArea());
		System.out.println("Perimeter of Triangle : "+triangle.calculatePerimeter());
		triangle.display();


	}
}