
package atividade_q2;
/**
 *
 * @author danielkorban
 */
public class Teste {
    public static void main(String[] args) {
        String simbolo = "1";
        
        Numero numeroUm = new NumeroUm();
        numeroUm.imprimir(simbolo);
        System.out.println("");
        // saida: 1
        
        Numero numComParenteses = new DecoratorParenteses(new NumeroUm());
        numComParenteses.imprimir(simbolo);
        System.out.println("");
        // saida: (1)

        Numero numComColchetes = new DecoratorColchetes(new NumeroUm());
        numComColchetes.imprimir(simbolo);
        System.out.println("");
        // saida: [1]
        
        Numero numDecorado = new DecoratorAspas(new DecoratorChaves(new  DecoratorParenteses (new DecoratorColchetes(new NumeroUm()))));
        numDecorado.imprimir(simbolo);
        // Saida: “{[(1)]}”
        
    }
}
