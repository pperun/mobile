package HW14

import junit.framework.TestCase
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter


class FileUtilityTest : TestCase() {
    val testFileDirectory = "src\\test\\resources\\"
    val testFileName = "test.txt"

    override fun setUp() {
        super.setUp()
        if(File(testFileDirectory + testFileName).createNewFile())
            println("file created")
        else
            println("file not created")
        BufferedWriter(FileWriter(File(testFileDirectory +testFileName))).use {
            it.write("void\tclose()\n" +
                    "Closes the stream, flushing it first.\n" +
                    "void\tflush()\n" +
                    "Flushes the stream.\n" +
                    "void\tnewLine()\n" +
                    "Writes a line separator.\n" +
                    "void\twrite(char[] cbuf, int off, int len)\n" +
                    "Writes a portion of an array of characters.\n" +
                    "void\twrite(int c)\n" +
                    "Writes a single character.\n" +
                    "void\twrite(String s, int off, int len)\n" +
                    "Writes a portion of a String.")
        }
    }

    fun testReplaceString() {
        try {
            FileUtility
                .replaceString(
                    File(testFileDirectory + testFileName),
                    3,
                    "0000000000000"
                )
            assertEquals("0000000000000", File(testFileDirectory + testFileName).readLines()[3])
        }
        catch (e:Exception) {
            e.printStackTrace()
        }

    }

    fun testCopyIntoBak() {
        try {
            val testFile = File(testFileDirectory + testFileName)
            FileUtility.copyIntoBak(testFile)
            assertEquals(testFile.readLines(), File(testFileDirectory + "test.bak").readLines())
        }
        catch(e:Exception) {
            e.printStackTrace()
        }

    }

    fun testFormFileFromOddLines() {
        try {
            val expected = listOf("void\tclose()",
                    "void\tflush()",
                    "void\tnewLine()",
                    "void\twrite(char[] cbuf, int off, int len)",
                    "void\twrite(int c)",
                    "void\twrite(String s, int off, int len)")
            FileUtility.formFileFormOddLines(File(testFileDirectory + testFileName))
            assertEquals(expected, File(testFileDirectory + "test_odd.txt").readLines())
        }
        catch (e:Exception) {
            e.printStackTrace()
        }
    }

    fun testFormFileFromEvenLines() {
        try {
            val expected = listOf("Closes the stream, flushing it first.",
                    "Flushes the stream.",
                    "Writes a line separator.",
                    "Writes a portion of an array of characters.",
                    "Writes a single character.",
                    "Writes a portion of a String.")
            FileUtility.formFileFromEvenLines(File(testFileDirectory + testFileName))
            assertEquals(expected, File(testFileDirectory + "test_even.txt").readLines())
        }
        catch (e:Exception) {
            e.printStackTrace()
        }
    }

    fun testCodec() {
        try {
            val testFile = File(testFileDirectory + testFileName)
            val expected = testFile.readLines()
            FileUtility.encodeFile(testFile, 12)
            FileUtility.decodeFile(testFile, 12)
            assertEquals(expected, testFile.readLines())
        }
        catch (e:Exception) {
            e.printStackTrace()
        }
    }


}