
package com.roytuts.kotlin.validate.email.regex
class EmailValidator {

    companion object {
        @JvmStatic
        val EMAIL_REGEX = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})";
        fun isEmailValid(email: String): Boolean {
            return EMAIL_REGEX.toRegex().matches(email);
        }
    }
}