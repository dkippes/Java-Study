package sentenciacontrol;

public class SentenciaControl {

    public static void main(String[] args) {
        /************************************* IF/ELSE *************************************/
        System.out.println("************************************* IF/ELSE *************************************");
        var condicion = false;
        
        if(condicion) {
            System.out.println("Condicion verdadera");
        }  else {
            System.out.println("Condicion falsa");
        }
        
        
        /************************************* IF/ELSE IF *************************************/
        System.out.println("************************************* IF/ELSE IF *************************************");
        var  numero = 2;
        var numeroTexto = "Numero desconocido";
        
        if( numero == 1){
            System.out.println("numero uno");
        }else if ( numero == 2) {
            System.out.println("numero dos");
        } else if ( numero == 3) {
            System.out.println("numero tres");
        } else if ( numero == 3) {
            System.out.println("numero cuatro");
        }  else {
            System.out.println(numeroTexto);
        }
        
        
        /************************************* SWITCH *************************************/
        System.out.println("************************************* SWITCH *************************************");
        var numeroSwitch = 3;
        var numeroSwitchTexto = "Valor desconocido";
        
        switch(numeroSwitch) {
            case 1:
                numeroSwitchTexto = "Numero uno";
                break;
            case 2:
                numeroSwitchTexto = "Numero dos";
                break;
            case 3:
                numeroSwitchTexto = "Numero tres";
                break;
            case 4:
                numeroSwitchTexto = "Numero cuatro";
                break;
            default:
                numeroSwitchTexto = "Caso no encontrado";
        }
        System.out.println("numeroSwitchTexto: " + numeroSwitchTexto);
    }
    
}
