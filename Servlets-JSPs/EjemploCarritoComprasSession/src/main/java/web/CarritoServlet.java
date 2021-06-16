package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset=UTF-8");
        
        // creamos o recuperamos el objeto http session
        HttpSession sesion = req.getSession();
        
        // recuperamos la lista de articulos agregados previamente si existen
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        
        // verificamos si la lista de articulos existe
        if(articulos == null){
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        
        // procesamos el nuevo articulo
        String articuloNuevo = req.getParameter("articulo");
        
        // revisamos y agregamos el articulo nuevo
        if(articuloNuevo != null && !articuloNuevo.trim().equals("")){
            articulos.add(articuloNuevo);
        }
        
        // imprimimos la lista de articulos
        PrintWriter out = res.getWriter();
        out.print("<h1>Lista de Articulos:</h1>");
        out.print("<br/>");
        
        //iteramos los articulos
        for(String articulo: articulos){
            out.print("<li>" + articulo + "</li>");
        }
        
        // agregamos un link para regresar al inicio
        out.print("<br/>");
        out.print("<a href='/EjemploCarritoComprasSession'>Regresar al inicio</a>");
    }
    
}
