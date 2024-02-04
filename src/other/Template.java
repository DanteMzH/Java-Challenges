package other;

import java.util.SimpleTimeZone;

public class Template {

    private String marca;
    private String color;



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String description(){

        return "el fabicante" + this.marca;

    }
    public String frenar(){

        return "el tipo" + this.color;

    }


}
