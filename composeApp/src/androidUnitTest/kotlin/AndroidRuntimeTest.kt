import org.junit.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals


class AndroidRuntimeTest {


    @Test
    fun ` should detect android`() {
        val runtime = determineCurrentRuntime()
        assertContains(runtime.name, "OpenJDK")
        assertEquals(runtime.version, "17.0")
    }
}