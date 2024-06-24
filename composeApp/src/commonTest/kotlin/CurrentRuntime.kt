import kotlin.test.Test
import kotlin.test.assertEquals


class TestCurrentRuntime {


    @Test
    fun `should display details`() {

        val runtime = CurrentRuntime("MyRuntime", "1.1")
        assertEquals("MyRuntime version 1.1", runtime.toString())
    }


    @Test
    fun `should handle when null version `() {
        val runtime = CurrentRuntime("MyRuntime", null)
        assertEquals("MyRuntime version unknown", runtime.toString())

    }


    @Test
    fun ` should parse number from version string `() {
        val runtime = CurrentRuntime("MyRuntime", "1.2 Alpha Experimental")
        assertEquals("MyRuntime version 1.2", runtime.toString())

    }

    @Test
    fun shouldHandleMissingVersion() {
        val runtime = CurrentRuntime("MyRuntime", "Alpha Experimental")
        assertEquals("MyRuntime version unknown", runtime.toString())
    }

}