public class PasarReferencia {
    public static void main(String[] args) {
        Integer numero = 10;
        referenceValue(numero);
        System.out.println(numero);

    }

    public static void referenceValue(Integer value){

        value =20;
    }

}
