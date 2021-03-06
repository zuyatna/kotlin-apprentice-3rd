sealed class AcceptedCurrency {
    abstract val valueInDollars: Float
    var amount = 0.0f

    class Dollar: AcceptedCurrency() {
        override val valueInDollars: Float
            get() = 1.0f
    }

    class Euro: AcceptedCurrency() {
        override val valueInDollars: Float
            get() = 1.25f
    }

    class Crypto: AcceptedCurrency() {
        override val valueInDollars: Float
            get() = 2534.92f
    }

    val name: String
        get() = when (this) {
            is Euro -> "Euro"
            is Dollar -> "Dollar"
            is Crypto -> "NerdCoin"
        }

    fun totalValueInDollars(): Float {
        return amount * valueInDollars
    }

    companion object {
        var totalFundsInDollars = 0.0f

        fun checkSufficientFunds(
            fundsAvailable: List<AcceptedCurrency>,
            purchasePriceInDollars: Float
        ): Boolean {
            totalFundsInDollars = fundsAvailable.fold(0.0f) { accumulator, currency ->
                accumulator + currency.valueInDollars
            }
            return totalFundsInDollars >= purchasePriceInDollars
        }
    }

    operator fun plus(otherFunds: AcceptedCurrency): AcceptedCurrency {
        return if (this::class == otherFunds::class) {
            // if both currency was the same type
            this.amount += otherFunds.amount
            this
        } else {
            // if both currency was different types
            // NOTE: There are other ways to think about this, but this is probably the most straightforward one.
            val dollars = Dollar()
            dollars.amount = this.valueInDollars + otherFunds.valueInDollars
            dollars
        }
    }
}
