package collections

fun main(args: Array<String>) {
    val namesToAges = mapOf(Pair("Peter", 24), Pair("Roger", 47))
    val namesToAges2 = mapOf(
            "Peter" to 24,
            "Roger" to 47
    )

    println(namesToAges2)
    println(namesToAges == namesToAges2)

    println()
    println()
    println(namesToAges2.keys)
    println(namesToAges2.values)


    val countryToInhab = mutableMapOf(
            "Germany" to 80_000_000,
            "USA" to 350_000_000
    )
    countryToInhab.put("Australia", 23_000_000)
    countryToInhab.putIfAbsent("USA", 300)

    println(countryToInhab.containsKey("Germany"))
    println(countryToInhab.containsValue(20))

    println(countryToInhab.get("Germany"))
    println(countryToInhab.getOrDefault("France", 0))

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old")
    }
}