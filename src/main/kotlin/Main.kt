fun main() {
    val amount = 10_000
    val commission = amount / 100 * 0.75
    val result = if (commission > 35) commission else 35
}