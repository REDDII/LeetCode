class Solution {
    public boolean isValid(String s) {
        int nbre = s.length();
        char[] tab = new char[nbre];
        int pile = -1;

        if (nbre == 1 || nbre % 2 != 0 ) return false;
        System.out.println("init l = " + nbre);
        System.out.println("init pile = " + pile);
        for (int i=0; i<nbre; i++) {
            char c = s.charAt(i);
            System.out.println("c = " + c);
            if (c == '(' || c == '{' || c == '[') {
                tab[++pile] = c;
                System.out.println("pile = " + pile);
            }

            else {
                System.out.println("pile = " + pile);
                if (pile == -1) return false;
                char open = tab[pile--];
                System.out.println("précédent à supp = " + open);

                if ((c == ')' && open != '(') ||
                    (c == '}' && open != '{') ||
                    (c == ']' && open != '[')) {
                    return false;
                }
            }
        }
        System.out.println(pile);
        return pile == -1;
    }
}