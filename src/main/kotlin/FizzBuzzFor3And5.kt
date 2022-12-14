import org.junit.Assert.assertEquals
import org.junit.Test

// return list of strings of digits from 0 to n, where divisible by 3 are 'Fizz', divisible by 5 are 'Buzz' and divisible by the both are 'FizzBuzz'
class FizzBuzzFor3And5 {
    fun parse(n: Int): List<String> {
        val list = mutableListOf<String>()
        (1..n).forEach {
            when {
                it % 3 == 0 && it % 5 == 0 -> list.add("FizzBuzz")
                it % 3 == 0 -> list.add("Fizz")
                it % 5 == 0 -> list.add("Buzz")
                else -> list.add(it.toString())
            }
        }
        return list
    }
}

class FizzBuzzFor3And5Test {
    @Test
    fun with5() {
        val cls = FizzBuzzFor3And5()
        assertEquals(listOf("1", "2", "Fizz", "4", "Buzz"), cls.parse(5))
    }

    @Test
    fun with16() {
        val cls = FizzBuzzFor3And5()
        assertEquals(
            listOf(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz",
                "16"
            ), cls.parse(16)
        )
    }
}