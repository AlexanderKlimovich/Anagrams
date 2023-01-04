package com.foxminded.klimovicholeksandr.task1;

import java.util.Scanner;

public class Anagram extends Thread {

    @Override
    public void run() {
	System.out.println("Enter a word or phrase");
	try (Scanner scanner = new Scanner(System.in)) {
	    LettersFlipper flipper = new LettersFlipper();
	    System.out.println(flipper.reverseString(scanner.nextLine()));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}