/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.cise.modeloDao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import soft.cise.conexionDB.ConexionBD;
import soft.cise.interfaces.reporteProductoDBO;
import soft.cise.modeloDTO.reporteProductoDTO;

/**
 *
 * @author SISTEMA
 */
public class reporteProductoDAO implements reporteProductoDBO<reporteProductoDTO> {

    private final String SQL_reporteProducto = "{call reporteProducto (?)}";
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
    public ArrayList<reporteProductoDTO> reporteProductop(int mesp) {
        ArrayList<reporteProductoDTO> reporteProductoList = new ArrayList<>();
        try {
            cts=cn.getCon().prepareCall(SQL_reporteProducto);
            cts.setInt(1, mesp);
            rs = cts.executeQuery();
            while(rs.next()){
                reporteProductoDTO reporteProductodto = new reporteProductoDTO(rs.getInt("idProducto"), 
                        rs.getString("nombrePro"), 
                        rs.getString("nombre"), 
                        rs.getDouble("precioCompra"),
                        rs.getInt("cantidad"),
                        rs.getInt("Stock"),
                        rs.getDouble("totalCompra"));
                reporteProductoList.add(reporteProductodto);
            }
               
        } catch (Exception e) {
            System.out.println("Error al realizar el reporte de los productos" + e.getMessage());
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
        return  reporteProductoList;
    }

}
