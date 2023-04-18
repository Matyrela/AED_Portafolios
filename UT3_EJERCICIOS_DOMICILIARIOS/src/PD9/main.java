package PD9;

public class main {
    public static void main(String[] args) {
        String bien = "{{}{}}";
        System.out.println(Expresion.controlCorchetes(bien.split("")));

        String mal = "{}{}}{}";
        System.out.println(Expresion.controlCorchetes(mal.split("")));

    }

    public class Expresion{
        public static boolean controlCorchetes(String[] parent){
            int controlador = 0;
            for (int i = 0; i < parent.length; i++) {
                switch (parent[i]){
                    case "{":
                        controlador += 1;
                        break;

                    case "}":
                        controlador -= 1;
                        break;
                }
                if(controlador < 0){
                    return false;
                }
            }
            return true;
        }
    }
}
