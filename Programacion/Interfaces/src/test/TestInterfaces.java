package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        // Se puede crear variables tipo interfaces, pero no llamar al tipo Interfaces sino a la clase que utiliza la interface
        IAccesoDatos datos = new ImplementacionMySql();
        // datos.listar();
        imprimir(datos);
        
        datos = new ImplementacionOracle();
        // datos.intertar();
        
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
