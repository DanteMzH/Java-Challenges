public class PasarValor {
    public static void main(String[] args) {
        int primitivo = 10;
        modifiValue(primitivo);
        System.out.println(primitivo);
    }

    public static void modifiValue(int value){
        value = 30;
    }

}
