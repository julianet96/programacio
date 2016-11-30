import java.util.Arrays;

/**
 * Created by jcolomr on 29/11/16.
 */
public class prova {
    public static void main(String[] args) {
        String s= "avui fa bon diac";
        int dim = 3;
        double a = 1+s.length() / dim;
        int b = (int) Math.round(a);
        char[][] rr = new char[b][dim];
        int z= 0;
        int y=0;
        int cont=0;
        String result="";


        for (int j = 0; j < b ; j++) {
            for (int k = 0; k <dim ; k++) {


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
        System.out.println(result);


    }
}
