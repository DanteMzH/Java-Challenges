import java.util.Scanner;

public class Poligonos {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        System.out.println("ingrese figura ");

        String figura = scan1.nextLine();

        int altura = Integer.parseInt(scan2.nextLine());
        int base = Integer.parseInt(scan3.nextLine());

        int Area;

        if (figura.equals("triangulo")){
            Area = (altura*base)/2;
        }
        else {
            Area = 2*altura*base;
        }
        System.out.println(Area);

    }
}
