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
public class Facultad {
private String codigo_facultad;
private String nombre_facultad;

    @Override
    public String toString() {
        return "Facultad{" + "codigo_facultad=" + codigo_facultad + ", nombre_facultad=" + nombre_facultad + ", estatus_facultad=" + estatus_facultad + '}';
    }

    public String getCodigo_facultad() {
        return codigo_facultad;
    }

    public void setCodigo_facultad(String codigo_facultad) {
        this.codigo_facultad = codigo_facultad;
    }

    public String getNombre_facultad() {
        return nombre_facultad;
    }

    public void setNombre_facultad(String nombre_facultad) {
        this.nombre_facultad = nombre_facultad;
    }

    public String getEstatus_facultad() {
        return estatus_facultad;
    }

    public void setEstatus_facultad(String estatus_facultad) {
        this.estatus_facultad = estatus_facultad;
    }
    private String estatus_facultad;
    
}
