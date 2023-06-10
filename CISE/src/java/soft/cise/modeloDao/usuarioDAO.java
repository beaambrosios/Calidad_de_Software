/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.cise.modeloDao;

import java.io.InputStream;
import soft.cise.conexionDB.ConexionBD;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import soft.cise.modeloDTO.usuarioDTO;
import soft.cise.interfaces.OperacionesUsu;

/**
 *
 * @author Alumno
 */
public class usuarioDAO implements OperacionesUsu<usuarioDTO> {

    private static final String sql_usuarioSistema = "{call usuarioSistema(?,?)}";
    private static final String sql_addUsuario = "{call registrarUsuario(?,?,?,?)}";
    private static final String sql_lisUsuarios = "{call listarUsuarios}";
    private static final String sql_updateUsuario = "{call EditarUsuario(?,?,?,?,?)}";
    private static final String sql_delete_user = "{call SQL_delete_usuario(?)}";
    private static final String sql_selectById = "{call selectByIdUsuario (?)}";
    private static final String sql_selectByName = "";

    private static CallableStatement cts;
    private static ResultSet rs;
    private ConexionBD cn = ConexionBD.conectar();
    
    private void cerrarConexiones(){
        try {
            if(rs!=null)rs.close();
            if(cts!=null)cts.close();
            if(cn!=null)cn.cerrarConexion();
        } catch (Exception e) {
        }
    }
    
    
    public ArrayList<usuarioDTO> listUsers(){
        ArrayList<usuarioDTO> lis = new ArrayList<>();
        InputStream inputStream = null;
        try{
            cts = cn.getCon().prepareCall(sql_lisUsuarios);
            rs = cts.executeQuery();
            while (rs.next()){
                usuarioDTO user = new usuarioDTO(rs.getInt("idUsuario"),
                        rs.getString("nombre"),
                        rs.getString("correo"),
                        rs.getString("perfil"),
                        rs.getInt("estado"));
                lis.add(user);
            }
        } catch (Exception e) {
            System.out.println("Error al listar los usuarios" + e.getMessage());
            e.printStackTrace();
        } finally {
           cerrarConexiones();
        }
        return lis;
    }

    @Override
    public boolean addUsu(usuarioDTO usuario) {
        boolean result = false;
        try {
            cts=cn.getCon().prepareCall(sql_addUsuario);
            cts.setString(1, usuario.getNombre());
            cts.setString(2, usuario.getCorreo());
            cts.setString(3, usuario.getClave());
            cts.setString(4, usuario.getPerfil());
            if(cts.executeUpdate()>1){
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al registrar" + e.getMessage());
            e.printStackTrace();
        }finally{
            cerrarConexiones();
        }
        return result;
    }

    @Override
    public String recuperarUsu(usuarioDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public usuarioDTO login(usuarioDTO usuario) {
        usuarioDTO usu = null;
        try {
            cts = cn.getCon().prepareCall(sql_usuarioSistema);
            cts.setString(1, usuario.getCorreo());
            cts.setString(2, usuario.getClave());
            rs = cts.executeQuery();
            while(rs.next()){
                usu = new usuarioDTO(rs.getInt(1), 
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getInt(6));
            }
        } catch (Exception e) {
            System.out.println("Error al realizar validacion" + e.getMessage());
            e.printStackTrace();
        }finally{
            cerrarConexiones();
        }
        
        return usu;
    }
    
    public boolean sql_update(usuarioDTO usuario){
        try{
            cts = cn.getCon().prepareCall(sql_updateUsuario);
            cts.setInt(1, usuario.getId());
            cts.setString(2, usuario.getNombre());
            cts.setString(3, usuario.getCorreo());
            cts.setString(4, usuario.getClave());
            cts.setString(5, usuario.getPerfil());
            if (cts.executeUpdate() > 1){
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar datos" + e.getMessage());
            e.printStackTrace();
        } finally {

        }
        return false;
    }

    public boolean sql_delete(Object id) {
        boolean result = false;
        try{
            cts = cn.getCon().prepareCall(sql_delete_user);
            cts.setInt(1, Integer.parseInt(id.toString()));
            if (cts.executeUpdate() > 1){
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar usuario" + e.getMessage());
        } finally {
            cerrarConexiones();
        }
        return result;
    }
    
    public usuarioDTO sql_selectById(Object id) {
        usuarioDTO usuarioDto = null;
        try{
            cts = cn.getCon().prepareCall(sql_selectById);
            cts.setInt(1, Integer.parseInt(id.toString()));
            rs = cts.executeQuery();
            while (rs.next()){
                usuarioDto = new usuarioDTO(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getInt(6));
            }
        } catch (Exception e) {
            System.out.println("Error al seleccionar por la id" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return usuarioDto;
    }
    
    public ArrayList<usuarioDTO> sql_selectByNameUser (usuarioDTO t){
        ArrayList<usuarioDTO> listNameU = new ArrayList<>();
        try {
            cts = cn.getCon().prepareCall(sql_selectByName);
            cts.setString(1, t.getNombre());
            rs = cts.executeQuery();
            rs = cts.executeQuery();
            while (rs.next()){
                usuarioDTO usu = new usuarioDTO();
                usu.setId(rs.getInt("idProducto"));
                usu.setNombre(rs.getString("nombre"));
                usu.setCorreo(rs.getString("correo"));
                usu.setClave(rs.getString("pass"));
                usu.setPerfil(rs.getString("perfil"));
                usu.setId(rs.getInt("estado"));
                listNameU.add(usu);
            }
        } catch (Exception e) {
            System.out.println("Error al listar por nombre: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return listNameU;
    }
    
    



}
