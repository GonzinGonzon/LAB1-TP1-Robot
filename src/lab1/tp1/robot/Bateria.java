
package lab1.tp1.robot;


public class Bateria {
  
    private String marca;
    private int carga;
    
     public Bateria () {
         this.carga=1000;  
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
     
 
}
