package UT1_PD7;

import java.util.Arrays;

public class Ej1 {
<<<<<<< HEAD
  public static void main(String[] args){
      String s = "1";
      while (s != "1000") {
          s += "0";


          System.out.println(s);
      }
  }
}

//¿Por qué esto es así?
//¿Qué diferencia representa con otros lenguajes como C#?

//R: porque los strings se tienen que comparar con equals();
//R: en C# si se puede.
=======
    public static void main(String[] args) {
        String s = "1";

        while (s != "1000") {
            s += "0";
        }




    }




    //¿Por qué esto es así? ¿Qué diferencia representa con otros lenguajes como C#?
    //R: En java no se pueden comparar string con ==, es necesario usar .equals(""); o .equalsIgnoreCase("");
}
>>>>>>> 34624692425c17b0e48a0f4b0e22f8991e7556dd
