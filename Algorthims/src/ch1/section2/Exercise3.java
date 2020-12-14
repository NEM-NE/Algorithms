package ch1.section2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise3 {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double min = Double.parseDouble(args[1]);
		double max = Double.parseDouble(args[2]);
		Interval2D[] intervals = new Interval2D[N];
		createFigure(intervals, min, max);
		int intersectNum = isInersect(intervals);
		int cotainNum = isContain(intervals);
		
		StdOut.println("Intersect Number is " + intersectNum);
		StdOut.println("Contain Number is " + cotainNum);
	}

	private static int isContain(Interval2D[] intervals) {
		int contain = 0;
		
		
		return contain;
	}

	private static int isInersect(Interval2D[] intervals) {
		int intersect = 0;
		
		for(int i = 0; i < intervals.length; i++) {
			for(int j = i; j < intervals.length; j++) {
				boolean isIntersect = intervals[i].intersects(intervals[j]);
				
				if(isIntersect) intersect++;
			}
		}
		
		return intersect;
	}

	private static void createFigure(Interval2D[] intervals, double min, double max) {
		StdDraw.setCanvasSize(1024, 512);
		StdDraw.setPenRadius(.015);
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		
		for(int i = 0; i < intervals.length; i++) {
			Interval1D width = generateInterval1D(min, max);
			Interval1D height = generateInterval1D(min, max);
			
			Interval2D interval = new Interval2D(width, height);
			intervals[i] = interval;
		}
	}

	private static Interval1D generateInterval1D(double min, double max) {
		double x = StdRandom.uniform(min, max);
		double y = StdRandom.uniform(min, max);
		
		if(x > y) {
			double temp = y;
			y = x;
			x = temp;
		}
		
		Interval1D interval1D = new Interval1D(x, y);
		
		return interval1D;
	}

}
