public class VerticeAdy{
  private String nombre;
  private int numVertice;
  
  // constructor de la clase
  public VerticeAdy(String x){
    this.nombre = x;
    this.numVertice = -1;
  }

  public String nombreVertice(){
    // devuelve identificador del vértice
    return this.nombre;
  }

  public boolean equals(VerticeAdy n){ 
    // true, si dos vértices son iguales
    return this.nombre.equals(n.nombre);
  }

  public void asignarVertice(int n){
    // establece el número de vértices
    this.numVertice = n;
  }

  public String toString(){
    // características del vértice
    return this.nombre + " (" + this.numVertice + ")";
  }
  
}