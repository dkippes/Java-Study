package domain;

public class Empleado extends Persona {
    // Si no va a tener mas subclases entonces podemos no usar protected, y empezar a usar private
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    // SOBRECARGA DE CONSTRUCTORES -> Mas de un constructor en la clase
    public Empleado(){
        // Aca implicitamente llama a super()
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    
    public Empleado(String nombre, double sueldo) {
        // super(nombre); // Para poder mandar a llamar al constructor padre
        // Con this() llama al constructor interno de la misma clase
        this(); // Constructore de la clase, no se puede llamar a this() y super() al mismo tiempo
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString()); // Al final llama al metodo toString de la clase padre
        sb.append('}');
        return sb.toString();
    }
}
