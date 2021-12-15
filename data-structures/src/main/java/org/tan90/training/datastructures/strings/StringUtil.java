package org.tan90.training.datastructures.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringUtil {

    public static boolean isUnique(String str) {
        Set<Character> characterSet = new HashSet<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (characterSet.contains(arr[i])) {
                return false;
            }
            characterSet.add(arr[i]);
        }
        return true;
    }

    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = sort(str1);
        str2 = sort(str2);
        return str1.equals(str2);
    }

    private static String sort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static String urlify(String str) {
        int numberOfSpaces = 0;
        for (int i = 0 ; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                numberOfSpaces++;
            }
        }

        int size = str.length() + (numberOfSpaces * 2);
        char[] arr = new char[size];
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                arr[j++] = '%';
                arr[j++] = '2';
                arr[j++] = '0'; 
            }
            else {
                arr[j++] = str.charAt(i);
            } 
        }
        return new String(arr);
    }

    public static boolean checkIfPermutionPalindrome(String str) {
        Map<Character, Integer> occurrenceMap = new HashMap<>();
        for (int i = 0; i < str.length();i++) {
            if (occurrenceMap.containsKey(str.charAt(i))) {
                occurrenceMap.put(str.charAt(i), occurrenceMap.get(str.charAt(i)) + 1);
            }
            else {
                occurrenceMap.put(str.charAt(i), 1);
            }
        }

        boolean oddFound = false;
        for (Map.Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
            if ((entry.getValue() % 2) != 0) {
                if (!oddFound) {
                    oddFound = true;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

    

}