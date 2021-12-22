package restful.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import restful.model.ItemModel;
import restful.model.Conexion;

public class ItemService {
    
    public ArrayList<ItemModel> getItems() {
        ArrayList<ItemModel> lista = new ArrayList<>();
        Conexion conn = new Conexion();
        String sql = "SELECT * FROM items";

        try {
            Statement stm = conn.getCon().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                ItemModel item=new ItemModel();
                
                item.setCodigo_item(rs.getString("codigo_item"));
                item.setDescripcion(rs.getString("descripcion"));
                item.setDetalle(rs.getString("detalle"));
                item.setTipo_articulo(rs.getInt("tipo_articulo"));
                item.setMascota(rs.getString("mascota"));
                item.setUnidad(rs.getInt("unidad"));
                item.setGravado(rs.getInt("gravado"));
                item.setPeso(rs.getFloat("peso"));
                item.setPrecio_venta(rs.getFloat("precio_venta"));
                item.setEstado(rs.getString("estado"));
                item.setUsuario_creo(rs.getString("usuario_creo"));
                item.setEntradas(rs.getFloat("entradas"));
                item.setSalidas(rs.getFloat("salidas"));
                item.setSaldo(rs.getFloat("saldo"));
                
               
                lista.add(item);
            }
        } catch (SQLException e) {
        }

        return lista;
    }
    
    public ItemModel getItem(String id) {
        ItemModel item = new ItemModel();
        Conexion conex = new Conexion();
        String sql = "SELECT * FROM items WHERE codigo_item= ?";

        try {
            PreparedStatement pstm = conex.getCon().prepareStatement(sql);
            pstm.setString(1, id);
            
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                item.setCodigo_item(rs.getString("codigo_item"));
                item.setDescripcion(rs.getString("descripcion"));
                item.setDetalle(rs.getString("detalle"));
                item.setTipo_articulo(rs.getInt("tipo_articulo"));
                item.setMascota(rs.getString("mascota"));
                item.setUnidad(rs.getInt("unidad"));
                item.setGravado(rs.getInt("gravado"));
                item.setPeso(rs.getFloat("peso"));
                item.setPrecio_venta(rs.getFloat("precio_venta"));
                item.setEstado(rs.getString("estado"));
                item.setUsuario_creo(rs.getString("usuario_creo"));
                item.setEntradas(rs.getFloat("entradas"));
                item.setSalidas(rs.getFloat("salidas"));
                item.setSaldo(rs.getFloat("saldo"));               
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
            
        return item;        
    }                
    
    public ItemModel addItem(ItemModel item) {        
        Conexion conex = new Conexion();
        String Sql = "INSERT INTO items (codigo_item,descripcion,detalle,tipo_articulo,mascota,unidad,gravado,peso,precio_venta,estado,usuario_creo,Entradas,Salidas,Saldo )";
        Sql = Sql + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pstm = conex.getCon().prepareStatement(Sql);
            
            pstm.setString(1, item.getCodigo_item());
            pstm.setString(2, item.getDescripcion());
            pstm.setString(3, item.getDetalle());
            pstm.setInt(4, item.getTipo_articulo());
            pstm.setString(5, item.getMascota());
            pstm.setInt(6, item.getUnidad());
            pstm.setInt(7, item.getGravado());
            pstm.setFloat(8, item.getPeso());
            pstm.setFloat(9, item.getPrecio_venta());
            pstm.setString(10, item.getEstado());
            pstm.setString(11, item.getUsuario_creo());
            pstm.setFloat(12, item.getEntradas());
            pstm.setFloat(13, item.getSalidas());
            pstm.setFloat(14, item.getSaldo()); 
            
            pstm.executeUpdate();                       
                
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
            
        return item;        
    }                
    
    public ItemModel updateItem(ItemModel item) {        
        Conexion conn = new Conexion();
        String Sql = "UPDATE items SET descripcion=?,detalle=?,tipo_articulo=?,mascota=?,unidad=?,gravado=?,peso=?,precio_venta=?,estado=?,usuario_creo=?,Entradas=?,Salidas=?,Saldo=? WHERE codigo_item= ?";        
        
        try {
            PreparedStatement pstm = conn.getCon().prepareStatement(Sql);            
            
            pstm.setString(1, item.getDescripcion());
            pstm.setString(2, item.getDetalle());
            pstm.setInt(3, item.getTipo_articulo());
            pstm.setString(4, item.getMascota());
            pstm.setInt(5, item.getUnidad());
            pstm.setInt(6, item.getGravado());
            pstm.setFloat(7, item.getPeso());
            pstm.setFloat(8, item.getPrecio_venta());
            pstm.setString(9, item.getEstado());
            pstm.setString(10, item.getUsuario_creo());
            pstm.setFloat(11, item.getEntradas());
            pstm.setFloat(12, item.getSalidas());
            pstm.setFloat(13, item.getSaldo());
            pstm.setString(14, item.getCodigo_item());
            
            pstm.executeUpdate();                                  
            
        } catch (SQLException exception) {
            System.out.println("Ha ocurrido un error al modificar " + exception.getMessage());
            return null;
        }
            
        return item;        
    }                    
    
    public String delItem(String codigo) {        
        Conexion conn = new Conexion();
        String Sql = "DELETE FROM items WHERE codigo_item= ?";        
        
        try {
            PreparedStatement pstm = conn.getCon().prepareStatement(Sql);
            pstm.setString(1, codigo);           
            
            pstm.executeUpdate();                                  
            
        } catch (SQLException exception) {
            System.out.println("Ha ocurrido un error al eliminar " + exception.getMessage());
            return "{\"Accion\":\"Error\"}";
        }            
        return "{\"Accion\":\"Registro Borrado\"}";        
    }                  
    
}
    