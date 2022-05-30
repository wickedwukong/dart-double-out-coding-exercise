package dart

import org.junit.Test
import kotlin.test.assertEquals


class CitiDartTest {

    @Test
    fun `should give an impossible answer when the number is not achievable`() {
        val combination = CitiDart(161).combinations()
        assertEquals(combination, listOf(DartThrows()))
    }

    @Test
    fun `should give answers when the goal is 2`() {
        val combination = CitiDart(2).combinations()
        assertEquals(combination, listOf(DartThrows(listOf(DartThrow(1, Mutiplier.DOUBLE)))))
    }

    @Test
    fun `should give answers when the goal is 4`() {
        val combination = CitiDart(4).combinations()
        assertEquals(
            combination,
                listOf(
                    DartThrows(listOf(DartThrow(2, Mutiplier.DOUBLE))),
                    DartThrows(listOf(DartThrow(1, Mutiplier.DOUBLE), DartThrow(1, Mutiplier.DOUBLE)))
                )
        )
    }

//    @Test
//    fun `should give answers when the goal is 3`() {
//        val combination = CitiDart(3).combinations()
//        assertEquals(
//            combination, listOf(
//                listOf(
//                    DartThrows(1, Mutiplier.SINGLE),
//                    DartThrows(1, Mutiplier.DOUBLE)
//                )
//            )
//        )
//    }
}

data class DartThrows(val dartThrows: List<DartThrow> = emptyList())
data class DartThrow(val number: Int, val mutiplier: Mutiplier)
