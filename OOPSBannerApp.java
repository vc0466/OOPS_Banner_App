public class OOPSBannerApp {

    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        String[] patternO = {
            "   ***   ",
	    " **   ** ",
	    " **   ** ",
	    " **   ** ",
	    " **   ** ",
	    " **   ** ",
	    " **   ** ",
	    "  ** **  ",
	    "   ***   ",
        };

        String[] patternP = {
	    "******    ",
	    "**    **  ",
	    "**     ** ",
	    "**    **  ",
	    "******    ",
	    "**        ",
	    "**        ",
	    "**        ",
	    "**        "
        };

        String[] patternS = {
            "   ***** ",
	    " **      ",
	    "**       ",
	    " **      ",
	    "   ***   ",
	    "      ** ",
	    "       **",
	    "      ** ",
	    " *****   "
        };

        String[] patternSpace = {
            "  ",
            "  ",
            "  ",
            "  ",
            "  ",
            "  ",
            "  ",
	    "  ",
	    "  "
        };

        charMaps[0] = new CharacterPatternMap('O', patternO);
        charMaps[1] = new CharacterPatternMap('P', patternP);
        charMaps[2] = new CharacterPatternMap('S', patternS);
        charMaps[3] = new CharacterPatternMap(' ', patternSpace);

        return charMaps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }
        return new String[9]; 
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        // Change from line < 7 to line < 9
        for (int line = 0; line < 9; line++) {
            StringBuilder sb = new StringBuilder(); 
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                if (pattern != null && pattern.length > line) {
                    sb.append(pattern[line]).append("  ");
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
