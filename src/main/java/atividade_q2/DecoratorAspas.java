
package atividade_q2;

/**
 *
 * @author danielkorban
 */
public class DecoratorAspas extends DecoratorBase{

    public DecoratorAspas(Numero wrappee) {
        super(wrappee);
    }

    @Override
    public void imprimir(String mensagem) {
        System.out.print("\"");
        this.getWrappee().imprimir(mensagem);
        System.out.print("\"");
    }
    
}
