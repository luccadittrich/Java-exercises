public class Ponto {
    private double coordX, coordY;

    // construtor padrão
    public Ponto() {
        this.coordX = 0;
        this.coordY = 0;
    }

    // construtor parametrizado
    public Ponto(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    // método de acesso
    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    // método modificador

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    // método normal
    public String toString(){
        return "Ponto [X] " + coordX + "[Y] " + coordY;
    }





}
