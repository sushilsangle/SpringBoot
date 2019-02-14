package setsecond;

import java.awt.Point;

class Point
{
	protected int x,y;
	
	public Point(int _x, int _y)
	{
		x = _x;
		y = _y;
	}
}
public class Inherit 
{
	public static void main(String args[])
	{
		Point p = new Point(); //TODO Please define parameterized constructor to call Point(int _x, int _y)else we will get CE:constructor Point() is undefined
 
		
		System.out.println("x = " + p.x +", y = " + p.y);
	}
}
