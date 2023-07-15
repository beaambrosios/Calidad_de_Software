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
import soft.cise.interfaces.categoriaDBO;
import soft.cise.modeloDTO.categoriaDTO;

/**
 *
 * @author SISTEMA
 */
public class categoriaDAO implements categoriaDBO<categoriaDTO> {

    private final String SQL_listaCategoria = "{call listaCategoria (?)}";
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
    public ArrayList<categoriaDTO> categoria(int idcategoria) {
        ArrayList<categoriaDTO> categoriaList = new ArrayList<>();
        try {
            cts=cn.getCon().prepareCall(SQL_listaCategoria);
            cts.setInt(1, idcategoria);
            rs = cts.executeQuery();
            while(rs.next()){
                categoriaDTO categoriadto = new categoriaDTO(rs.getInt("idProducto"), 
                        rs.getString("nombre"),
                        rs.getString("categoria"),
                        rs.getInt("cantidad"),
                        rs.getString("marca"),
                        rs.getDouble("precioVenta"),
                        rs.getString("descripcion"));
                categoriaList.add(categoriadto);
            }
               
        } catch (Exception e) {
            System.out.println("Error al realizar el reporte de los productos" + e.getMessage());
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
        return  categoriaList;
    }

}
