

fun main() {
    val car1 = Car("Tesla","S Plaid","Blue",4)


    println("Name = ${car1.name}")
    println("Name = ${car1.model}")
    println("Name = ${car1.color}")
    println("Name = ${car1.doors}")

    car1.move()
    car1.stop()



    val car2 = Car("Ford","S-20","Red",5)


    println("\n")

    println("Name = ${car2.name}")
    println("Name = ${car2.model}")
    println("Name = ${car2.color}")
    println("Name = ${car2.doors}")

    car2.move()
    car2.stop()
}

class Car(var name: String, var model: String, var color: String, var doors: Int) {
    fun move(){
        println("The car $name is moving")
    }
    fun stop(){
        println("The car $name has stopped")
    }
}