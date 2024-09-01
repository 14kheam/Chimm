public class Example {

public static void main(String{} args) {
    //find the volume and surface area of a cylinder
    //Volume = πr2*h
    //Area = 2πrh + 2πr2
    //exampleinput radius = 24 height = 7
    //Volume = 1266.9 & Surface are = 4674.4

    
    Scanner scnr = new Scanner(System.in);
    double radius = scnr.nextDouble();
    double height = scnr.nextDouble();
    double volume,surfaceArea;

    volume = Math.PI*(Math.pow(radius, 2))*height;
    surfaceArea = (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius, 2));
    System.out.printf("Volume: %. 1f",volume);
    System.out.println();
    Systm.out.printf("Surface Area: %. 1f",surfaceArea);


