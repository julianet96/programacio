public class Caesar {
    static String cypher(String s, int delta) {
        String result = "";
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            for (int j= 0; j<delta;j++){
                if ( c >='A' && c < 'Z'){
                    c ++;
                }
                 else if (c == 'Z'){
                    c = 'A';
                }
            }
            result += (char) (c);
       }
        return result;
    }

    static String decypher(String s, int delta) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            s = s.toUpperCase();
            char c = s.charAt(i);
            for (int j= 0; j<delta;j++){
                if (c >'A' && c <= 'Z'){
                    c --;

                } else if (c == 'A'){
                    c = 'Z';
                }
            }
            result += (char) (c);
        }
        return result;
    }

    static String magic(String s) {
        String s2="";
        for (int i = 0; i < 26 ; i++) {
            s2 = decypher(s, i);
            if (s2.contains(" EL ") || s2.contains(" LA ") || s2.contains(" DE ")){
                break;
            }

        }


        return s2;
    }
}

