package soft.cise.modeloDao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import soft.cise.conexionDB.ConexionBD;
import soft.cise.modeloDTO.usuarioDTO;
import soft.cise.interfaces.OperacionesUsu;

public class usuarioDAOTest {

    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    private static final String sql_usuarioSistema = "{call usuarioSistema(?,?)}";
    private static final String sql_addUsuario = "{call registrarUsuario(?,?,?,?)}";
    private static final String sql_lisUsuarios = "{call listarUsuarios}";
    private static final String sql_updateUsuario = "{call EditarUsuario(?,?,?,?,?)}";
    private static final String sql_delete_user = "{call SQL_delete_usuario(?)}";
    private static final String sql_selectById = "{call selectByIdUsuario (?)}";
    private static final String sql_selectByName = "";

    private static ConexionBD cn = ConexionBD.conectar();

    private usuarioDAO instance;

    @BeforeClass
    public static void setUpClass() {
        connection = cn.getCon();
    }

    @AfterClass
    public static void tearDownClass() {
        cn.cerrarConexion();
    }

    @Before
    public void setUp() {
        instance = new usuarioDAO();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testListUsers() {
        System.out.println("listUsers");

        // Simular datos de prueba
        ArrayList<usuarioDTO> expectedUsers = new ArrayList<>();
        expectedUsers.add(new usuarioDTO(1, "Usuario1", "usuario1@example.com", "cliente", 1));

        // Simular la ejecución de la consulta SQL y la obtención de los resultados
        try {
            preparedStatement = connection.prepareStatement(sql_lisUsuarios);
            resultSet = preparedStatement.executeQuery();

            // Construir la lista de usuarios esperada
            ArrayList<usuarioDTO> actualUsers = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("idUsuario");
                String nombre = resultSet.getString("nombre");
                String correo = resultSet.getString("correo");
                String perfil = resultSet.getString("perfil");
                int estado = resultSet.getInt("estado");

                usuarioDTO user = new usuarioDTO(id, nombre, correo, perfil, estado);
                actualUsers.add(user);
            }

            // Verificar que la lista de usuarios esperada sea igual a la lista de usuarios actual
            assertEquals(expectedUsers, actualUsers);
        } catch (SQLException e) {
            fail("Error al listar los usuarios: " + e.getMessage());
        }
    }

    @Test
    public void testAddUsu() {
        System.out.println("addUsu");

        // Simular datos de prueba
        usuarioDTO usuario = new usuarioDTO("Usuario2", "usuario2@example.com", "clave1", "cliente");

        // Simular la ejecución del procedimiento almacenado y verificar el resultado
        boolean expectedResult = true;
        boolean actualResult = instance.addUsu(usuario);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRecuperarUsu() {
        System.out.println("recuperarUsu");

        // Simular datos de prueba
        usuarioDTO t = null;

        // Simular la ejecución del método y verificar el resultado
        String expectedValue = "";
        String actualValue = instance.recuperarUsu(t);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testLogin() {
        System.out.println("login");

        // Simular datos de prueba
        usuarioDTO usuario = new usuarioDTO("admin_usu@gmail.com", "123");

        // Simular la ejecución del procedimiento almacenado y verificar el resultado
        usuarioDTO expectedUser = null;
        usuarioDTO actualUser = instance.login(usuario);
        assertEquals(expectedUser, actualUser);
    }

    @Test
    public void testSql_update() {
        System.out.println("sql_update");

        // Simular datos de prueba
        usuarioDTO usuario = null;

        // Simular la ejecución del procedimiento almacenado y verificar el resultado
        boolean expectedResult = false;
        boolean actualResult = instance.sql_update(usuario);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSql_delete() {
        System.out.println("sql_delete");

        // Simular datos de prueba
        Object id = null;

        // Simular la ejecución del procedimiento almacenado y verificar el resultado
        boolean expectedResult = false;
        boolean actualResult = instance.sql_delete(id);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSql_selectById() {
        System.out.println("sql_selectById");

        // Simular datos de prueba
        Object id = null;

        // Simular la ejecución del procedimiento almacenado y verificar el resultado
        usuarioDTO expectedUser = null;
        usuarioDTO actualUser = instance.sql_selectById(id);
        assertEquals(expectedUser, actualUser);
    }

    @Test
    public void testSql_selectByNameUser() {
        System.out.println("sql_selectByNameUser");

        // Simular datos de prueba
        usuarioDTO t = null;

        // Simular la ejecución del procedimiento almacenado y verificar el resultado
        ArrayList<usuarioDTO> expectedUsers = null;
        ArrayList<usuarioDTO> actualUsers = instance.sql_selectByNameUser(t);
        assertEquals(expectedUsers, actualUsers);
    }
}
