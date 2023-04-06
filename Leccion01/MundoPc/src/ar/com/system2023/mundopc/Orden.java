
package ar.com.system2023.mundopc;

public class Orden {
    private static int contadorOrdenes;
    private final int idOrden;
    private static final int MAX_COMPUTADORAS=10;
    private Computadora computadora[];
    private int contadorComputadora;
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.computadora=new Computadora[Orden.MAX_COMPUTADORAS];
    }
   
    public void agregarComputadora(Computadora computadora){
       if(this.contadorComputadora<Orden.MAX_COMPUTADORAS){
           this.computadora[this.contadorComputadora++]=computadora;
       }else{
           System.out.println("Ha superado el limite"+Orden.MAX_COMPUTADORAS);
       }
           
    }
public void mostrarOrden(){
    System.out.println("Orden #: "+this.idOrden);
    System.out.println("Computadoras de la orden #: "+this.idOrden);
    for(int i=0;i<this.contadorComputadora;i++){
        System.out.println(this.computadora[i]);
    }
}
    
    @Override
    public String toString() {
        return "Orden{" + "contadorOrdenes=" + contadorOrdenes + ", idOrden=" + idOrden + ", computadora=" + computadora + '}';
    }
    
}
