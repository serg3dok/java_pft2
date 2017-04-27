package com.javaPft2.sandbox;

/**
 * Created by IEUser on 4/26/2017.
 */
public class Distance {
  public static void main(String[] args) {
    Point p1 = new Point(2, 3);
    Point p2 = new Point(-4, 0);

    System.out.println(distance(p1, p2));
  }

  public static double distance(Point a, Point b) {
    return  Math.sqrt((b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y) );
  }
}
