
package teste;

/**
 *
 * @author danielkorban
 */
public abstract class DecoBase implements Componente{
    
    Componente wrappee;

    public DecoBase(Componente wrappee) {
        this.wrappee = wrappee;
    }

}
