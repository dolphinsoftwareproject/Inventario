package restful.model;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ItemModel {     
    
    //private timestamp fecha_creacion;
    private String codigo_item;
    private String descripcion;
    private String detalle;
    private int tipo_articulo;
    private String mascota;
    private int unidad;
    private int gravado;
    private float peso;
    private float precio_venta;
    private String estado;
    private String usuario_creo;     
    private float Entradas;
    private float Salidas;
    private float Saldo;              

    public ItemModel() {
    }

    public ItemModel(String codigo_item, String descripcion, String detalle, int tipo_articulo, String mascota, int unidad, int gravado, float peso, float precio_venta, String estado, String usuario_creo, float Entradas, float Salidas, float Saldo){
        this.codigo_item = codigo_item;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.tipo_articulo = tipo_articulo;
        this.mascota = mascota;
        this.unidad = unidad;
        this.gravado = gravado;
        this.peso = peso;
        this.precio_venta = precio_venta;
        this.estado = estado;
        this.usuario_creo = usuario_creo;
        this.Entradas = Entradas;
        this.Salidas = Salidas;
        this.Saldo = Saldo;
    }

    public String getCodigo_item() {
        return codigo_item;
    }

    public void setCodigo_item(String codigo_item) {
        this.codigo_item = codigo_item;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getTipo_articulo() {
        return tipo_articulo;
    }

    public void setTipo_articulo(int tipo_articulo) {
        this.tipo_articulo = tipo_articulo;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getGravado() {
        return gravado;
    }

    public void setGravado(int gravado) {
        this.gravado = gravado;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario_creo() {
        return usuario_creo;
    }

    public void setUsuario_creo(String usuario_creo) {
        this.usuario_creo = usuario_creo;
    }

    public float getEntradas() {
        return Entradas;
    }

    public void setEntradas(float Entradas) {
        this.Entradas = Entradas;
    }

    public float getSalidas() {
        return Salidas;
    }

    public void setSalidas(float Salidas) {
        this.Salidas = Salidas;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }
    
    
}   