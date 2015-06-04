package p1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point (2, 4);
        Point p2 = new Point (4, 2);
        HashSet<Point> hashSet = new HashSet<Point>();
        hashSet.add(p1);
        hashSet.add(p2);
        System.out.println("HashSet: \t" + hashSet.toString() + " (" + hashSet.size() + ")");
    }
}
