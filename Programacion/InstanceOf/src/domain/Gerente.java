package domain;

public class Gerente extends Empleado {
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    // Sobreescritura de obtenerDetalle
    @Override
    public String obtenerDetalles(){
        // llama al metodo del padre, y agregar el departamento
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
