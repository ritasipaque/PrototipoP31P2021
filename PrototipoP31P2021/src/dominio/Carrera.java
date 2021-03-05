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
public class Carrera {
    private String codigo_carreras;
 private String nombre_carreras;
 private String estatus_carreras;

    @Override
    public String toString() {
        return "Carrera{" + "codigo_carreras=" + codigo_carreras + ", nombre_carreras=" + nombre_carreras + ", estatus_carreras=" + estatus_carreras + '}';
    }

    public String getCodigo_carreras() {
        return codigo_carreras;
    }

    public void setCodigo_carreras(String codigo_carreras) {
        this.codigo_carreras = codigo_carreras;
    }

    public String getNombre_carreras() {
        return nombre_carreras;
    }

    public void setNombre_carreras(String nombre_carreras) {
        this.nombre_carreras = nombre_carreras;
    }

    public String getEstatus_carreras() {
        return estatus_carreras;
    }

    public void setEstatus_carreras(String estatus_carreras) {
        this.estatus_carreras = estatus_carreras;
    }
}
