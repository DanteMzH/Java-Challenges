import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("ingrese primera palabra");
        String word1 = input1.nextLine();

        System.out.println("ingrese segunda palabra");
        String word2 = input1.nextLine();

        StringBuilder word2Reverse = new  StringBuilder(word2).reverse();

        String reverse = word2Reverse.toString();

        boolean resultado = (word1.equals(reverse))? true: false;

        System.out.println(resultado);

    }

}
