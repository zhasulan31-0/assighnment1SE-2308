package models;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private List<Point> points;

    public Shape() {
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);
            perimeter += currentPoint.distance(nextPoint);
        }

        perimeter += points.get(points.size() - 1).distance(points.get(0));

        return perimeter;
    }

    public double getAverageSide() {
        double totalDistance = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);
            totalDistance += currentPoint.distance(nextPoint);
        }

        totalDistance += points.get(points.size() - 1).distance(points.get(0));

        return totalDistance / points.size();
    }

    public double getLongest() {
        double longestSide = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);
            double currentDistance = currentPoint.distance(nextPoint);

            if (currentDistance > longestSide) {
                longestSide = currentDistance;
            }
        }

        double closingDistance = points.get(points.size() - 1).distance(points.get(0));
        if (closingDistance > longestSide) {
            longestSide = closingDistance;
        }

        return longestSide;
    }
}
