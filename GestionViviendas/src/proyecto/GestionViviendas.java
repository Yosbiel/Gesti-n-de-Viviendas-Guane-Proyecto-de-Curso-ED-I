/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;
/**
 *
 * @author Yosbiel A
 */
public class GestionViviendas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ViviendaDAO.listarViviendas();
        
        
        DLinkedList<Vivienda> viviendas = new DLinkedList<>();
        LinkedStack<Gestion> historial = new LinkedStack<>();
        LinkedQueue<SolicitudMantenimiento> cola = new LinkedQueue<>();

        viviendas.add(new Vivienda("V01", "Calle 1", "Individual", "Buena", true));
        viviendas.add(new Vivienda("V02", "Calle 2", "Multifamiliar", "Regular", false));

        historial.Push(new Gestion("V01", "Registro inicial", "2025-01"));
        cola.add(new SolicitudMantenimiento("V02", "Fuga de agua", "2025-02"));

        System.out.println("VIVIENDAS:");
        for (int i = 0; i < viviendas.size(); i++) {
            System.out.println(viviendas.get(i));
        }

        System.out.println("\nBÚSQUEDA DE VIVIENDA:");

        Vivienda buscada = buscarViviendaPorCodigo(viviendas, "V01");

        if (buscada != null) {
            System.out.println("Vivienda encontrada:");
            System.out.println(buscada);
        } else {
            System.out.println("Vivienda no encontrada");
        }
    }

    public static Vivienda buscarViviendaPorCodigo(DLinkedList<Vivienda> lista, String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Vivienda v = lista.get(i);
            if (v.getCodigo().equalsIgnoreCase(codigo)) {
                return v;
            }
        }
        return null;
    }
}
