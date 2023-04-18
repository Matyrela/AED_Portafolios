package UT1_PD8;

public class Marcapasos {
    short presionSanguinea; //2 bytes
    short frecuenciaCartiaca; //2 bytes
    short nivelAzucar; //2 bytes
    long maximaFuera; // 8 bytes
    float minimoTiempo; // 4 bytes
    double bateriaRestante; //8 bytes
    char[] codigoFabricante = new char[8];


    //Ocupa 42bytes + 12bytes del objeto + 2 bytes para que sea multiplo de 8.

}