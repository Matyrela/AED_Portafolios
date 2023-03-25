package UT1_PD9;

public class Ej2 {
    /**
     Hacer un programa en Java que indique si un número dado es primo. Si lo es, el programa
     deberá calcular la suma de los números pares desde 0 hasta el número dado, y en caso
     contrario deberá calcular la suma de los números impares desde 0 hasta el número dado.
     Utilizar solamente sentencias while o do-while.
     Posible código para calcular si un número es primo:
     */

    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
            }
        if (( n%2 !=0 && prime && n > 2) || n == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static int whileIsPrime(long n) {
        boolean prime = true;
        long i = 3;
        while(i <= Math.sqrt(n)){
            i += 2;
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (( n%2 !=0 && prime && n > 2) || n == 2) {
            int sumita = 0;
            int j = 0;
            while (j < n) {
                j += 1;
                if(j % 2 == 0){
                    sumita += j;
                }
            }
            return sumita;
        } else {
            int sumita = 0;
            int j = 0;
            while (j < n) {
                j += 1;
                if(j % 2 != 0){
                    sumita += j;
                }
            }
            return sumita;
        }
    }

    public static void main(String[] args) {
        System.out.println(whileIsPrime(31));
        System.out.println(isPrime(31));
    }
}
