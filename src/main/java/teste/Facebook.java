
package teste;

/**
 * Classe decoradora
 * @author danielkorban
 */
public class Facebook extends DecoBase{

    public Facebook(Componente wrappee) {
        super(wrappee);
    }


    @Override
    public void enviar(String mensagem) {
        wrappee.enviar(mensagem + " Facebook ->");
    }
    
    
  
}
