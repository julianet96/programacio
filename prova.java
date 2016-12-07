import java.util.Arrays;

/**
 * Created by jcolomr on 29/11/16.
 */
public class prova {
    public static void main(String[] args) {
        String s = "ACEGBDF";
        int dim = 2;
        int b = (int) Math.ceil(s.length() / (double) dim);
        char[][] decode = new char[b][dim];
        int z = 0;
        int y = 0;
        int cont = 0;
        String result = "";
        int rest1 = dim - (dim*b -s.length());
        System.out.println(rest1);


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


            result += (char[])decode[i];
        }

//        System.out.println(Arrays.deepToString(decode));
//        for (int i = 0; i < decode.length; i++) {
//            for (char[] codifica : decode) {
//                if (codifica[i] != 0) {
//                    result += codifica[i];
//                }
//            }
//
//
//        }
        System.out.println(result);
    }
}
