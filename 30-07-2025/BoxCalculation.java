package pack2;

import java.util.Scanner;

public class BoxCalculation {

    public static void main(String args[]){

        //Area of rectangle
        Box<Integer> areaRectangle = new Box<>();
        areaRectangle.setLength(5);
        areaRectangle.setWidth(4);
        Integer areaRec = areaRectangle.getLength()*areaRectangle.getWidth();
        System.out.println("Area of rectangle:"+areaRec);

        //Area of circle
        Box<Double> areaCircle = new Box<>();
        areaCircle.setRadius(5.0);
        Double areacircle = areaCircle.getPI()*(areaCircle.getRadius()*areaCircle.getRadius());
        System.out.println("Area of circle:"+areaRec);

        //Area of triangle
        Box<Double> areaTriangle = new Box<>();
        areaTriangle.setLength(4.0);
        areaTriangle.setHeight(5.0);
        Double areatriangle = 0.5*(areaTriangle.getLength()*areaTriangle.getHeight());
        System.out.println("Area of triangle:"+areatriangle);

        //Perimeter of Square
        Box<Float> perimeterSquare = new Box<>();
        perimeterSquare.setLength(5.0f);
        Float perimetersquare = 4*perimeterSquare.getLength();
        System.out.println("Perimeter of Square: "+perimetersquare);

        Box<String> stringBox = new Box<>();
        stringBox.setText("Above the the complete examples of Generic class");
        System.out.println(stringBox.getText());

    }
}
