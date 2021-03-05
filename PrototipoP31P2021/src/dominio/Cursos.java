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
public class Cursos {
    private String codigo_cursos;
     private String nombre_cursos;
    private String estatus_cursos;

    @Override
    public String toString() {
        return "Cursos{" + "codigo_cursos=" + codigo_cursos + ", nombre_cursos=" + nombre_cursos + ", estatus_cursos=" + estatus_cursos + '}';
    }

    public String getCodigo_cursos() {
        return codigo_cursos;
    }

    public void setCodigo_cursos(String codigo_cursos) {
        this.codigo_cursos = codigo_cursos;
    }

    public String getNombre_cursos() {
        return nombre_cursos;
    }

    public void setNombre_cursos(String nombre_cursos) {
        this.nombre_cursos = nombre_cursos;
    }

    public String getEstatus_cursos() {
        return estatus_cursos;
    }

    public void setEstatus_cursos(String estatus_cursos) {
        this.estatus_cursos = estatus_cursos;
    }
}
