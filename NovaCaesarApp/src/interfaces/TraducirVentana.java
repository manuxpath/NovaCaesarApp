/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author Usuario
 * @version 0.01
 */
public interface TraducirVentana {
    
    public void traducir(String idioma);
    public void cambioFuente(String idioma);
    public boolean verificarIdioma(String idioma,String respuesta,String titulo);
    public void traducirTituloVentana(String idioma);
}
