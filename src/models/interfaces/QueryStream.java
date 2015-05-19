package models.interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Interfaz para hacer uso de un ResultSet mediante Streams
 * @since 5/17/2015
 * @author Alejandro Escobedo
 */
@FunctionalInterface
public interface QueryStream {
    
    public void queryStream (ResultSet rs,
            Long currentRow) throws SQLException;

//    public static void select(Connection connection, String sql,
//            QueryStream qstr, Object... params){
//        try 
//            (PreparedStatement ps = connection.prepareStatement(sql)){
//            int count = 0;
//            for (Object param : params) {
//                ps.setObject(++count, param);
//            }
//            try (ResultSet rs = ps.executeQuery()){
//                Long rows = 0l;
//                
//                while (rs.next()) {
//                    qstr.queryStream(rs, rows++);
//                }
//                
//            } catch (SQLException e) {
//                System.out.println("Data Access Exception!");
//            }
//        } catch (SQLException e) {
//                System.out.println("Data Access Exception!");
//        }
//    }
}
