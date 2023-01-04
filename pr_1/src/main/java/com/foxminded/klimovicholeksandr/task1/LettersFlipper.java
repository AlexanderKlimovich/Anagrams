package com.foxminded.klimovicholeksandr.task1;

import java.util.StringJoiner;

public class LettersFlipper {

    public String reverseString(String inputString) {
	if (inputString == null) {
	    throw new IllegalArgumentException("The argument cannot be null");
	}
	StringJoiner resultString = new StringJoiner(" ");
	for (String word : inputString.split("\\s", inputString.length())) {
	    resultString.add(reverseWord(word));
	}
	String resultOnlyWithSpaces = resultString.toString();
	return replaceSpaces(inputString, resultOnlyWithSpaces);
    }

    private String reverseWord(String inputString) {
	char[] letters = inputString.toCharArray();
	for (int i = 0, j = letters.length - 1; i < j;) {
	    if (!Character.isLetter(letters[i])) {
		i++;
	    } else if (!Character.isLetter(letters[j])) {
		j--;
	    } else {
		char item = letters[i];
		letters[i] = letters[j];
		letters[j] = item;
		i++;
		j--;
	    }
	}
	return new String(letters);
    }

    private String replaceSpaces(String inputString, String resultOnlyWithSpaces) {
	char[] reversedString = resultOnlyWithSpaces.toCharArray();
	char[] letters = inputString.toCharArray();
	for (int i = 0; i < inputString.length(); i++) {
	    if (Character.isWhitespace(letters[i])) {
		reversedString[i] = letters[i];
	    }
	}
	return new String(reversedString);
    }

}
