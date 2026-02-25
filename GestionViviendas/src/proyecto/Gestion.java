/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Yosbiel A
 */
public class Gestion {
    private String codigoVivienda;
    private String descripcion;
    private String fecha;

    public Gestion(String codigoVivienda, String descripcion, String fecha) {
        this.codigoVivienda = codigoVivienda;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return fecha + " - " + codigoVivienda + " - " + descripcion;
    }
}


