package example.junit4

class Validation {
    private val Email_Pattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    fun email(email: String): Boolean {
        if (email.matches(Email_Pattern.toRegex()))
            return true
        return false
    }
}