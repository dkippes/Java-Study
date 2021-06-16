package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // Declaramos la  varriable contador
        int contador = 0;
        
        // Revisamos si el contador visitas existe
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("contadorVisitas")){
                    // Esto devuelve un string
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        
        // incrrementamos el contador en uno
        contador++;
        // Agregamos la res al navegador - La variabble int la convertimos a un string
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        // la cookie se almacena en el cliente por 1h - 3600s
        c.setMaxAge(3600);
        res.addCookie(c);
        
        // Mandamos el msg al navegadorr
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.print("Contador de visitas de cada cliente: " + contador);

    }
    
}
