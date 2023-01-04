package com.klimovich.Anagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LettersFlipperTest {

    private LettersFlipper lettersFlipper = new LettersFlipper();

    @Test
    void reverseString_shouldThrowIllegalArgumentException_whenInputStringIsNull() {
	IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class,
		() -> lettersFlipper.reverseString(null));
	Assertions.assertEquals("The argument cannot be null", thrown.getMessage());
    }

    @Test
    void reverseString_shouldReturnEmptyString_whenInputStringIsEmpty() {
	Assertions.assertEquals("", lettersFlipper.reverseString(""));
    }

    @Test
    void reverseString_shouldReturnStringConsistOfTabs_whenInputStringIsTabs() {
	Assertions.assertEquals("\t*", lettersFlipper.reverseString("\t*"));
    }

    @Test
    void reverseString_shouldReturnStringConsistOfTabsAndSpace_whenInputStringIsTabsAndSpace() {
	Assertions.assertEquals(" \t*", lettersFlipper.reverseString(" \t*"));
    }

    @Test
    void reverseString_shouldReturnStringConsistOnlyOneSpace_whenInputStringIsSpaceOrSeveralSpaces() {
	Assertions.assertEquals(" *", lettersFlipper.reverseString(" *"));
    }

    @Test
    void reverseString_shouldReturnStringofOneChar_whenInputStringIsSingleChar() {
	Assertions.assertEquals("?", lettersFlipper.reverseString("?"));
    }

    @Test
    void reverseString_shouldReturnStringOfChars_whenInputStringIsOnlyChars() {
	Assertions.assertEquals("!?", lettersFlipper.reverseString("!?"));
    }

    @Test
    void reverseString_shouldReturnStringOfNumbers_whenInputStringIsOnlyNumbers() {
	Assertions.assertEquals("12345", lettersFlipper.reverseString("12345"));
    }

    @Test
    void reverseString_shouldReturnStringOfNumbersAndChars_whenInputStringIsNumbersAndChars() {
	Assertions.assertEquals("12!345", lettersFlipper.reverseString("12!345"));
    }

    @Test
    void reverseString_shouldReverseString_whenInputStringIsOnlyLetters() {
	Assertions.assertEquals("qwerty", lettersFlipper.reverseString("ytrewq"));
    }

    @Test
    void reverseString_shouldReverseString_whenInputStringIsOnlyLettersInUpperAndLowCase() {
	Assertions.assertEquals("QweRty", lettersFlipper.reverseString("ytRewQ"));
    }

    @Test
    void reverseString_shouldReverseString_whenInputStringOfLettersStartAndFinishBySpace() {
	Assertions.assertEquals(" qwerty ", lettersFlipper.reverseString(" ytrewq "));
    }

    @Test
    void reverseString_shouldReverseString_whenInputStringOfLettersAndContainsTrailingSpace() {
	Assertions.assertEquals("qwerty ", lettersFlipper.reverseString("ytrewq "));
    }

    @Test
    void reverseString_shouldReverseOnlyLettersInString_whenInputStringConteinsLettersAndNumbers() {
	Assertions.assertEquals("cfg5rty", lettersFlipper.reverseString("ytr5gfc"));
    }

    @Test
    void reverseString_shouldReverseOnlyLettersInString_whenInputStringConteinsLettersNumbersChars() {
	Assertions.assertEquals("cfg5!rty", lettersFlipper.reverseString("ytr5!gfc"));
    }

    @Test
    void reverseString_shouldReverseOnlyLettersOnlyInWord_whenInputStringConteinsMoreThanOneWord() {
	Assertions.assertEquals("cfg5!rty cfg3?rty", lettersFlipper.reverseString("ytr5!gfc ytr3?gfc"));
    }

    @Test
    void reverseString_shouldReverseOnlyLettersOnlyInWordAndSaveSpacesBeforeAndAfter_whenInputStringConteinsMoreThanOneWordAndStartAndFinishBySpace() {
	Assertions.assertEquals(" cfg5!rty cfg3?rty ", lettersFlipper.reverseString(" ytr5!gfc ytr3?gfc "));
    }

}
