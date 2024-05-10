import java.lang.Math;

public class Circulo extends Ponto {
    private double raio;

    // construtor padrão
    public Circulo(){
        super();
        raio = 1.0;
    }

    //construtor parametrizado
    public Circulo(double x, double y, double r){
        super(x, y);
        setRaio(r);
    }

    // método de acesso
    public double getRaio() {
        return raio;
    }

    // método modificador
    public void setRaio(double r) {
        if(r >= 0){
            raio = r;
        }
    }

    public double diametro(){
        return 2 * raio;
    }

    public double perimetro(){
        return 2 * Math.PI * raio;
    }

    public double area(){
        return Math.PI * raio * raio;
    }

    public String toString(){
        return "Círculo: [raio=" + raio + "]" + super.toString();
    }







}
