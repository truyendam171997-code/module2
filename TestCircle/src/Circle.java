public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle() {}
    public double getRadius(){
        return this.radius;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }


}
