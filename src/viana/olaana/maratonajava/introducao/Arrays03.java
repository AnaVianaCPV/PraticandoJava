package viana.olaana.maratonajava.introducao;

public class Arrays03 {
    public static void main(String[] args) {
       // int[] numeros= new int[3];
    //    int[] numeros2= {10,25,32,42,55};
        int[] numeros3= new int[] {10,25,32,42,55};

    //    for (int i=0; i< numeros3.length; i++){
     //       System.out.println(numeros3[i]);  }

          for (int num : numeros3) {
              System.out.println(num);
          }
    }
}
