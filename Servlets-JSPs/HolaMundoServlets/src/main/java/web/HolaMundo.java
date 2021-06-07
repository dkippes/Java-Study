package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo") // Escribimos que ruta va a ejecutar
public class HolaMundo extends HttpServlet{
    
    // Peticion Do Get - es como un GET
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        // El tipo de contenido que vamos a mandar
        res.setContentType("text/html;charset=UTF-8");
        // Esto hacemos como un commands line
        PrintWriter out = res.getWriter();
        out.println("Hola Mundo desde Servlets");
        // Esto genera un archivo .war -> que es un Web Archive File, un archivo que tiene informacion web
    }
}
