val rockPlanets = arrayOf<String>("Mercury","Venus","Venus","Earth","Mars")
val gasPlanets = arrayOf("Jupinter","Satrurn","Uranus","Neptune")
val solarSystem = rockPlanets + gasPlanets
val newSolarSystem = arrayOf(
    "Mercury",
    "Venus",
    "easdjfl",
    "Mfgh",
    "sfghgs",
    "Mtyuyt",
    "Mxvnxv",
    "Pluto"
)
fun main() {
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "easdjfl" to 1,
        "Mfgh" to 2,
        "sfghgs" to 79,
        "Mtyuyt" to 82,
        "Mxvnxv" to 27,
        "Neptune" to 14)
    println(solarSystem.size)
    //println(solarSystem[2])
    //println(solarSystem.get(3))
    //println(solarSystem.indexOf("sfghgs"))
    //println(solarSystem.indexOf("Pluto"))
    //for (planet in solarSystem){
    //    println(planet)
   // }
    //solarSystem.add("Pluto")
    //solarSystem.add(3,"Theia")
    //solarSystem[3] = "Future Moon"
    //println(solarSystem[3])
    //println(solarSystem[9])
    //solarSystem.removeAt(9)
    println(solarSystem.contains("Pluto"))
    //println("Future Moon" in solarSystem)
    //println("Pluto" in solarSystem)
    //solarSystem.add("Pluto")
    println(solarSystem.size)
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
    solarSystem["Pluto"] = 5
    println(solarSystem.size)
    println(solarSystem.get("Theia"))
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
}

