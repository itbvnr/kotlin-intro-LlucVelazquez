fun main() {
    val x: Int
    println("Escriu quin exercici vols: ")
    x = readLine()!!.toInt()
    when (x) {
        1 -> println(HowBigIsMyPizza())
        2 -> println(AirVolumeCalculator())
        3 -> println(IsLegalAge())
        4 -> IsGreater()
        else -> println("no hi ha exercici")
    }
}
fun HowBigIsMyPizza(): Double {
    val diametre: Double
    val result: Double
    println("Quin diametre te?: ")
    diametre = readln().toDouble()
    result = Math.PI*((diametre/2)*(diametre/2))
    return result
}
fun AirVolumeCalculator(): Int {
    println("Posa les dimensions de l'habitacio per separat")
    val b = readln().toInt()
    val h = readln().toInt()
    val a = readln().toInt()
    return b*h*a
}
fun IsLegalAge(): Boolean {
    println("Posa la teva edat")
    val age = readln().toInt()
    if(age >= 18){
        return true
    } else { return false }
}
fun IsGreater() {
    println("Posa dos numeros enters")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    if (num1 > num2){println("El numero 1 es mes gran") }
    else if (num1 == num2){ println("Els numeros son iguals") }
    else {println("El numero 2 es mes gran")}
}