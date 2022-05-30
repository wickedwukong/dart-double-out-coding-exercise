package dart

import kotlin.test.Test
import kotlin.test.assertEquals

class HelloCitiTest {
    @Test
    fun `should say Hello to Citi`() {
        assertEquals(HelloCiti.greeting(), "Hello Citi")
    }
}

