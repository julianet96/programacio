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
        int b = (int) Math.ceil(s.length() / (double) dim);
        char[][] decode = new char[b][dim];
        int z = 0;
        int y = 0;
        int cont = 0;
        String result = "";
        int rest1 = dim - (dim*b -s.length());
//        System.out.println(rest1);
        for (int i = 0; i < dim ; i++) {
            for (int j = 0; j < b; j++) {
                if (y==rest1 && z==(b-1)){
                    decode[z][y] = 0;
                    rest1++;
                    continue;
                }
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
        for (int i = 0; i < decode.length; i++) {
            for (char[] codifica : decode) {
                if (codifica[i] != 0) {
                    result += codifica[i];
                }
            }
        }
        return result;
    }


    static String cypher(String s, String key) {
        return null;
    }

    static String decypher(String s, String key) {
        return null;
    }
}
