package HW12

import junit.framework.TestCase

class StringUtilityTest : TestCase() {

    fun testWordCount() {
        assertEquals(36, StringUtility.wordsCount(
            "There is no need to expect me to return the wrong value." +
                    "I'm a machine that is capable of destroying humanity." +
                    "I am able to count 2 + 2 properly. " +
                    "I can even swear, look, %&^%@&%, ^*!(@^(!**@& \$%\$26146"
        ))
    }

    fun testNumbersCount() {
        assertEquals(1, StringUtility.numbersCount("1,222"))
        assertEquals(4, StringUtility.numbersCount(" This text should return 4 as a result. Obviously 2+2=4"))
        assertEquals(2, StringUtility.numbersCount("3^4 equals 81"))
    }

    fun testTrimPunctuation() {
        assertEquals("abcdefg", StringUtility.trimPunctuation("a21%^$ , bcd////e. f123g. 12,222!"))
        assertEquals("HelloWorld", StringUtility.trimPunctuation("Hello, World!"))
    }

    fun testRemoveMultipleSpaces() {
        assertEquals("Hello world!", StringUtility.removeMultipleSpaces("Hello    world!"))
        assertEquals(
            "Me without any multiple spaces",
            StringUtility.removeMultipleSpaces("Me  without any     multiple spaces")
        )
    }

    fun testUpperCaseWords() {
        assertEquals("There I'm Destroying I I A^*!(@^(!**@& A%$26146 ME", StringUtility.upperCaseWords(
            "There is no need to expect me to return the wrong value. " +
                "I'm a machine that is capable of Destroying humanity. " +
                    "I am able to count 2 + 2 properly. " +
                    "I can even swear, look, %&^%@&%, A^*!(@^(!**@& A%$26146 ME"
        ))
    }
}