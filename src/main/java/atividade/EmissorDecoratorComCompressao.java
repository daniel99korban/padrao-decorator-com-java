
package atividade;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/**
 *
 * @author danielkorban
 */
public class EmissorDecoratorComCompressao extends EmissorDecorator{

    public EmissorDecoratorComCompressao(Emissor emisor) {
        super(emisor);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem comprimida: ");
        String mensagemComprimida;
        
        try {
            mensagemComprimida = comprime(mensagem);
        } catch (IOException ex) {
            mensagemComprimida = mensagem;
        }
        
        this.getEmisor().enviar(mensagemComprimida);
    
    }
    
    private String comprime(String mensagem) throws IOException{
        
//        ByteArrayOutputStream out = new ByteArrayOutputStream(); 
//        DeflaterOutputStream dout = DeflaterOutputStream(out, new Deflater());
//        
//        dout.write(mensagem.getBytes());
//        dout.close();
//        return new String(out.toByteArray());
        byte[] input = mensagem.getBytes("UTF-8");
        byte[] output = new byte[100];
        Deflater compresser = new Deflater();
        compresser.setInput(input);
        compresser.finish();
        int quantidade = 0;
        quantidade = compresser.deflate(output);
        return new String(output, 0, quantidade, "UTF-8");
    }

}
