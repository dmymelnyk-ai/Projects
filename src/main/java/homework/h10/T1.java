package homework.h10;

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/

public class T1 {
  public char kthCharacter(int k) {
    String word = "a";

    while (word.length() < k) {
      int length = word.length();

      for (int i = 0; i < length; i++) {
        char c = word.charAt(i);

        if (c == 'z') {
          word += 'a';
        } else {
          word += (char) (c + 1);
        }
      }
    }

    return word.charAt(k - 1);
  }
}
