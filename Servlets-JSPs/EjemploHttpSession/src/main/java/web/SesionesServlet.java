package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = req.getSession(); // Si es la primera vez crea un objeto lo crea automaticamente
        String titulo = null;
        
        // Pedir el atributo contadorVisitas a la sesion
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas"); // Se tiene que convertir porque sesion es un tipo obj
        
        // Si es nulo es la primera vez que accedemos a la app
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        } else {
            contadorVisitas++;
            titulo = "Bienvenido nuevamente";
        }
        
        // agregamos l nuevo valor a la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        // Mandamos la res al cliente
        PrintWriter out = res.getWriter();
        out.print(titulo);
        out.print("<br/>");
        out.print("no. accesos al recurso: " + contadorVisitas);
        out.print("<br/>");
        out.print("ID de la sesion: " + sesion.getId());
        out.close();
        
    }
    
}
