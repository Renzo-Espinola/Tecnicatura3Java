package ar.com.system2023.mundopc;


public class Teclado extends DispositivoEntrada {
    private int contadorTeclado=0;
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        contadorTeclado+=1;
    }

    @Override
    public String toString() {
        return "Teclado{" + "contadorTeclado=" + contadorTeclado + " Marca="+super.getMarca() + " Tipo Entrada=" + super.getTipoEntrada();
    }
    
}
