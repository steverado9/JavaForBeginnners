import java.awt.*;

//How memory allocation works for primitive and reference types
public class MemoryAllocation {
    public static void main(String[] args) {
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        //meaning point1 and point2 are referencing the same object not storing it in their memory

    }
}
