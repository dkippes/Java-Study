package mx.com.gm.mundopc;

public class Mouse extends DispositivoEntrada{
    private final int idMouse;
    private static int contadorMouses;
    
    public Mouse(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idMouse = ++Mouse.contadorMouses;
    }

    @Override
    public String toString() {
        return "Mouse{" + "idMouse=" + idMouse + '}' + ", " + super.toString() + '}';
    }
}
