
package atividade;

/**
 *
 * @author danielkorban
 */
public abstract class EmissorDecorator implements Emissor{
    
    private Emissor emisor;

    public EmissorDecorator(Emissor emisor) {
        this.emisor = emisor;
    }
    
    public abstract void enviar(String mensagem);

    public Emissor getEmisor() {
        return emisor;
    }
    
}
