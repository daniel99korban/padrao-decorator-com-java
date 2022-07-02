
package atividade_q2;

/**
 *
 * @author danielkorban
 */
public class DecoratorColchetes extends DecoratorBase{

    public DecoratorColchetes(Numero wrappee) {
        super(wrappee);
    }
    
    @Override
    public void imprimir(String mensagem) {
        System.out.print("[");
        this.getWrappee().imprimir(mensagem);
        System.out.print("]");
        //System.out.println("");
    }
    
}
