package com.klimovich.Anagram;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
	System.out.println("Enter a word or phrase");
	try (Scanner scanner = new Scanner(System.in)) {
	    LettersFlipper flipper = new LettersFlipper();
	    System.out.println(flipper.reverseString(scanner.nextLine()));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
