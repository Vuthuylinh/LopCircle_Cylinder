public class Cylinder extends Circle {
    private double height =15;

    public Cylinder() {
    }

    public Cylinder(double heigh) {
        this.height = heigh;
    }

    public Cylinder(double radius, String color, double heigh) {
        super(radius, color);
        this.height = heigh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getRadius()*getRadius()*this.height*Math.PI;
    }

    @Override
    public String toString(){
        return "A cylinder with radius ="+ getRadius()+ ", color: "+ getColor()+ ", height: "+ getHeight()+ super.toString();
    }
}
