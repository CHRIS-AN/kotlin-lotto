package lotto.utils

import lotto.utils.ErrorMessage.ERROR_NOT_NUMBERS
import java.lang.IllegalArgumentException

object Validator {
    fun checkNumber(input: String): Long {
        val regex = Regex("[1-9][0-9]*")
        if (!input.matches(regex)) {
            throw IllegalArgumentException(ERROR_NOT_NUMBERS)
        }

        return input.toLong()
    }
}