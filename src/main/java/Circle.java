public class Circle extends Shape {
    protected int xCentre;
    protected int yCentre;
    protected int radius;

    public Circle(int xCentre, int yCentre,int radius) {
        this.xCentre = xCentre;
        this.yCentre = yCentre;
        this.radius=radius;
    }
    @Override
    void draw(){
        System.out.println(super.color+" circle with centre in  ["+xCentre+", "+yCentre+"]"+" with radius = "+radius);
    }
}
