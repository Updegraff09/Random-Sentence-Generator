public class Main {

    public static void main(String[] args) {
        String[] wordListOne = {"Christian", "Cyrina", "Kathy", "Skittles", "Jorden"};
        String[] wordListTwo = {"sexy", "angry", "ugly", "bored", "tired"};
        String[] wordListThree = {"chunky-monkey", "destroyer-of-worlds", "goof-ball", "potato-head"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String grammer;

        if (rand2 == 1 || rand2 == 2) {
            grammer = " is an ";
        }
        else {
            grammer = " ia a ";
        }

        String phrase = wordListOne[rand1] + grammer + wordListTwo[rand2] + ' ' + wordListThree[rand3] + '.';

        System.out.println(phrase);
        
    }


}
