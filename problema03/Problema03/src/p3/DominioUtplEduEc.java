/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author SALA I
 */
public class DominioUtplEduEc implements DominioCorreo{
    private String dominio;
    
    public void establecerDominio(String g){
        dominio = g;
    }
    
    public String obtenerDominio(){
        return dominio;
    }
}
