
package atividade_q2;

/**
 *
 * @author danielkorban
 */
public class DecoratorChaves extends DecoratorBase{

    public DecoratorChaves(Numero wrappee) {
        super(wrappee);
    }

    @Override
    public void imprimir(String mensagem) {
        System.out.print("{");
        this.getWrappee().imprimir(mensagem);
        System.out.print("}");
        //System.out.println("");
    }
    
}
