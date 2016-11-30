import java.lang.reflect.Array;
import java.util.Arrays;

public class  Transposition {
    static String cypher(String s, int dim) {
        int b =  (int) Math.ceil( s.length() / (double) dim);
        char[][] rr = new char[b][dim];
        int z= 0;
        int y=0;
        int cont=0;
        String result="";

        for (int j = 0; j < b ; j++) {
            for (int k = 0; k <dim ; k++) {
                if (cont == s.length()){
                    rr[z][y] = 0;
                    continue;
                }
                char c = s.charAt(cont);
                cont++;
                rr[z][y] = c;
                y++;
            }
            y = 0;
            z++;
        }
        for (int i = 0; i < rr[0].length; i++) {
            for(char[] codifica: rr){
               if(codifica[i] != 0 ){ result += codifica[i];}
            }
        }
        return result;
    }

    static String decypher(String s, int dim) {
        return null;
    }


    static String cypher(String s, String key) {
        return null;
    }

    static String decypher(String s, String key) {
        return null;
    }
}
