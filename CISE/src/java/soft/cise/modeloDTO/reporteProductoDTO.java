/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.cise.modeloDTO;

import java.io.Serializable;

/**
 *
 * @author SISTEMA
 */
public class reporteProductoDTO implements Serializable{
    int idProducto;
    String nombreProveedor;
    String nombreProducto;
    double precioCompra;
    int cantidad;
    int stock;
    double totalCompra;

    public reporteProductoDTO() {
        
    }

    public reporteProductoDTO(int idProducto, String nombreProveedor, String nombreProducto, double precioCompra, int cantidad, int stock, double totalCompra) {
        this.idProducto = idProducto;
        this.nombreProveedor = nombreProveedor;
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.stock = stock;
        this.totalCompra = totalCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
}
