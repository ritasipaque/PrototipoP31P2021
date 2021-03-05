/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author familia Sipaque
 */
public class Maestro {
     private int  codigo_maestro;
 private String nombre_maestro;
    private String direccion_maestro;
    private String telefono_maestro;
    private String email_maestro;
    private String estatus_maestro;

    public int getCodigo_maestro() {
        return codigo_maestro;
    }

    public void setCodigo_maestro(int codigo_maestro) {
        this.codigo_maestro = codigo_maestro;
    }

    public String getNombre_maestro() {
        return nombre_maestro;
    }

    @Override
    public String toString() {
        return "Maestro{" + "codigo_maestro=" + codigo_maestro + ", nombre_maestro=" + nombre_maestro + ", direccion_maestro=" + direccion_maestro + ", telefono_maestro=" + telefono_maestro + ", email_maestro=" + email_maestro + ", estatus_maestro=" + estatus_maestro + '}';
    }

    public void setNombre_maestro(String nombre_maestro) {
        this.nombre_maestro = nombre_maestro;
    }

    public String getDireccion_maestro() {
        return direccion_maestro;
    }

    public void setDireccion_maestro(String direccion_maestro) {
        this.direccion_maestro = direccion_maestro;
    }

    public String getTelefono_maestro() {
        return telefono_maestro;
    }

    public void setTelefono_maestro(String telefono_maestro) {
        this.telefono_maestro = telefono_maestro;
    }

    public String getEmail_maestro() {
        return email_maestro;
    }

    public void setEmail_maestro(String email_maestro) {
        this.email_maestro = email_maestro;
    }

    public String getEstatus_maestro() {
        return estatus_maestro;
    }

    public void setEstatus_maestro(String estatus_maestro) {
        this.estatus_maestro = estatus_maestro;
    }   
    
}
