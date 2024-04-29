package designpattern.decorator;

public class DrawDecorator extends Draw implements DrawShape {

	public DrawShape shape;
	
	
	public DrawDecorator(DrawShape shape) {
		super();
		this.shape = shape;
	}


	@Override
	public void drawShape() {

		shape.drawShape();
		
	}


	@Override
	public void doColor() {
		
		
	}

}
