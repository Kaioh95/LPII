/**
 * Escreva a descrição da classe TratamentoString aqui.
 * 
 * @author Kaio Henrique
 * @version 13/08
 */
import java.util.HashMap;
import java.util.Map;

public class TratamentoString
{
    private String str;
    /**
     * Construtor para objetos da classe TratamentoString
     */
    public TratamentoString(String str){
        // inicializa variáveis de instância
        this.str = str;
    }
    public void contaPalavras(){
        String[] strSplited = str.split(" ");
        for(String aux: strSplited){
            System.out.println(aux);
        }
    }
}
