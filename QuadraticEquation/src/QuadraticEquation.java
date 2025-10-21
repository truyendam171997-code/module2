public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public void result() {
        if (getDiscriminant() < 0) {
            System.out.println("The equation has no real roots");
        }
        else if (getDiscriminant() == 0) {
            System.out.println("The equation has one real root: " + getRoot1());
        }
        else {
            System.out.println("The equation has two real roots: " + getRoot1() + " and " + getRoot2());
        }

    }
}
