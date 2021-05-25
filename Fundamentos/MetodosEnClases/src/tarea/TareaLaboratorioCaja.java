package tarea;

public class TareaLaboratorioCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        Caja caja2 = new Caja(10, 10, 10);
        
        int resultado = caja2.calcularVolumen(10, 10, 10);
        System.out.println("resultado = " + resultado);
    }
}
