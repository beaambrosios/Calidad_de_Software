/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package soft.cise.modeloDao;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import soft.cise.modeloDTO.productoDTO;

/**
 *
 * @author USER
 */
public class metProducTest {
    
    public metProducTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cerrarConexion method, of class metProduc.
     */
    @Test
    public void testCerrarConexion() {
        System.out.println("cerrarConexion");
        metProduc instance = new metProduc();
        instance.cerrarConexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarCateg method, of class metProduc.
     */
    @Test
    public void testListarCateg() {
        System.out.println("listarCateg");
        metProduc instance = new metProduc();
        List expResult = null;
        List result = instance.listarCateg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listProduc12 method, of class metProduc.
     */
    @Test
    public void testListProduc12() {
        System.out.println("listProduc12");
        metProduc instance = new metProduc();
        ArrayList<productoDTO> expResult = null;
        ArrayList<productoDTO> result = instance.listProduc12();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sql_insert method, of class metProduc.
     */
    @Test
    public void testSql_insert() {
        System.out.println("sql_insert");
        productoDTO producto = null;
        metProduc instance = new metProduc();
        boolean expResult = false;
        boolean result = instance.sql_insert(producto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sql_update method, of class metProduc.
     */
    @Test
    public void testSql_update() {
        System.out.println("sql_update");
        productoDTO producto = null;
        metProduc instance = new metProduc();
        boolean expResult = false;
        boolean result = instance.sql_update(producto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sql_delete method, of class metProduc.
     */
    @Test
    public void testSql_delete() {
        System.out.println("sql_delete");
        Object id = null;
        metProduc instance = new metProduc();
        boolean expResult = false;
        boolean result = instance.sql_delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sql_selectById method, of class metProduc.
     */
    @Test
    public void testSql_selectById() {
        System.out.println("sql_selectById");
        Object id = null;
        metProduc instance = new metProduc();
        productoDTO expResult = null;
        productoDTO result = instance.sql_selectById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sql_selectAll method, of class metProduc.
     */
    @Test
    public void testSql_selectAll() {
        System.out.println("sql_selectAll");
        metProduc instance = new metProduc();
        ArrayList<productoDTO> expResult = null;
        ArrayList<productoDTO> result = instance.sql_selectAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarImg method, of class metProduc.
     */
    @Test
    public void testListarImg() {
        System.out.println("listarImg");
        int id = 0;
        HttpServletResponse res = null;
        metProduc instance = new metProduc();
        instance.listarImg(id, res);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sql_selectByName method, of class metProduc.
     */
    @Test
    public void testSql_selectByName() {
        System.out.println("sql_selectByName");
        productoDTO t = null;
        metProduc instance = new metProduc();
        ArrayList<productoDTO> expResult = null;
        ArrayList<productoDTO> result = instance.sql_selectByName(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
