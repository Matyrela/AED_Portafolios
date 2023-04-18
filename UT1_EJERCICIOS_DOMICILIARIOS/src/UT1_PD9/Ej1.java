package UT1_PD9;

public class Ej1 {
    public static int factorial(int num){
        if(num < 0){
            return -1;
        }else if(num == 0){
            return 1;
        }

        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
