package Principal;
//clase que es el flyweihjt donde estan los atributos, de

public class Circulo implements Figura {
    private String color;
    private  int x;
    private  int y;
    private  int radio;

    public Circulo(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    //sobrescribe el metodo abstracto de la interfaz figura
    public void dibujar(){
        System.out.println("Circulo Dibujar [Color: "+color + ", x : " +x + ", y : " + y +", radio :" +radio);
    }
}
