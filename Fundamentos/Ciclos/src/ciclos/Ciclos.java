package ciclos;

public class Ciclos {

    public static void main(String[] args) {
        /************************************* WHILE *************************************/
        System.out.println("************************************* WHILE *************************************");
        var contadorWhile =  0;
        while( contadorWhile < 3) {
            System.out.println("contadorWhile = " + contadorWhile);
            contadorWhile++;
        }
        
        
        /************************************* DO WHILE *************************************/
        System.out.println("************************************* DO WHILE *************************************");
        var contadorDoWhile = 4;
        
        do {
            System.out.println("contadorDoWhile = " + contadorDoWhile);
            contadorDoWhile++;
        } while( contadorDoWhile < 3);
        
        
        /************************************* FOR *************************************/
        System.out.println("************************************* FOR *************************************");     
        for(var i=0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        
        
        /************************************* BREAK/CONTINUE *************************************/
        System.out.println("************************************* BREAK/CONTINUE *************************************");
        for(var i=0; i < 3; i++){
            if(i % 2 == 0) {
                System.out.println("El valor par es (break): " + i);
                break;
            }
        }
        
        for(var i=0; i < 3; i++){
            if(i % 2 != 0) { // continua si es impar
                continue; // Ir a la siguiente iteracion
            }
            System.out.println("i (continue): " + i);
        }
        
        
        /************************************* LABEL *************************************/
        System.out.println("************************************* LABEL *************************************");
        // No es buena practica, es como GO TO
        inicio:
        for(var i=0; i < 3; i++){
            if(i % 2 != 0) {
                continue inicio; // Ir a la linea de codigo de la etiqueta
            }
            System.out.println("i (continue/label): " + i);
        }
    }
    
}
