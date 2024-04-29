package designpattern.decorator;

public class Rectangle implements DrawShape {

	String color = "";

	public Rectangle(String color) {
		super();
		this.color = color;
	}
	
	public Rectangle() {
		
	}

	@Override
	public void drawShape() {
		System.out.println("Rectangle" + color);
		
	}


		
	}


