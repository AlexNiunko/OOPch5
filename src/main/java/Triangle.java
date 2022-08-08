public class Triangle extends Shape{
    private int xCentre;
    private int yCentre;
    private int a;
    private int b;
    private int c;

    public Triangle(int xCentre, int yCentre, int a, int b, int c) {
        this.xCentre = xCentre;
        this.yCentre = yCentre;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void draw() {
        System.out.println(super.color+" triangle with center in ["+xCentre+", "+yCentre+"] with length = "+a+" "+b+" "+c);
    }
}
