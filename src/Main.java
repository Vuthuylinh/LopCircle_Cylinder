public class Main {
    public static void main(String[] args) {
        Circle circle1= new Circle();
        System.out.println(" circle1: "+ circle1);

        Circle circle2= new Circle(10,"red" );
        System.out.println("circle2: "+ circle2);

        Cylinder cylinder1=new Cylinder();
        System.out.println("cylinder1: "+cylinder1+ "; volume = "+cylinder1.getVolume());

        Cylinder cylinder2= new Cylinder(5,"blue",10);
        System.out.println("cylinder2:"+cylinder2+ "; volume = "+ cylinder2.getVolume());

    }


}
