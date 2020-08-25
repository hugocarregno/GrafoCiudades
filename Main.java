class Main {
  public static void main(String[] args){
    System.out.println("Implementa el grafo de ciudades que se ve en la imagen ");
    System.out.println("Escribe las clases y los métodos necesarios para soportar la estructura. Luego ingresa los datos que se observan en la imagen");
    try{

    GrafoAdcia grafo = new GrafoAdcia(7);

    grafo.nuevoVertice("La Toma");
    grafo.nuevoVertice("San Luis");
    grafo.nuevoVertice("El Morro");
    grafo.nuevoVertice("Fraga");
    grafo.nuevoVertice("Villa Mercedes");
    grafo.nuevoVertice("Justo Daract");
    grafo.nuevoVertice("Las Isletas");

    grafo.nuevoArco("La Toma","San Luis",80);
    grafo.nuevoArco("San Luis","La Toma",80);
    grafo.nuevoArco("La Toma","El Morro",29);
    grafo.nuevoArco("El Morro","La Toma",29);
    grafo.nuevoArco("San Luis","Fraga",56);
    grafo.nuevoArco("Fraga","San Luis",56);
    grafo.nuevoArco("El Morro","Villa Mercedes",54);
    grafo.nuevoArco("Villa Mercedes","El Morro",54);
    grafo.nuevoArco("Fraga","Villa Mercedes",36);
    grafo.nuevoArco("Villa Mercedes","Fraga",36);
    grafo.nuevoArco("Villa Mercedes","Las Isletas",21);
    grafo.nuevoArco("Las Isletas","Villa Mercedes",21);
    grafo.nuevoArco("Villa Mercedes","Justo Daract",40);
    grafo.nuevoArco("Justo Daract","Villa Mercedes",40);
    grafo.nuevoArco("Las Isletas","Justo Daract",37);
    grafo.nuevoArco("Justo Daract","Las Isletas",37);

    
    grafo.imprimir(); 
    }catch(Exception e){
      System.out.println(e.getMessage());
    }



    
  }
}