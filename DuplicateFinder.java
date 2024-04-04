public class DuplicateFinder {
    public static void main(String[] args) {
        String text = "Welcome To JavaProgram";

        System.out.println("Duplicate characters in the string are:");
        findDuplicates(text);
    }

    public static void findDuplicates(String str) {
        // Convert the string to lowercase to ignore case sensitivity
        str = str.toLowerCase();

        // Iterate over each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // Check if the character is a letter and not already printed as duplicate
            if (Character.isLetter(currentChar) && str.indexOf(currentChar, i + 1) != -1) {
                // Check if the character is not already printed as duplicate
                if (str.indexOf(currentChar) == i) {
                    System.out.print(currentChar + " ");
                }
            }
        }
    }
}
