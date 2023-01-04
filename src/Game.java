public class Game {
    private static String word;
    private static int guessCount = 0;
    public static int incorrectCount = 0;
    private static String dotLine = "";
//    public List<String> dotLine1 = new ArrayList<String>();
    private int level;
//    private String guess;
//    private String charGuess;
//
//    public Game(String guess) {
//        this.guess = guess;
//    }
//
//    public Game(String charGuess) {
//        this.charGuess = charGuess;
//    }

    public Game(int level) {
        this.level = level;
    }

    public Game() {
        level = 0;
    }

    public void word() {
        int ran = (int) (Math.random() * 5);
        String[] a1 = {"robot", "circle", "kitten", "swimming", "carrot", "audio", "idea", "euro", "curtain", "textbook", "outdoors", "mathematics" };
        String[] a2 = {"kayak", "molecule", "peanut", "television", "garbage", "shoebox", "subway", "cartoons", "photograph", "pillowcase", "butterfly"};
        String[] a3 = {"caviar", "diagonal", "devious", "ornament", "carnival", "jazz", "injury", "rhythm", "vixen", "xylophone", "espionage", "larynx", "jinx", "jaywalking"};
        if (level == 1) {
            word = a1[ran];
        } else if (level == 2) {
            word = a2[ran];
        } else if (level == 3) {
            word = a3[ran];
        } else {
            int ranOp = (int) (Math.random() * 3);
            if (ranOp == 1) {
                word = a1[ran];
            } else if (ranOp == 2) {
                word = a2[ran];
            } else {
                word = a3[ran];
            }

        }
    }

    public String getDotLine() {
        return dotLine;
    }


    public void dotLine() {
        for (int i = 0; i < word.length(); i++) {
            dotLine = dotLine + "_";
        }
    }


    public String fullGuess(String guess) {
        guessCount += 1;
        System.out.println("Guesses Taken: " + guessCount);
        if (guess.equals(word)) {
            dotLine = word;
        } else {
            incorrectCount += 1;

//            for (int i = 0; i < word.length(); i++) {
//                if(guess.contains(word.substring(i, i + 1))) {
//                    dotLine = dotLine.substring(0, i) + word.substring(i, i+1) + dotLine.substring(i+1);
//                }
////                if (word.substring(i, i+1).equals(guess.substring(i, i+1))) {
////                    dotLine = dotLine.substring(0, i) + word.substring(i, i+1) + dotLine.substring(i+1);
////                }
//            }
        }
        return getDotLine();
    }

    public String charGuess(String charGuess) {
        guessCount += 1;
        System.out.println("Guesses Taken: " + guessCount);
        if(word.contains(charGuess)) {
            for (int i = 0; i < word.length(); i++) {
                if (word.substring(i, i+1).equals(charGuess)) {
                    dotLine = dotLine.substring(0, i) + word.substring(i, i+1) + dotLine.substring(i+1);
                }
            }
        } else {
            incorrectCount += 1;
        } return getDotLine();
    }

    public boolean isPlaying() {
        if (dotLine.equals(word)) {
            System.out.println("CONGRATULATIONS!! YOU'VE GUESSED THE WORD!!");
            return false;
        } else if (incorrectCount >= 7){
            return false;
        } else {
            return true;
        }
    }

    public static void hangman() {
        if (incorrectCount == 1) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        } else if (incorrectCount == 2) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        } else if (incorrectCount == 3) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        } else if (incorrectCount == 4) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          /  ");
            System.out.println("___|___      /   ");
        } else if (incorrectCount == 5) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }else if (incorrectCount == 6) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|");
            System.out.println("   |         / | ");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }else if (incorrectCount == 7) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + word);
        }
    }
}
