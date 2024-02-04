public class Fibonacci {
    public static void main(String[] args) {
        int primero = 0;
        int segundo = 1;

        for (int i=0; i<10; i++){
            int suma = primero + segundo;
            System.out.println(suma);
            primero = segundo;
            segundo = suma;
        }
    }
}
