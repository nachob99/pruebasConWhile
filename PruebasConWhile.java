
/**
 * Write a description of class pruebasconwhile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PruebasConWhile
{
    /**
     *Imprime todos los múltiplos de 5 comprendidos entre 10 y 95. 
     */
    public void multiplesDeCinco(){
     int index = 10;
     while (index <= 95){
         System.out.println(index);
         index= index+5;
     }
    } 
    
    /**
     * Suma los valores comprendidos entre 1 y 10 e imprime la suma después
     * de que el bucle haya terminado
     */
    public void sumaEntre1y10(){
        int index =0;
        int suma=0;
        while(index < 10){
              index++;
              suma=index+suma;
        }
        System.out.println(suma);
    }

    /** Metodo sum con bucle while que suma todos los números
     * comprendidos entre dos números a y b. Los valores de a y b pueden
     * pasarse al método sum como parámetros.
     */
    public void sum(int a, int b){
     int index=a;
     int suma=0;
     while(index <= b){
      suma=suma+index;
      index++;
     }
     System.out.println(suma);
    }

    public boolean numeroPrimo(int numero){
        int contador=2;
        boolean primo=true;
        while ((primo)&& (contador!=numero))
        {
            if(numero % contador==0){
                primo=false;
            }
            contador++;
        }
        return primo;
    }
 }