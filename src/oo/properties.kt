package oo

class City {
    var name: String = ""
    var population: Int = 0

}

fun main(args: Array<String>) {
    val city = City()
    city.name = "Surat"
    city.population = 600000

    println(city)
    println(city.name)
    println(city.population)
}
