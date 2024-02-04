public class Primos {
    public static void main(String[] args) {
        int i = 1;
        int n = 14;

        while ( i < 100){
            if (  n % i != 0){
                i++;
            }
            else {
                System.out.println( n + "es primo");
                return;
            }
        }
    }
}
