import kotlin.test.Test
import kotlin.test.assertEquals


class IOSRuntimeTest {


    @Test
    fun `should detect os `() {

        val runtime = determineCurrentRuntime()
        assertEquals(runtime.name, "ios")
        assertEquals(runtime.version, "unknown")
    }
}