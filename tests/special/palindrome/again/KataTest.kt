package special.palindrome.again

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KataTest {
    @Test
    fun `Should return a count of five palindromic substrings`() {
        assertEquals(7, Kata.substringCounter(5, "asasd"))
    }

    @Test
    fun `Should return true if all characters are identical`() {
        assertEquals(true, Kata.hasAllLettersIdentical("aaa"))
    }

    @Test
    fun `Should return false if characters are not identical`() {
        assertEquals(false, Kata.hasAllLettersIdentical("aba"))
    }

    @Test
    fun `Should return true if a palindrome`() {
        assertEquals(true, Kata.isSpecialPalindrome("non"))
    }

    @Test
    fun `Should return false if not a valid palindrome`() {
        assertEquals(false, Kata.isSpecialPalindrome("nons"))
    }

    @Test
    fun `Should return a count of ten palindromic substrings`() {
        assertEquals(10, Kata.substringCounter(7, "abcbaba"))
    }

    @Test
    fun `Should return a count of another ten palindromic substrings`() {
        assertEquals(10, Kata.substringCounter(4, "aaaa"))
    }
}