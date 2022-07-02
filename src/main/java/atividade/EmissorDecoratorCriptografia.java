
package atividade;

/**
 *
 * @author danielkorban
 */
public class EmissorDecoratorCriptografia extends EmissorDecorator{

    public EmissorDecoratorCriptografia(Emissor emisor) {
        super(emisor);
    }
    
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem criptografada:");
        this.getEmisor().enviar(criptografa(mensagem));
    }
    
    private String criptografa(String mensagem){
        String mensagemCriptografada = new StringBuilder(mensagem).reverse().toString();
        return mensagemCriptografada;
    }
    
}
