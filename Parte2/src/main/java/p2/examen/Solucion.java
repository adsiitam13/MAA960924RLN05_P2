package p2.examen;
public class Solucion {

  
   public static boolean problema(String s){
        
        int i=1;
        int l=s.length();
        boolean sePuede=false;

        while(!sePuede && i<l){
            // crea una subcadena de tamaño i
            String aux=s.substring(0,i);
            // calcula cuantas veces cabe la sub cadena en la cadena original
            int tamMax=l/i;
          
            int i2=1;
            
            //concatena la subcadena
            String creada=aux;

            while(!sePuede && i2<=tamMax){
                if(s.equals(creada)){
                    sePuede=true;
                }else{
                    i2++;
                    creada+=aux;
                }
            }
            
            i++;
            
        }
     
        return sePuede;
    }
  
  public static void main(String[] args) {
    String prueba1="abab";
    System.out.println("Cadena:"+prueba1+"\n "+problema(prueba1));
    
    String prueba2="ababa";
    System.out.println("Cadena:"+prueba1+"\n "+problema(prueba2));
    
    String prueba3="gustavogustavogustavo";
    System.out.println("Cadena:"+prueba1+"\n "+problema(prueba3));
  }
}
