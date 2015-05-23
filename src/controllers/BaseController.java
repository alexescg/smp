package controllers;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.StringUtils;

/**
 * Clase que sirve como controlador base para todos los controladores
 * @author Alejandro Escobedo
 */
public class BaseController {

    /**
     * Metodo generico que mapea las consultas de tipo select a una lista.
     * Necesita:
     * <ul>
     * <li><b>BigDecimal: </b> Para datos numericos</li>
     * <li><b>String: </b> Para datos de cadena</li>
     * <li><b>Timestamp: </b>Para datos de tipo Date</li>
     * </ul>
     * @param connection
     * @param sql
     * @param clase
     * @return Lista con los elementos que devuelva el select
     */
    public static List<?> select(Connection connection, String sql, Class clase) {
        List objects = new ArrayList<>();

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {

                ResultSetMetaData rsmd = rs.getMetaData();
                Integer columnCount = rsmd.getColumnCount();

                while (rs.next()) {
                    Object object = clase.newInstance();

                    for (int i = 1; i <= columnCount; i++) {

                        String name = rsmd.getColumnName(i).toLowerCase();
                        name = String.format("set%s", StringUtils.capitalize(name));

                        Class[] params = new Class[1];
                        Object obj = rs.getObject(i);
                        params[0] = obj.getClass();

                        Method method = clase.getDeclaredMethod(name, params);
                        method.invoke(object, obj);
                    }
                    objects.add(object);
                }
                rs.close();

            } catch (Exception e) {
                System.out.println("e = " + e);
            }

        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        return objects;
    }

    /**
     * Metodo para poder ejecutar querys en la base de datos.
     * @param connection
     * @param sql
     */
    public static void executeQuery(Connection connection, String sql) {
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.execute();
        } catch (SQLException e) {

        }
    }
}
