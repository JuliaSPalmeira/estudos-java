package academy.devdojo.javacore.Ycolecoes.teste;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","você");
        map.putIfAbsent("vc","você2");
        System.out.println(map);
        for (String key : map.keySet()){ //a partir da cahve o valor
            System.out.println(key + " : "+map.get(key)); //key chave e get() valor associado a chave
        }
        System.out.println("---------");
        for (String valores: map.values()){ //a partir do valor a chave n sei se tem jeito
            System.out.println(valores);
        }
        //se quiser os dois
        System.out.println("---------");
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+ " - "+entry.getValue());
        }
    }
}
