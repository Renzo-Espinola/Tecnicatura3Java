package ar.com.system2023.mundopc;


public class Monitor {
    private int contadorMonitor=0;
    private int idMonitor;
    private String marca;
    private String tamaño;
    
    public Monitor(String marca,String tamaño){
        contadorMonitor+=1;
        this.idMonitor=contadorMonitor;
        this.marca=marca;
        this.tamaño=tamaño;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" + "contadorMonitor=" + contadorMonitor + ", idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}
