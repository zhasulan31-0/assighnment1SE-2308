import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/a.khaimuldin/IdeaProjects/assignment1se2313/src/source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println("Line: " + line);
            String[] coordinates = line.split(" ");
            double x = Double.parseDouble(coordinates[0]);
            double y = Double.parseDouble(coordinates[1]);

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongest());
    }
}
