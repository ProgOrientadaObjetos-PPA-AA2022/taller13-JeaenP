/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    private double promedioTarifas;
    private ArrayList<Matricula> Matriculas;
    private double tarifa;
    
    public void establecerMatriculas(ArrayList<Matricula> lista) {
        Matriculas = lista;
    }
    public ArrayList<Matricula> obtenerMatriculas() {
        return Matriculas;
    }
    
    public void establecerPromedioTarifas(){
        for (int i = 0; i < Matriculas.size(); i++) {
            promedioTarifas += Matriculas.get(i).obtenerTarifa();
        }
        promedioTarifas /= Matriculas.size();
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
    
    public String toString() {
        String cadena = String.format("Lista\n");
        for (int i = 0; i < Matriculas.size(); i++) {
            cadena = String.format("%s\n%s\n", 
                    cadena,
                Matriculas.get(i));
            
        }
        cadena = String.format("%sPromedio: %.2f",cadena, promedioTarifas);
                
        
        return cadena;
    }
}
