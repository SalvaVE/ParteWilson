package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.IProducto;

public class RegistrarProducto extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idP = Integer.parseInt(request.getParameter("txtIdP")) ;
        String nombreP = request.getParameter("txtNombreP");
        String desProducto = request.getParameter("txtDesProducto");
        double stock = Double.parseDouble(request.getParameter("txtStock")) ;
        double precio = Double.parseDouble(request.getParameter("txtPrecio"));
        String unidadDeMedida = request.getParameter("txtUnidadDeMedida");
        int estadoP = Integer.parseInt(request.getParameter("txtEstadoP"));
        int categoria = Integer.parseInt(request.getParameter("txtCategoria"));
      
       
      
        
        IProducto producto = new IProducto();
        producto.setIdP(idP);
        producto.setNombreP(nombreP);
        producto.setDesProducto(desProducto);
        producto.setStock(stock);
        producto.setPrecio(precio);
        producto.setUnidadDeMedida(unidadDeMedida);
        producto.setEstadoP(estadoP);
        producto.setCategoria(categoria);
        
       
     
        
        if(producto.insertarDatosP() == true) {
            request.getRequestDispatcher("Registro.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("noRegistro.jsp").forward(request, response);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
