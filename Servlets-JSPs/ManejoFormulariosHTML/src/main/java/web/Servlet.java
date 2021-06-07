package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        String tecnologias[] = req.getParameterValues("tecnologia");
        String genero = req.getParameter("genero");
        String ocupacion = req.getParameter("ocupacion");
        String musica[] = req.getParameterValues("musica");
        String comentario = req.getParameter("comentarios");
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parametros procesados por el Servlet:</h1>");
        out.print("<table border='1'>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Usuario");
        out.print("</td>");
        out.print("<td>");
        out.print(usuario);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Password");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnologias");
        out.print("</td>");
        out.print("<td>");
        for(String tenologia: tecnologias){
            out.print(tenologia);
            out.print(" / ");
        }
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Genero");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Ocupacion");
        out.print("</td>");
        out.print("<td>");
        out.print(ocupacion);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Musica");
        out.print("</td>");
        out.print("<td>");
        if(musica != null){
            for(String m: musica){
                out.print(m);
                out.print(" / ");
            }
        } else {
            out.print("Valor no proporcionado");
        }
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Comentarios");
        out.print("</td>");
        out.print("<td>");
        out.print(comentario);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
    }
}
