package level1;

import java.util.HashMap;
import java.util.Scanner;

//time-complexity - O(n)
//space-complexity - O(n)
public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        HashMap<Character, Integer> str1LetterCount = new HashMap<>();
        for(char c: str1.toLowerCase().toCharArray()) {
            if(c == ' ')
                continue; 
            str1LetterCount.put(c, str1LetterCount.getOrDefault(c, 0)+1);
        }
        for(char c: str2.toLowerCase().toCharArray()) {
            if(c == ' ')
                continue; 
            else if(!str1LetterCount.containsKey(c))
                return false;
            str1LetterCount.put(c, str1LetterCount.get(c)-1);
        }
        for(int count: str1LetterCount.values()) {
            if(count != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter string2: ");
        String str2 = sc.nextLine();
        System.out.println(isAnagram(str1, str2));
        sc.close();
    }
}


//can do using Arrays.sort
//sort two strings and compare. if equal anagram else not an anagram
//but for sorting time complexity is O(nlogn)