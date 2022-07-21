/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;
import java.util.ArrayList;
import paquete01.Televisor;
/**
 *
 * @author SALA I
 */
public class MetodosTelevisor {
    private double televisorMasCaro;
    private String marcasMasVendidas;
    private double totalPrecio;
    private ArrayList<Televisor> t;

    public void calcularTelevisorMasCaro() {
        double s = t.get(0).obtenerPrecio();
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).obtenerPrecio() > s) {
                s = t.get(i).obtenerPrecio();
            }
            
        }
        televisorMasCaro = s;
    }

    public void calcularMarcasMasVendidas() {
        String s = "";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
        }
        marcasMasVendidas = s;
    }

    public void calcularTotalPrecio() {
        double s = 0;
        for (int i = 0; i < t.size(); i++) {
            s = s + t.get(i).obtenerPrecio();
            System.out.println(s);
        }
        totalPrecio = s;
    }
    
    public void establecerT (ArrayList<Televisor> lista) {
        t = lista;
    }

    public double obtenerTelevisorMasCaro() {
        return televisorMasCaro;
    }

    public String obtenerMarcasMasVendidas() {
        return marcasMasVendidas;
    }

    public double obtenerTotalPrecio() {
        return totalPrecio;
    }
    
    public ArrayList<Televisor> establecerT () {
        return t;
    }
    
    
    
}
