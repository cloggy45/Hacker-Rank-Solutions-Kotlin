package special.palindrome.again

class Kata {
    companion object {

        fun hasAllLettersIdentical(word: String): Boolean {
            return word.all { word.first() == it }
        }

        fun isTripleLetterPalindrome(word: String): Boolean =
            if (word.length == 3)
                (word.first() == word.last()) and (word.first() != word[1])
            else false


        fun isSpecialPalindrome(word: String): Boolean = when {
            hasAllLettersIdentical(word) -> true
            isTripleLetterPalindrome(word) -> true
            else -> false
        }


        fun substringCounter(lengthOfInput: Int, someInput: String): Long {
            var width = 1
            var counter = 0L
            while (width != lengthOfInput + 1) {
                for (startPoint in 0..lengthOfInput) {
                    if (isSpecialPalindrome(someInput.substring(startPoint, startPoint + width))) {
                        counter++
                    }
                    if (startPoint + width == lengthOfInput) {
                        width++
                        break
                    }

                }
            }
            return counter
        }
    }

}