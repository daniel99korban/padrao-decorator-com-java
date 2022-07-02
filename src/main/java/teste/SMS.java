/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *Classe decoradora
 * @author danielkorban
 */
public class SMS extends DecoBase{

    public SMS(Componente wrappee) {
        super(wrappee);
    }

    @Override
    public void enviar(String mensagem) {
        wrappee.enviar(mensagem + " SMS->");
    }
    
}
