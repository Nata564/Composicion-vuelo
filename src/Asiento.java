public class Asiento {
    private String codigo;
    private boolean ocupado;

    public Asiento(String codigo) {
        this.codigo = codigo;
        this.ocupado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isOcupado() {
        return ocupado;
    }
    public void ocupar() {
      if (ocupado) {
         System.out.println("El asiento " + codigo + " ya está ocupado.");
      } else {
          this.ocupado = true;
          System.out.println("El asiento " + codigo + " ha sido ocupado.");
      }
    }
    public void liberar() {
       if (ocupado){
          this.ocupado = false;
          System.out.println("El asiento " + codigo + " ha sido liberado.");
      }else{
         System.out.println("El asiento " + codigo + " ya está libre.");
      }
    }
    public void mostrarEstado() {
        System.out.println("El asiento " + codigo + " está " + (ocupado ? "ocupado" : "libre"));
    }
}
