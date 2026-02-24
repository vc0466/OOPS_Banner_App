public class BannerAppUC6 {

    public static String[] getOPattern() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", " *     * "),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", " *     * "),
                String.join("", "  *****  ")
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                String.join("", "*******  "),
                String.join("", "*      * "),
                String.join("", "*      * "),
                String.join("", "*******  "),
                String.join("", "*        "),
                String.join("", "*        "),
                String.join("", "*        ")
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                String.join("", "  ****** "),
                String.join("", " *       "),
                String.join("", " *       "),
                String.join("", "  *****  "),
                String.join("", "       * "),
                String.join("", "       * "),
                String.join("", " ******  ")
        };
    }

    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i];
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
