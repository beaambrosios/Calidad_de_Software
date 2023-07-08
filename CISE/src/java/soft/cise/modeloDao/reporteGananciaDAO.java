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
import soft.cise.interfaces.gananciaDBO;
import soft.cise.modeloDTO.reporteGananciaDTO;

/**
 *
 * @author SISTEMA
 */
public class reporteGananciaDAO implements gananciaDBO<reporteGananciaDTO> {

    private final String SQL_reporteGanancia = "{call reporteGanancia (?)}";
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
    public ArrayList<reporteGananciaDTO> reporteGanancia(int mesg) {
        ArrayList<reporteGananciaDTO> reporteGananciaList = new ArrayList<>();
        try {
            cts=cn.getCon().prepareCall(SQL_reporteGanancia);
            cts.setInt(1, mesg);
            rs = cts.executeQuery();
            while(rs.next()){
                reporteGananciaDTO gananciadto = new reporteGananciaDTO(rs.getInt("idProducto"),
                        rs.getString("nombrePro"),
                        rs.getString("nombre"),
                        rs.getDouble("precioCompra"),
                        rs.getInt("cantidadCompra"),
                        rs.getDouble("totalCompra"),
                        rs.getDouble("precioVenta"),
                        rs.getInt("cantidadVenta"),
                        rs.getDouble("totalventa"));
                reporteGananciaList.add(gananciadto);
            }
               
        } catch (Exception e) {
            System.out.println("Error al realizar el reporte de los productos" + e.getMessage());
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
        return  reporteGananciaList;
    }

}
