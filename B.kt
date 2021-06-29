 
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*


    fun main(args: Array<String>) {
        val sc = FastScanner()
        var t = sc.nextInt()
        var ans: Boolean
        while (t-- > 0) {
            ans = false
            val n = sc.nextInt()
            val a = sc.readArray(n)
            for (i in 1 until n) {
                val diff = a[i] - a[i - 1]
                if (diff % 2 == 0) {
                    ans = true
                    break
                }
            }
            println(if (ans) "YES" else "NO")
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
