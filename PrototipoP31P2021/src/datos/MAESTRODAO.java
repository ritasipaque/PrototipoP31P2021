/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Maestro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author familia Sipaque
 */
public class MAESTRODAO {
      private static final String SQL_SELECT = "SELECT codigo_maestro , nombre_maestro , direccion_maestro , telefono_maestro , email_maestro , estatus_maestro FROM maestro";
    private static final String SQL_INSERT = "INSERT INTO maestros( nombre_maestro, direccion_maestro, telefono_maestro, email_maestro, estatus_maestro) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE maestros SET  maestro=?, direccion_maestro=?, telefono_maestro=?, email_maestro=?, estatus_maestro=? WHERE codigo_maestro = ?";
    private static final String SQL_DELETE = "DELETE FROM maestros WHERE codigo_maestros=?";
    private static final String SQL_QUERY = "SELECT codigo_maestro, nombre_maestro, direccion_maestro, telefono_maestro, email_maestro , estatus_maestro FROM maestros WHERE codigo_maestro = ?";
    public List<Maestro> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Maestro persona = null;
        List<Maestro> personas = new ArrayList<Maestro>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int codigo_maestro = rs.getInt("codigo_maestro");
                String nombre_maestro = rs.getString("nombre_maestro");
                String direccion_maestro = rs.getString("direccion_maestro");
                String telefono_maestro = rs.getString("telefono_maestro");
                String email_maestro = rs.getString("email_maestro");
                String estatus_maestro = rs.getString("estatus_maestro");
                
                persona = new Maestro();
                persona.setCodigo_maestro(codigo_maestro);
                persona.setNombre_maestro(nombre_maestro);
                persona.setDireccion_maestro(direccion_maestro);
                persona.setTelefono_maestro(telefono_maestro);
                persona.setEmail_maestro(email_maestro);
                persona.setEstatus_maestro(estatus_maestro);
                personas.add(persona);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return personas;
    }
    
    public int insert(Maestro persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre_maestro());
            stmt.setString(2, persona.getDireccion_maestro());
            stmt.setString(3, persona.getTelefono_maestro());
            stmt.setString(4, persona.getEmail_maestro());
            stmt.setString(5, persona.getEstatus_maestro());
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    
    public int update(Maestro persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre_maestro());
            stmt.setString(2, persona.getDireccion_maestro());
            stmt.setString(3, persona.getTelefono_maestro());
            stmt.setString(4, persona.getEmail_maestro());
            stmt.setString(5, persona.getEstatus_maestro());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    
    public int delete(Maestro persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getCodigo_maestro());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
     //    public List<Persona> query(Persona persona) { // Si se utiliza un ArrayList
    public Maestro query(Maestro persona) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Maestro> personas = new ArrayList<Maestro>();
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, persona.getCodigo_maestro());
            rs = stmt.executeQuery();
            while (rs.next()) {
               int carnet_alumno = rs.getInt("codigo__maestro");
                String nombre_alumno = rs.getString("nombre_maestro");
                String direccion_alumno = rs.getString("direccion_maestro");
                String telefono_alumno = rs.getString("telefono_maestro");
                String email_alumno = rs.getString("email__maestro");
                String estatus_alumno = rs.getString("estatus_maestro");
                
                persona = new Maestro();
                persona.setCodigo_maestro(carnet_alumno);
                persona.setNombre_maestro(nombre_alumno);
                persona.setDireccion_maestro(direccion_alumno);
                persona.setTelefono_maestro(telefono_alumno);
                persona.setEmail_maestro(email_alumno);
                persona.setEstatus_maestro(estatus_alumno);
                personas.add(persona);
                //personas.add(persona); // Si se utiliza un ArrayList
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return persona;
    }
    
    
    
}
