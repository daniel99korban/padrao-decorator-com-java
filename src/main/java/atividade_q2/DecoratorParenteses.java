
package atividade_q2;

/**
 *
 * @author danielkorban
 */
public class DecoratorParenteses extends DecoratorBase{

    public DecoratorParenteses(Numero wrappee) {
        super(wrappee);
    }
    
    @Override
    public void imprimir(String mensagem) {
        System.out.print("(");
        this.getWrappee().imprimir(mensagem);
        System.out.print(")");
    }
    
}
