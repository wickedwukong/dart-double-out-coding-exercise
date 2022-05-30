package dart

class CitiDart(private val goal: Int) {
    fun combinations(): List<DartThrows> {
        return if (20 * 3 + 20 * 3 + 20 *2 < goal)
            listOf(DartThrows())
        else
            listOf(DartThrows(listOf(DartThrow(1, Mutiplier.DOUBLE))))
    }
}

data class DartThrows(val dartThrows: List<DartThrow> = emptyList())
data class DartThrow(val number: Int, val mutiplier: Mutiplier)
