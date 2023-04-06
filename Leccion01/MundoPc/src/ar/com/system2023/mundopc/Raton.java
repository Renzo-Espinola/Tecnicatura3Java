
package ar.com.system2023.mundopc;


public class Raton extends DispositivoEntrada {
    private int contadorRatones=0;
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.contadorRatones+=1;
    }

    @Override
    public String toString() {
        return "Raton{" + "contadorRatones=" + contadorRatones + " Marca="+super.getMarca() + " Tipo Entrada=" + super.getTipoEntrada();
    }
     
}
