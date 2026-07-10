public class Vuelo {
    private String numero,origen,destino;
    private int capacidadMaxima;
    private Asiento[] asientos;
 
    public Vuelo(String numero, String origen, String destino) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;       
    }
    public Vuelo(String numero, String origen, String destino,int capacidadMaxima) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;       
        this.capacidadMaxima = capacidadMaxima;
        this.asientos = new Asiento[capacidadMaxima];
        for(int i=0;i<capacidadMaxima;i++){
            asientos[i]=new Asiento("A"+(i+1));
        }
    }

 public String getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

   public void mostrarInfo(){
    System.out.println("Vuelo"+ numero + "\nOrigen:"+ origen + "/Destino" + destino + "\nCapacidad maxima:" + capacidadMaxima);
   }
   public void mostrarAsientos(){
    System.out.println("estado de asientos del vuelo " + numero);
    for(Asiento a : asientos){
        a.mostrarEstado();
    }
   }
   public void embarcar(String codigoAsiento){
    for(Asiento a : asientos){
        if(a.getCodigo().equals(codigoAsiento)){
            a.ocupar();
            return;
        }
    }
    System.out.println("El asiento " + codigoAsiento + " no se encontro en el vuelo " + numero + ".");
   }
   public void desembarcar(String codigoAsiento){
    for(Asiento a : asientos){
        if(a.getCodigo().equals(codigoAsiento)){
            a.liberar();
            return;
        }
    }
    System.out.println("El asiento " + codigoAsiento + " no se encontro en el vuelo " + numero + ".");
   }
}
