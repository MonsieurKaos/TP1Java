public class Circle {
    private int centreX;
    private int centreY;
    private float rayon;
    private float diametre;
    private float perimetre;

    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.setCentreX(1);
        c1.setCentreY(1);
        c1.setRayon(5.0F);
        c1.calDiametre();


    }
    public int calPerimetre(){
        this.perimetre = (float) (2* Math.PI*rayon);
        return (int) perimetre;
    }

    public int calDiametre() {
        return (int) (diametre*2);
    }

    public int getCentreX() {
        return centreX;
    }

    public void setCentreX(int centreX) {
        this.centreX = centreX;
    }

    public int getCentreY() {
        return centreY;
    }

    public void setCentreY(int centreY) {
        this.centreY = centreY;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }
}
