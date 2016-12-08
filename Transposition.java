import java.lang.reflect.Array;
import java.util.Arrays;

public class  Transposition {
    static String cypher(String s, int dim) {
        int b = (int) Math.ceil(s.length() / (double) dim);
        char[][] code = new char[b][dim];
        int cont = 0;
        String result = "";

        for (int j = 0; j < b; j++) {
            for (int k = 0; k < dim; k++) {
                if (cont == s.length()) {
                    code[j][k] = 0;
                    continue;
                }
                char c = s.charAt(cont);
                cont++;
                code[j][k] = c;
            }
        }
        for (int i = 0; i < code[0].length; i++) {
            for (char[] codifica : code) {
                if (codifica[i] != 0) {
                    result += codifica[i];
                }
            }
        }
        return result;
    }

    static String decypher(String s, int dim) {
       // calculam la dimecio de files que nesesitam
        int b = s.length() /  dim;
        if (s.length()%  dim != 0){
            b++;
        }
        char[][] decode = new char[b][dim];
        int cont = 0;
        StringBuilder result = new StringBuilder(s);
        int cont1 = 0;
        //El que calculam es que la matriu estigui ben colocada es a dir on em de colocar els velors 0;
        int zero = dim - (dim*b -s.length());

        for (int i = 0; i < decode[0].length ; i++) {
            for (int j = 0; j < decode.length; j++) {
               //el que fa ñ'if seguent es que si l'array esta on em calculat antariorment ens vagi ficant el velor 0
               //per tenir la matriu ben construida
                if (i==zero && j==(b-1)){
                    decode[j][i] = 0;
                    zero++;
                    continue;
                }
                //comprobam si el  llarg de la frase sa acabat que ens fiqui valors 0
                if (cont == s.length()) {
                    decode[j][i] = 0;
                    continue;
                }
                char c = s.charAt(cont);
                cont++;
                decode[j][i] = c;
            }

        }
        // el que feim aqui es que ens valli lletgint en vertical i que si el valor es diferent a 0 mos ho vagi ficant dedins l'string
        for (int i = 0; i < decode.length; i++) {
            for (int j = 0; j <decode[i].length ; j++) {
                if (decode[i][j] != 0 ){
                    result.setCharAt(cont1,(decode[i][j]));
                    cont1++;
                }
            }
        }
        return result.toString();
    }


    static String cypher(String s, String key) {
        int b = (int) Math.ceil(s.length() / (double) key.length());
        int cont1 = 0;
        StringBuilder sb = new StringBuilder(key);
        char[][] code = new char[b][key.length()];
        String result = "";
        //Els arrais es per treura la ordenacio de la key
        char[] order = new char[key.length()];
        int[] pasw = new int[key.length()];
       //feim el for per fikar la key dedins l'array
        for (int i = 0; i <key.length() ; i++) {
           order[i] = key.charAt(i);
        }
        //ordenam la key
        Arrays.sort(order);
        //amb aquets dos bucles el que feim es comperar la key ordenada i la key normal i ficar els valors dedins an array de ints
        //Tambe comprovam que si el velor es repetit els hi dongui distints valors
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if (order[i]== sb.charAt(j)){
                   pasw[i] = j;
                    sb.setCharAt(j, (char) 0);
                   break;
                }
            }
        }
        //Ficam l'string dedins l'array
        for (int j = 0; j < b; j++) {
            for (int k = 0; k < key.length(); k++) {
                if (cont1 == s.length()) {
                    code[j][k] = 0;
                    continue;
                }
                char c = s.charAt(cont1);
                cont1++;
                code[j][k] = c;

            }
        }
        //El que feim en aquest for es treura els velors per columnes pero dugent l'ordre dels indexos.
        for (int i = 0; i < key.length(); i++) {
           for (int j = 0; j< b; j++) {
               if (code[j][pasw[i]] != 0) {
                   result += code[j][pasw[i]];
               }
           }

        }
        return result;
    }

    static String decypher(String s, String key) {
        return null;
    }
}
