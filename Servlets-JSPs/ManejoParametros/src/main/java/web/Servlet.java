package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet") // Es como un controller
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req,  HttpServletResponse res) throws IOException{
        // Leer los parametros del formulario html (como req.body)
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        
        // Lo mandamos en la consola de GlassFish - desde el lado del servidor
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        
        // Es lo que responde desde la pagina
        PrintWriter out = res.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario es: " + usuario);
        out.print("<br/>");
        out.print("El parametro password es: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
