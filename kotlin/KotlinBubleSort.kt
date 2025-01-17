fun sort(arr: Array<Int>): Array<Int> {
    for (current in 0 until arr.size) {
        for (next in (current + 1) until arr.size) {
            if (arr[current] > arr[next]) {
                val temp = arr[current]
                arr[current] = arr[next]
                arr[next] = temp
            }
        }
    }

    return arr
}

fun main() {
    val testCase = arrayOf(5, 3, 4, 2, 1, 10, 9)
    sort(testCase).forEach {
        print("$it ")
    }
}