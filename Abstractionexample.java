package com.javaoopspractice;

abstract class Shape{
	String color;
	
	abstract double area();
	 
	abstract String toString();
	
	public Shape (String color) {
		System.out.println("Shape constructer is used");
		this.color=color;
	}
	public String getcolor() {
		return color;
	
	}
	class Circle extends Shape{
		double radius;
	    public Circle (String color,double radius) {
	    	super (color);
	    	System.out.println("Shape constructer called ");
	    	this.radius =radius;
	    	
	    }
	    @Override double area() {
	     return	Math.PI * Math.pow(radius, 2);
	     
	    }
	    @Override public String toString() {
	    	return "color of the circle is" + super.getcolor() + "The area of circle is " +area();
	    }
		
	}
	
	class Rectangle extends Shape {
		double length;
		double width;
		public Rectangle(String color ,double length, double width) {
			super(color);
			System.out.println("Shape constructor is called");
			this.length=length;
			this.width=width;
		}
		
		@Override double area() {
			return length* width ;
		}
		
		@Override public String toString(){
			return "color of rectangle is" + super.getcolor() + "the area of rectangle is " +area();
			
		
		}
	}
class Main{
	public static void main(String[] args){
		Shape s1 = new Circle("Red ", 1.2);
		
		Shape s2 = new Rectangle("Blue", 4 , 6);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}




 

}
