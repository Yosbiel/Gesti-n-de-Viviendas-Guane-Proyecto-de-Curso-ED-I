/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Yosbiel A
 */
public class Vivienda {
    private String codigo;
    private String direccion;
    private String tipo;
    private String estado;
    private boolean disponible;

    public Vivienda(String codigo, String direccion, String tipo, String estado, boolean disponible) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.tipo = tipo;
        this.estado = estado;
        this.disponible = disponible;
    }

    public String getCodigo() { return codigo; }
    public String getDireccion() { return direccion; }
    public String getTipo() { return tipo; }
    public String getEstado() { return estado; }
    public boolean isDisponible() { return disponible; }

    @Override
    public String toString() {
        return codigo + " | " + direccion + " | " + tipo + " | " + estado + " | Disponible: " + disponible;
    }
}

