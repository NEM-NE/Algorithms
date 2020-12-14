package ch1.section2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise1 {

	//client side
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		
		Point2D[] points = new Point2D[N];
		createSquare(points);
		double answer = calculateDistanceToPoints(points);
		StdOut.printf("%.3f", answer);
	}

	private static double calculateDistanceToPoints(Point2D[] points) {
		double min = Double.MAX_VALUE;
		
		for(int i = 0; i < points.length; i++) {
			for(int j = i+1; j < points.length; j++) {
				double temp = points[i].distanceTo(points[j]);
				if(temp < min) {
					min = temp;
				}
			}
		}
		
		return min;
		
	}

	private static void createSquare(Point2D[] points) {
		StdDraw.setCanvasSize(1024, 512);
		StdDraw.setPenRadius(.015);
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		
		//create point
		for(int i = 0; i < points.length; i++) {
			double x = StdRandom.uniform();
			double y = StdRandom.uniform();
			
			points[i] = new Point2D(x, y);
			StdDraw.point(x, y);
			
		}
	}

}
