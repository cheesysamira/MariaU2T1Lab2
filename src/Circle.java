public class Circle {
    private  double Radius;

    public Circle(double radius) {
        Radius = radius;
        }

    public void printArea() {
        double area = (Radius*Radius) * Math.PI;
        System.out.println("A circle with a radius " + Radius + " has an area of " + area);
    }
}