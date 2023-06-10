/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.cise.controlador;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import soft.cise.modeloDTO.usuarioDTO;
import soft.cise.modeloDao.usuarioDAO;

/**
 *
 * @author SISTEMA
 */
public class conUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String sistema = "sistema.jsp";
    String index = "index.jsp";
    String login = "login.jsp";
    String addUsers = "msistema/users/addUsers.jsp";
    String listaUsuario = "msistema/users/listUsuario.jsp";
    String updateUsuario = "msistema/users/updateUsuario.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String accion = request.getParameter("txtAccion");
            String acceso = "";
            int id;

            HttpSession sessionOk = request.getSession();
            switch (accion) {
                case "Ingresar":
                    String correo = request.getParameter("txtCorreo");
                    String clave = request.getParameter("txtClave");

                    usuarioDTO usuariodto = new usuarioDTO(correo, clave);
                    usuarioDAO usuariodao = new usuarioDAO();
                    usuarioDTO usuario = usuariodao.login(usuariodto);

                    if (correo.equalsIgnoreCase(usuario.getCorreo()) && clave.equalsIgnoreCase(usuario.getClave())) {
                        sessionOk.setAttribute("perfil", usuario.getPerfil());
                        sessionOk.setAttribute("nombre", usuario.getNombre());
                        sessionOk.setAttribute("estado", usuario.getEstado());
                        sessionOk.setAttribute("idUsuario", usuario.getId());
                        acceso = sistema;
                        request.getRequestDispatcher(acceso).forward(request, response);
                    } else {
                        acceso = index;
                        request.getRequestDispatcher(acceso).forward(request, response);
                    }
                    break;
                case "cerrarSession":
                    sessionOk.removeAttribute("perfil");
                    sessionOk.removeAttribute("nombre");
                    sessionOk.removeAttribute("estado");
                    sessionOk.invalidate();
                    acceso = login;
                    request.getRequestDispatcher(acceso).forward(request, response);
                    break;
                case "Registrar":
                    String nombre = request.getParameter("txtNombre");
                    String email = request.getParameter("txtCorreo");
                    String password = request.getParameter("txtPass");
                    String perfil = request.getParameter("txtPerfil");
                    usuarioDTO usu = new usuarioDTO(nombre, email, password, perfil);
                    usuarioDAO metAdd = new usuarioDAO();
                    if (metAdd.addUsu(usu) != true) {
                        acceso = login;
                        request.getRequestDispatcher(acceso).forward(request, response);
                    } else {
                        acceso = index;
                        request.getRequestDispatcher(acceso).forward(request, response);
                    }

                    break;

                case "eliminar":
                    break;
                case "addUsers":
                    acceso = addUsers;
                    request.getRequestDispatcher(acceso).forward(request, response);
                    break;
                case "agregar":
                    usuarioDTO user = new usuarioDTO();
                    user.setNombre(request.getParameter("txtNombre"));
                    user.setCorreo(request.getParameter("txtCorreo"));
                    user.setClave(request.getParameter("txtPass"));
                    user.setPerfil(request.getParameter("txtPerfil"));
                    usuarioDAO metAddU = new usuarioDAO();
                    if(metAddU.addUsu(user) != true){
                        acceso = addUsers;
                        request.getRequestDispatcher(acceso).forward(request, response);
                    }else {
                        acceso = sistema;
                        request.getRequestDispatcher(acceso).forward(request, response);
                    }
                    break;
                case "listUsuario":
                    request.getRequestDispatcher(listaUsuario).forward(request, response);
                    break;
                case "updateUsuario":
                    request.setAttribute("id", request.getParameter("id"));
                    acceso = updateUsuario;
                    request.getRequestDispatcher(acceso).forward(request, response);
                    break;
                case "actualizar":
                    usuarioDTO usudto = new usuarioDTO();
                    usudto.setId(Integer.parseInt(request.getParameter("id")));
                    usudto.setNombre(request.getParameter("txtNombre"));
                    usudto.setCorreo(request.getParameter("txtCorreo"));
                    usudto.setClave(request.getParameter("txtPass"));
                    usudto.setPerfil(request.getParameter("txtPerfil"));
                    usuarioDAO usuDaoUpdate = new usuarioDAO();
                    usuDaoUpdate.sql_update(usudto);
                    acceso = listaUsuario;
                    request.getRequestDispatcher(acceso).forward(request, response);
                    break;
                case "delete1":
                    id = Integer.parseInt(request.getParameter("id"));
                    usuarioDAO usuDelete1 = new usuarioDAO();
                    if (usuDelete1.sql_delete(id) != true){
                        acceso = addUsers;
                        request.getRequestDispatcher(acceso).forward(request, response);
                    }
                    break;
                case "delete2":
                    id = Integer.parseInt(request.getParameter("id"));
                    usuarioDAO usuDelete2 = new usuarioDAO();
                    if(usuDelete2.sql_delete(id) != true){
                        acceso = listaUsuario;
                        request.getRequestDispatcher(acceso).forward(request, response);
                    }
                    break;
                case "listId":
                    usuarioDTO nombreU = new usuarioDTO();
                    nombreU.setNombre(request.getParameter("txtNombre"));
                    usuarioDAO usuListId = new usuarioDAO();
                    usuListId.sql_selectByNameUser(nombreU);
                    request.getRequestDispatcher(listaUsuario).forward(request, response);
                    break;
            }
            
        } catch (Exception e) {
            System.out.println("error al realizar consultas" + e.getMessage());

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
