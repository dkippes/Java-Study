package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // Suponemos que el usuairo visita por prmera vez nuestro sitio
        boolean nuevoUsuario = true;
        
        // Obtenemos el arreglo de cookies
        Cookie[] cookies = req.getCookies();
        
        // buscamos si ya existe una cookie creada con anterioridad
        // se llama visitanteRecurrente
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    // si ya existe la cookie es un usuario recurrente
                    nuevoUsuario = false;
                    break;
                }
            }
        }
        
        String msg = null;
        if(nuevoUsuario){
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            res.addCookie(visitanteCookie);
            msg = "Garcias por visitar nuestro sitio por primera vez";
        } else {
            msg = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.print("Mensaje: " + msg);
        out.close();
    }
    
}
