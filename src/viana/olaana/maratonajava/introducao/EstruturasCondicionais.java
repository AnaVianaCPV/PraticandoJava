package viana.olaana.maratonajava.introducao;

public class EstruturasCondicionais {
  public static void main(String[] args){
      int idade=18;
      boolean isAutorizadoBebida= idade>=18;
      if (isAutorizadoBebida){
          System.out.println("Autorizado");
      //if(idade>=18) {
     //     System.out.println("Maior de IDADE");
      }
      if (!isAutorizadoBebida)
      //if (isAutorizadoBebida==False)
      System.out.println("Não Autorizado!");
    //  if(idade<18)
     //     System.out.println("Menor de IDADE");
  }
}