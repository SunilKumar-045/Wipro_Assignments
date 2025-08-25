package pack2;
import java.util.*;
public class Box <T>{
    private T length;
    private T width;
    private T radius;
    private T height;
    private double PI = 3.14;
    private T text;




    public Box() {
        this.length=null;
        this.width=null;
        this.height=null;
    }

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getRadius() {
        return radius;
    }

    public void setRadius(T radius) {
        this.radius = radius;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public T getText() {
        return text;
    }

    public void setText(T text) {
        this.text = text;
    }
}
