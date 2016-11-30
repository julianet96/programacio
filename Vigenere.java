public class Vigenere {

    static String encode(String s, String password) {
        String result = "";
        int y = 0;

           for (int i = 0; i < s.length(); i++) {

               if (y == password.length()){
                   y = 0;
               }
               //convertim en majuscules
               s = s.toUpperCase();
               password = password.toUpperCase();
               //coim cada paraula
               char c = s.charAt(i);
               char p = password.charAt(y);
               //PASAM LES VOCALS QUE TENEN ACCENT A VOCALS NORMALS
               if (c == 'À' || c=='Á'){c = 'A'; }
               if (c == 'È' || c=='É'){c = 'E'; }
               if (c == 'Ì' || c=='Í'){c = 'I'; }
               if (c == 'Ò' ||c == 'Ó'){c = 'O'; }
               if (c == 'Ù'){c = 'U'; }

               if (p == 'À' ||p == 'Á'){p = 'A'; }
               if (p == 'È' || p=='É'){p = 'E'; }
               if (p == 'Ì' || p=='Í'){p = 'I'; }
               if (p == 'Ò' ||p == 'Ó'){p = 'O'; }
               if (p == 'Ù'){p = 'U'; }
               //SI ESTA ENTRE LA A I LA Z AFEGIM UN PER PODER FER LA CLAU
               if (c >= 'A' && c <= 'Z') { y = y + 1;}

               for (int j = 0; j < Vigenere.conver(p); j++) {
                   if (c >= 'A' && c < 'Z') {
                       c++;
                       //si la lletre es z i en de suma un la convertim en A
                   } else if (c == 'Z') {
                       c = 'A';
                   }
               }
               result += (char) (c);
           }
        return result;
    }

    static String decode(String s, String password) {
        String result = "";
        int y = 0;

        for (int i = 0; i < s.length(); i++) {

            if (y == password.length()){
                y = 0;
            }
            //convertim en majuscules
            s = s.toUpperCase();
            password = password.toUpperCase();
            //coim cada paraula
            char c = s.charAt(i);
            char p = password.charAt(y);
            //SI ESTA ENTRE LA A I LA Z AFEGIM UN PER PODER FER LA CLAU
            if (c >= 'A' && c <= 'Z') { y = y + 1;}

            for (int j = 0; j < Vigenere.conver(p); j++) {
                if (c > 'A' && c <= 'Z') {
                    c--;
                    //si la lletra es A i em de restar un la pasam a Z
                } else if (c == 'A') {
                    c = 'Z';
                }
            }
            result += (char) (c);
        }
        return result;
    }
        //el que feim es pasar la lletra a un numero del 1 al 26
    static char conver(char p) {

        if(p == 'A') { p = 1;}
        if(p == 'B') { p = 2;}
        if(p == 'C') { p = 3;}
        if(p == 'D') { p = 4;}
        if(p == 'E') { p = 5;}
        if(p == 'F') { p = 6;}
        if(p == 'G') { p = 7;}
        if(p == 'H') { p = 8;}
        if(p == 'I') { p = 9;}
        if(p == 'J') { p = 10;}
        if(p == 'K') { p = 11;}
        if(p == 'L') { p = 12;}
        if(p == 'M') { p = 13;}
        if(p == 'N') { p = 14;}
        if(p == 'O') { p = 15;}
        if(p == 'P') { p = 16;}
        if(p == 'Q') { p = 17;}
        if(p == 'R') { p = 18;}
        if(p == 'S') { p = 19;}
        if(p == 'T') { p = 20;}
        if(p == 'U') { p = 21;}
        if(p == 'V') { p = 22;}
        if(p == 'W') { p = 23;}
        if(p == 'X') { p = 24;}
        if(p == 'Y') { p = 25;}
        if(p == 'Z') { p = 26;}
        return p;
    }
}


