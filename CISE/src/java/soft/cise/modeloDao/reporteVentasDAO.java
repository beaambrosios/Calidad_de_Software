/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.cise.modeloDao;
import soft.cise.conexionDB.ConexionBD;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import soft.cise.interfaces.OperacionesDB;
import soft.cise.interfaces.reporteVentasDBO;
import soft.cise.modeloDTO.reporteVentasDTO;

/**
 *
 * @author Alumno
 */
public class reporteVentasDAO implements reporteVentasDBO<reporteVentasDTO> {

    private final String SQL_reporteVentas = "{call reporteVentas}";
    
    private static CallableStatement cts;
    private static ResultSet rs;
    private ConexionBD cn = ConexionBD.conectar();

    public void cerrarConexion() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (cts != null) {
                cts.close();
            }
            if (cn != null) {
                cn.cerrarConexion();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar Conexiones" + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<reporteVentasDTO> sql_selectAll() {
       ArrayList<reporteVentasDTO> list = new ArrayList<>();
        try {
            cts = cn.getCon().prepareCall(SQL_reporteVentas);
            rs = cts.executeQuery();
            while (rs.next()) {
                reporteVentasDTO reporteventasdto = new reporteVentasDTO(rs.getInt("idProducto"),
                        rs.getString("nombrePro"),
                        rs.getString("nombre"),
                        rs.getDouble("precioCompra"),
                        rs.getInt("cantidadCompra"),
                        rs.getDouble("totalCompra"),
                        rs.getDouble("precioVenta"),
                        rs.getInt("cantidadVenta"),
                        rs.getDouble("totalventa"));
                list.add(reporteventasdto);

            }

        } catch (Exception e) {
        } finally {
            cerrarConexion();
        }
        return list;
    }
   
}
