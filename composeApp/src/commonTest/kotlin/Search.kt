import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class GrepTest {


    companion object {
        val sampleData = listOf(
            "123 abc",
            "abc 123",
            "123 ABC",
            "ABC 123"
        )
    }


    @Test
    fun `should find match`() {
        val results = mutableListOf<String>()
        grep(sampleData, "[a-a]+") {
            results.add(it)
        }

        assertEquals(2, results.size)
        for (result in results) {
            assertContains(result, "abc")
        }
    }
}