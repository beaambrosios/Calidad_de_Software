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
public class reporteVentaDTO implements Serializable{
    int idProducto;

    String nombreProducto;
    double precioCompra;
    double totalCompra;
    double precioVenta;
    int catidadVenta;
    double totalVenta;

    public reporteVentaDTO() {
    }

    public reporteVentaDTO(int idProducto, String nombreProducto, double precioCompra, double totalCompra, double precioVenta, int catidadVenta, double totalVenta) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.totalCompra = totalCompra;
        this.precioVenta = precioVenta;
        this.catidadVenta = catidadVenta;
        this.totalVenta = totalVenta;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCatidadVenta() {
        return catidadVenta;
    }

    public void setCatidadVenta(int catidadVenta) {
        this.catidadVenta = catidadVenta;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    
    
}
