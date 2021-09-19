package org.tan90.training.designpatterns.factory;

public class ShapeFactory {
	
	public static GeometricShape getShape(ShapeType shapeType) {
		GeometricShape shape = null;
		switch (shapeType) {
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case CIRCLE: 
			shape = new Circle();
			break;
		case LINE:
			shape = new Line();
			break;
		default:
			break;
		}
		
		return shape;
	}

}
