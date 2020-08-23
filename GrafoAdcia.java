public class GrafoAdcia{
  private int numVerts;
  static int maxVerts = 20;
  private VerticeAdy [] tablAdc;
  int [][] matAd; 

  public GrafoAdcia(int mx){
    this.tablAdc = new VerticeAdy[mx];
    this.numVerts = 0;
    maxVerts = mx;
    iniciarMatriz(mx);
  }

  public void iniciarMatriz(int mx){
    matAd = new int [mx][mx];
    for (int i = 0; i < mx; i++)
      for (int j = 0; i < mx; i++)
        matAd[i][j] = 0;
  }

  public void nuevoVertice (String nom){
    boolean esta = (numVertice(nom) >= 0);
    if (!esta){
      VerticeAdy v = new VerticeAdy(nom);
      v.asignarVertice(numVerts);
      this.tablAdc[numVerts++] = v;
    }
  }

  public int numVertice(String vs){
    VerticeAdy v = new VerticeAdy(vs);
    boolean encontrado = false;
    int i = 0;

    while((i < numVerts) && !encontrado){
			encontrado = tablAdc[i].equals(v);
      
			if(!encontrado){
        i++;
      }

		}

    return (i < this.numVerts) ? i : -1;

  }

  public void nuevoArco(String a, String b, int peso) throws Exception {
		int va, vb;
		va = numVertice(a);
		vb = numVertice(b);
		if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
    matAd[va][vb] = peso;
	}

  public boolean adyacente(String a, String b)throws Exception{
    int va, vb;
    va = numVertice(a);
    vb = numVertice(b);
    if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
      return matAd[va][vb] == 1;
  }

  public boolean adyacente(int va, int vb)throws Exception{
    if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
      return matAd[va][vb] == 1;
  }

  public void imprimir(){
    System.out.println("\nMatriz de adyacencia Resultante");

    for (int i = 0; i < this.maxVerts; i++){
      System.out.println("\n");
      for (int j = 0; j < this.maxVerts; j++){
        if(this.matAd[i][j] > 9){
          System.out.print(" "+this.matAd[i][j]);
        }else{
          System.out.print("  "+this.matAd[i][j]);
        }
      }
    }
  }

}