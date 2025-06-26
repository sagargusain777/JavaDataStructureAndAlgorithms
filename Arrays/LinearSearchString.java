package Arrays;

// 📄 Program: Linear Search for a Character in a String
// 🔍 Description: This program finds the first occurrence of a given character
// in a string using the linear search technique. If the character is found,
// it returns the index; otherwise, it returns -1.
public class LinearSearchString {
    public static void main(String[] args) {

        String name = "sagargusain";
        char key = 'u';
        int answer = linearSearching(name, key);
        System.out.println(answer);

        System.out.println(linearSearch(name ,key));

    }


    static boolean linearSearch(String value, char target) {

        if (value.length() == 0) {
            return false;
        }

        for (char ch : value.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;

    }

    // 🧠 Method: Performs linear search for the target character in the input string
    static int linearSearching(String value, char target) {
        if (value.length() == 0) {
            return -1;    // empty string case
        }
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == target) {
                return i; // target found, return index
            }
        }
        return -1;
    }
}
