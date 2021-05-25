package test;

public class TestMatrices {
    public static void main(String[] args) {
        // No hace falta que las matrices sean cuadrada, es decir mismo numero de col y fila
        int edades[][] = new int[3][2]; // 3 filas por 2 columnas.
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        // System.out.println("edades 0-0 = " + edades[0][0]);
        
        for(int fila=0; fila < edades.length; fila++) {
            for(int columna=0; columna < edades[fila].length; columna++) {
                System.out.println("edades[" + fila + "][" + columna + "]: " + edades[fila][columna]);
            }
        }
        
        // Sintaxis simplificada
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora", "Mora"}};
        for(int i=0; i < frutas.length; i++){
            for(int j=0; j < frutas[i].length; j++){
                System.out.println("frutas[" + i + "][" + j + "]: " + frutas[i][j]);
            }
        }
    }
}
