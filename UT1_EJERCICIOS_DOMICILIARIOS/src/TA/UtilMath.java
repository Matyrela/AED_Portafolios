package TA;
public class UtilMath {
    public static void main(String[] args) {
        System.out.println(sumaParesImpares(10)); //25
        System.out.println(sumaParesImpares(11)); //30
        System.out.println(sumaParesImpares(15)); //64

        System.out.println(factorial(6)); //720
    }

    public static int factorial(int num) {
        int contador = 1;
        for (int i = 1; i <= num; i++) {
            contador *= i;
        }
        return contador;
    }

    public static int sumaParesImpares(int num) {
        int sumaPares = 0;
        int sumaImpares = 0;
        int num2 = num;
        while (num2>0) {
            if (num2%2==0){
                sumaPares+=num2;
                num2--;
            }
            else {
                sumaImpares+=num2;
                num2--;
            }
        }
        if (isPrime(num)){
            return sumaPares;
        }
        else {
            return sumaImpares;
        }
    }
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
}