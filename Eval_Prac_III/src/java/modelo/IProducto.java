package modelo;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IProducto {
    
    int idP;
    String nombreP;
    String desProducto;
   double stock;
    double precio;
    String unidadDeMedida;
    int estadoP;
    int categoria;
    String dateTime  = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    

    Connection cnn;
    Statement state;
    ResultSet result;

    public IProducto() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_inventario?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public IProducto(int idP, String nombreP, String desProducto, double stock, double precio, String unidadDeMedida, int estadoP, int categoria) {
        this.idP = idP;
        this.nombreP = nombreP;
        this.desProducto = desProducto;
        this.stock = stock;
        this.precio = precio;
        this.unidadDeMedida = unidadDeMedida;
        this.estadoP = estadoP;
        this.categoria = categoria;
    }

    

    

    public boolean insertarDatosP() {
        try {
            String miQuery = "insert tb_producto values('" + idP + "', '" + nombreP + "', '" + desProducto + "', '" + stock + "',"
                    + " '" + precio + "', '" + unidadDeMedida + "', '" + estadoP + "', '" + categoria + "', '"  + dateTime +"');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1) {
                return true;
            }
        } catch (SQLException ex) {
         Logger.getLogger(IProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ArrayList<IProducto> consultarRegistrosP(){
        ArrayList<IProducto> producto = new ArrayList();
        
        try{
            String miQuery = "select * from tb_producto;";
            state = cnn.createStatement();
            result = state.executeQuery(miQuery);
            while(result.next()){
                
                producto.add(new IProducto(result.getInt("id_producto"), result.getString("nom_producto"), result.getString("des_producto"), result.getDouble("stock"), result.getDouble("precio"), result.getString("unidad_de_medida"), result.getInt("estado_producto"), result.getInt("categoria")));
                
            }
        }catch (SQLException ex) {
            Logger.getLogger(IProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return producto;
    }
    public boolean EliminarRegistroP (){
        try {
            String miQuery = "delete from tb_producto where id_producto = ('"+idP+"');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if(estado == 1){
                return true;
            }
        }catch (SQLException ex){
            Logger.getLogger(ICategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     public boolean ModificarRegistroP(){
        try {
            String miQuery = "update tb_producto set nom_producto =('"+nombreP+"'), des_producto= ('"+desProducto+"'), stock= ('"+stock+"'), precio= ('"+precio+"'), unidad_de_medida= ('"+unidadDeMedida+"'), estado_producto= ('"+estadoP+"'), categoria= ('"+categoria+"'), fecha_entrada= ('"+dateTime+"') where id_producto =('"+idP+"');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1){
                return true;
            }
        }catch (SQLException ex) {
            Logger.getLogger(ICategoria.class.getName()) .log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDesProducto() {
        return desProducto;
    }

    public void setDesProducto(String desProducto) {
        this.desProducto = desProducto;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public int getEstadoP() {
        return estadoP;
    }

    public void setEstadoP(int estadoP) {
        this.estadoP = estadoP;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }



}
