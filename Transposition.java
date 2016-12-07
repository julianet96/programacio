import java.lang.reflect.Array;
import java.util.Arrays;

public class  Transposition {
    static String cypher(String s, int dim) {
        int b = (int) Math.ceil(s.length() / (double) dim);
        char[][] code = new char[b][dim];
        int z = 0;
        int y = 0;
        int cont = 0;
        String result = "";

        for (int j = 0; j < b; j++) {
            for (int k = 0; k < dim; k++) {
                if (cont == s.length()) {
                    code[z][y] = 0;
                    continue;
                }
                char c = s.charAt(cont);
                cont++;
                code[z][y] = c;
                y++;
            }
            y = 0;
            z++;
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
        int z = 0;
        int y = 0;
        int cont = 0;

        StringBuilder result = new StringBuilder(s);
        int cont1 = 0;
        //El que calculam es que la matriu estigui ben colocada es a dir on em de colocar els velors 0;
        int zero = dim - (dim*b -s.length());

        for (int i = 0; i < decode[0].length ; i++) {
            for (int j = 0; j < decode.length; j++) {
               //el que fa ñ'if seguent es que si l'array esta on em calculat antariorment ens vagi ficant el velor 0
               //per tenir la matriu ben construida
                if (y==zero && z==(b-1)){
                    decode[z][y] = 0;
                    zero++;
                    continue;
                }
                //comprobam si el  llarg de la frase sa acabat que ens fiqui valors 0
                if (cont == s.length()) {
                    decode[z][y] = 0;
                    continue;
                }
                char c = s.charAt(cont);
                cont++;
                decode[z][y] = c;
                z++;

            }
            z = 0;
            y++;
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




        return null;
    }

    static String decypher(String s, String key) {
        return null;
    }
}
