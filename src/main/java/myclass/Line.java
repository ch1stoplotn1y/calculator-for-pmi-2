package myclass;
/**
 * Даны 2 точки в пространстве (x1, y1) и (x2, y2). Ищем Y координату третьей точки (x3, y3),
 * которая находится на той же прямой что и первые две.
 */
public class Line {
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return (double) ((x3 - x1) * (y2 - y1)) / (x2 - x1) + y1;
    }
}