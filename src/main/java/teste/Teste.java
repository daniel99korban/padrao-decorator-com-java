
package teste;

/**
 *
 * @author danielkorban
 */
public class Teste {
    public static void main(String[] args) {
        
        Componente concretComp = new ConcretComponente();
        
        //Componente envioDeMensagens = new Facebook(new SMS(concretComp));
        // Saida: historico de envios:  Facebook -> SMS->
        Componente envioDeMensagens = new SMS(new Facebook(concretComp));
        // Saids: historico de envios:  SMS-> Facebook ->
        envioDeMensagens.enviar("");
    }
}
