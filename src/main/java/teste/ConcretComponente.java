
package teste;

/**
 *
 * @author danielkorban
 */
public class ConcretComponente implements Componente{
   
    @Override
    public void enviar(String mensagem) {
        System.out.println("historico de envios: " + mensagem);
    }
   
}
