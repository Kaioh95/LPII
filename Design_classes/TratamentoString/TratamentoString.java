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
        HashMap<String, Integer> cont = new HashMap<String, Integer>();
        Integer number;
        
        for(String aux: strSplited){
            if(cont.containsKey(aux)){
                number = cont.get(aux);
                cont.replace(aux, number, number+1);
            }
            else{
                cont.put(aux, 1);
            }
        }
        for(String aux: cont.keySet()){
            System.out.println(aux+": "+cont.get(aux));
        }
        cont.clear();
    }
}
