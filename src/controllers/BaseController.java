package controllers;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Escobedo
 */
public class BaseController {

    /**
     * Metodo generico que mapea las consultas a una tabla
     * @param connection
     * @param sql
     * @param rows
     * @param clase
     * @return 
     */
    public static List<?> select(Connection connection, String sql, Integer rows, Class clase) {
        List objects = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {

                Integer rowCount = 1;
                ResultSetMetaData rsmd = rs.getMetaData();
                Integer columnCount = rsmd.getColumnCount();
                //Object object = clase.newInstance();
                //if (rows == null) {
                    while (rs.next()) {
                        Object object = clase.newInstance();
                        for (int i = 1; i <= columnCount; i++) {
                            
                            String name = rsmd.getColumnName(i).toLowerCase();
                            Field field = clase.getField(name);
                            field.set(object, rs.getObject(i));

                        }
                        objects.add(object);
                        rowCount++;
                    }
                     rs.close();
               //     }
//           //     } else {
//                    while (rs.next() && rowCount <= rows) {
//                        for (int i = 1; i < columnCount; i++) {
//                            
//                            String name = rsmd.getColumnName(i);
//                            Field field = clase.getField(name);
//                            field.set(object, rs.getObject(rowCount));
//                            objects.add((Class) object);
//                        }
//                    }
//                //}
            } catch (Exception e) {
                System.out.println("e = Data Access Exception" + e);
            }

        } catch (Exception e) {
            System.out.println("e =  Data Acccess Exception" + e);
        }
        return objects;
    }

    /**
     * Metodo para poder hacer querys de tipo ddl
     *
     * @param connection
     * @param sql
     */
    public static void ddlQuery(Connection connection, String sql) {
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.execute();
        } catch (SQLException e) {

        }
    }
//    
//     public static int execDML(Connection connection, String sql) {
//        System.out.println(sql);
//        try (PreparedStatement ps = connection.prepareStatement(sql)) {
//            return ps.executeUpdate();
//
//        } catch (SQLException e) {
//            throw new DataAccessException(e);
//        }
//
//
//    }

}
