 
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*


    fun main(args: Array<String>) {
        val sc = FastScanner()
        var t = sc.nextInt()
        while (t-- > 0) {
            val n = sc.nextInt()
            val k = sc.nextInt()
            var ans = 0
            for (i in 0 until n) {
                val start = sc.nextInt()
                val end = sc.nextInt()
                if (k >= start) ans = Math.max(ans, end - k + 1)
            }
            println(ans)
        }
    }

    internal class FastScanner {
        var br = BufferedReader(InputStreamReader(System.`in`))
        var st = StringTokenizer("")
        operator fun next(): String {
            while (!st.hasMoreTokens()) try {
                st = StringTokenizer(br.readLine())
            } catch (e: IOException) {
                e.printStackTrace()
            }
            return st.nextToken()
        }

        fun nextInt(): Int {
            return next().toInt()
        }

        fun readArray(n: Int): IntArray {
            val a = IntArray(n)
            for (i in 0 until n) a[i] = nextInt()
            return a
        }

        fun nextLong(): Long {
            return next().toLong()
        }
    }
