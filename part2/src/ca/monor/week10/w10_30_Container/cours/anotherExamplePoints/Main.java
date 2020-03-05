package ca.monor.week10.w10_30_Container.cours.anotherExamplePoints;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<Point>();
        points.add(new Point(4, 8));
        points.add(new ColouredPoint(1, 1, "green"));
        points.add(new ColouredPoint(2, 5, "blue"));
        points.add(new ThreeDPoint(5, 2, 8));
        points.add(new Point(0, 0));
        points.add(new ThreedDColouredPoint(5, 7, 2, "rose"));

        for (Point point : points) {
            System.out.println(point);
        }
    }
}
