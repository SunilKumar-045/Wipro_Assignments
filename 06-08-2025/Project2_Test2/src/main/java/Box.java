package main.java;

public class Box {

	public double circleArea(double radius) {
		double PI = 3.14;
		double area = PI*Math.pow(radius, 2);
		return area;
	}
	
	public double triangleArea(int base,int height) {
		return 0.5*(base*height);
	}
	
	public int squareArea(int side) {
		return (side*side);
	}

	public int rectangleArea(int length,int breadth) {
		return (length*breadth);
	}
	
	public double simpleInterest(int principle,int time,int rate) {
		return (principle*time*rate)/100;
	}
	
	public double amount(int p,int t,int r) {
		double si = simpleInterest(p,t,r);
		double amount = si + Math.pow((p*(1+r/100)), t);
		return amount;
	}
}
