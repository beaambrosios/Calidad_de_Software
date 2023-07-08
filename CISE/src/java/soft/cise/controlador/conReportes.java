/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.cise.controlador;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import soft.cise.modeloDTO.reporteGananciaDTO;
import soft.cise.modeloDTO.reporteProductoDTO;
import soft.cise.modeloDTO.reporteVentaDTO;
import soft.cise.modeloDao.reporteGananciaDAO;
import soft.cise.modeloDao.reporteProductoDAO;
import soft.cise.modeloDao.reporteVentaDAO;

/**
 *
 * @author SISTEMA
 */
public class conReportes extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String accion = request.getParameter("txtAccion");

            switch (accion) {
                case "reportes":
                    request.getRequestDispatcher("msistema/reporte.jsp").forward(request, response);
                    break;
                
                case "reporteProductop":
                    int mesp = Integer.parseInt(request.getParameter("txtMes"));
                    reporteProductoDAO reporteProductodao = new reporteProductoDAO();
                    ArrayList<reporteProductoDTO> reporteProductop = reporteProductodao.reporteProductop(mesp);
                    double total = 0;
                    for (reporteProductoDTO reporte : reporteProductop) {
                        total += reporte.getCantidad() * reporte.getPrecioCompra();

                    }
                    request.setAttribute("totalMes", total);
                    request.getSession().setAttribute("reporteProductop", reporteProductop);
                    request.getRequestDispatcher("msistema/reportes/reporteProducto.jsp").forward(request, response);
                    break;
                case "reporteGanancia":
                    int mesg = Integer.parseInt(request.getParameter("txtMes"));
                    reporteGananciaDAO gananciadao = new reporteGananciaDAO();
                    ArrayList<reporteGananciaDTO> reporteGanancia = gananciadao.reporteGanancia(mesg);
                    double G=0;
                    double sumaventa=0;
                    double sumacompra=0;
                    for (reporteGananciaDTO ganancia : reporteGanancia) {
                        G += ganancia.getPrecioVenta()- ganancia.getPrecioCompra();
                        sumaventa+=ganancia.getTotalVenta();
                        sumacompra+=ganancia.getTotalCompra();
                    }
                    request.setAttribute("G", G);
                    request.setAttribute("sumaventa",sumaventa);
                    request.setAttribute("sumacompra",sumacompra);
                    request.getSession().setAttribute("reporteGanancia", reporteGanancia);
                    request.getRequestDispatcher("msistema/reportes/reporteGanancia.jsp").forward(request, response);
                    break;
                    /*----*/
                    case "reporteVenta":                   
                    reporteVentaDAO reporteventadto = new reporteVentaDAO();
                    ArrayList<reporteVentaDTO>reporteVenta = reporteventadto.sql_selectAll();
                     double venta=0;
                     double ventaSu=0;
                     double compraS=0;
                    for (reporteVentaDTO reporte : reporteVenta) {
                        venta += reporte.getPrecioVenta()+ reporte.getPrecioCompra();
                        ventaSu+=reporte.getTotalVenta();
                        compraS+=reporte.getTotalCompra();
                    }
                    request.setAttribute("venta", venta);
                    request.setAttribute("sumaventa",ventaSu);
                    request.setAttribute("compraS",compraS);
                    request.getSession().setAttribute("reporteVenta", reporteVenta);
                    request.getRequestDispatcher("msistema/reportes/reporteVenta.jsp").forward(request, response);
                    break;
            }

        } catch (Exception e) {
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
