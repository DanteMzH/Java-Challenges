public class DataTypes {
    public static void main(String[] args) {

        for(int i =0; i <=100; i++ ){

            if ( i % 3 == 0 || i % 5 ==0){
                String mensaje = (i %3 ==0) ? "fizz":"buzz";
                System.out.println(mensaje);
            }
            else {
                System.out.println(i);
            }

        }
    }
}
