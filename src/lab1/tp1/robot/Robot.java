
package lab1.tp1.robot;


public class Robot {
    private int bateria;
    private int numSerie;
    private double distReco;
    private boolean estado;

    public Robot(int bateria, int numSerie, double distReco, boolean estado) {
        this.bateria = bateria;
        this.numSerie = numSerie;
        this.distReco = distReco;
        this.estado = estado;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public double getDistReco() {
        return distReco;
    }

    public void setDistReco(double distReco) {
        this.distReco = distReco;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void avanzar(int pasos){
}
    public void retro(int pasos){
    }
    
}