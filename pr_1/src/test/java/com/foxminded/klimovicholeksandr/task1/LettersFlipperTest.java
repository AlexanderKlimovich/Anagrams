package com.foxminded.klimovicholeksandr.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LettersFlipperTest {

    private LettersFlipper lettersFlipper = new LettersFlipper();

    @Test
    void reverseString_ShouldThrowIllegalArgumentException_WhenInputStringIsNull() {
	IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class,
		() -> lettersFlipper.reverseString(null));
	Assertions.assertEquals("The argument cannot be null", thrown.getMessage());
    }

    @Test
    void reverseString_ShouldReturnEmptyString_WhenInputStringIsEmpty() {
	Assertions.assertEquals("", lettersFlipper.reverseString(""));
    }

    @Test
    void reverseString_ShouldReturnStringConsistOfTabs_WhenInputStringIsTabs() {
	Assertions.assertEquals("\t*", lettersFlipper.reverseString("\t*"));
    }

    @Test
    void reverseString_ShouldReturnStringConsistOfTabsAndSpace_WhenInputStringIsTabsAndSpace() {
	Assertions.assertEquals(" \t*", lettersFlipper.reverseString(" \t*"));
    }

    @Test
    void reverseString_ShouldReturnStringConsistOnlyOneSpace_WhenInputStringIsSpaceOrSeveralSpaces() {
	Assertions.assertEquals(" *", lettersFlipper.reverseString(" *"));
    }

    @Test
    void reverseString_ShouldReturnStringofOneChar_WhenInputStringIsSingleChar() {
	Assertions.assertEquals("?", lettersFlipper.reverseString("?"));
    }

    @Test
    void reverseString_ShouldReturnStringOfChars_WhenInputStringIsOnlyChars() {
	Assertions.assertEquals("!?", lettersFlipper.reverseString("!?"));
    }

    @Test
    void reverseString_ShouldReturnStringOfNumbers_WhenInputStringIsOnlyNumbers() {
	Assertions.assertEquals("12345", lettersFlipper.reverseString("12345"));
    }

    @Test
    void reverseString_ShouldReturnStringOfNumbersAndChars_WhenInputStringIsNumbersAndChars() {
	Assertions.assertEquals("12!345", lettersFlipper.reverseString("12!345"));
    }

    @Test
    void reverseString_ShouldReverseString_WhenInputStringIsOnlyLetters() {
	Assertions.assertEquals("qwerty", lettersFlipper.reverseString("ytrewq"));
    }

    @Test
    void reverseString_ShouldReverseString_WhenInputStringIsOnlyLettersInUpperAndLowCase() {
	Assertions.assertEquals("QweRty", lettersFlipper.reverseString("ytRewQ"));
    }

    @Test
    void reverseString_ShouldReverseString_WhenInputStringOfLettersStartAndFinishBySpace() {
	Assertions.assertEquals(" qwerty ", lettersFlipper.reverseString(" ytrewq "));
    }

    @Test
    void reverseString_ShouldReverseString_WhenInputStringOfLettersAndContainsTrailingSpace() {
	Assertions.assertEquals("qwerty ", lettersFlipper.reverseString("ytrewq "));
    }

    @Test
    void reverseString_ShouldReverseOnlyLettersInString_WhenInputStringConteinsLettersAndNumbers() {
	Assertions.assertEquals("cfg5rty", lettersFlipper.reverseString("ytr5gfc"));
    }

    @Test
    void reverseString_ShouldReverseOnlyLettersInString_WhenInputStringConteinsLettersNumbersChars() {
	Assertions.assertEquals("cfg5!rty", lettersFlipper.reverseString("ytr5!gfc"));
    }

    @Test
    void reverseString_ShouldReverseOnlyLettersOnlyInWord_WhenInputStringConteinsMoreThanOneWord() {
	Assertions.assertEquals("cfg5!rty cfg3?rty", lettersFlipper.reverseString("ytr5!gfc ytr3?gfc"));
    }

    @Test
    void reverseString_ShouldReverseOnlyLettersOnlyInWordAndSaveSpacesBeforeAndAfter_WhenInputStringConteinsMoreThanOneWordAndStartAndFinishBySpace() {
	Assertions.assertEquals(" cfg5!rty cfg3?rty ", lettersFlipper.reverseString(" ytr5!gfc ytr3?gfc "));
    }

}
