package atividade_q2;

/**
 *
 * @author danielkorban
 */
public abstract class DecoratorBase implements Numero{
    
    private Numero wrappee;

    public DecoratorBase(Numero wrappee) {
        this.wrappee = wrappee;
    }
    
    @Override
    public abstract void imprimir(String mensagem);

    public Numero getWrappee() {
        return wrappee;
    }
    
}
