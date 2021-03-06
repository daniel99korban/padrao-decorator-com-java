
package atividade;
/**
 *
 * @author danielkorban
 */
public class Teste {
    public static void main(String[] args) {
        
        String mensagem = "ola, estou testando uma implementação com o padrão decorator";
        
        Emissor emissorCript = new EmissorDecoratorCriptografia(new EmissorBasico());
        emissorCript.enviar(mensagem);
        // saida: 
        
        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.enviar(mensagem);
        
        Emissor emissorCriptCompr = new EmissorDecoratorCriptografia(new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissorCriptCompr.enviar(mensagem);
        // Saida: Enviando mensagem criptografada:
        // Enviando uma mensagem:  
        // rotaroced oãrdap o moc oãçatnemelpmi amu odnatset uotse ,alo
        // Enviando mensagem comprimida: 
        // Enviando uma mensagem:
        // x�Ǳ0�U~ �z�.��|d��($����y���B}p���8cv���[h���̛��|��
        
    }
}
