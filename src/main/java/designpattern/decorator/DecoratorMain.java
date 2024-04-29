package designpattern.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle("red");
		
		DrawDecorator d = new DrawDecorator(r);
		
	}

}
