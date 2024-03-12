import java.lang.ref.PhantomReference
import kotlin.math.sign
import kotlin.reflect.typeOf

//fun main(){
//    val friends = arrayOf("Ben", "Paul", "Ken", "Mary", "Susan")
//    myFriends()
//
//}
//
//fun myFriends(friendsArr: Array<String>){
//    println(friends.contentToString())
//    println(friends[2])
//
//
//
//}

fun main() {
    val friends: Array<String?> = arrayOf("Ben", "Paul", "Ken", "Mary", "Susan")
    println(friends.indexOf("Ken"))
    friends[3] = null

    val nums = arrayOf(1, 2, 3, 4, 5)
    val data = arrayOf("Kenya", 51000, true, 4.5, 7.2F, 479272917996719L)
//    doSomething(data)
    println(nums.contentToString())


    println(friends.get(3)) //GETTING THE INDEX OF AN ELEMENT IN AN ARRAY BY USING THE INDEX
    println(friends.slice(1..3))//GETTING THE RANGE

    friends.set(1, "Nancy")//REPLACING PAUL WITH NANCY
    friends[1] = "Nancy"
    println(friends.contentToString())

    var x: Int? = 5
    x = null

    //OR
    var y: Int? = null//FORCEFULLY CHANGING A VARIABLE TO ACCEPT BOTH NULL AND A THE DATA TYPE DESCRIBED
    y = 5


    //AN ARRAY OF ARRAYS
//    val nums4 = arrayOf((arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
//    println()

    //ADDING AN ELEMENT TO AN EXISTING ARRAY
    var friends1 = arrayOf("Ben", "Paul", "Ken", "Mary", "Susan")
    friends1 = friends1.plus("Natalie")
    println(friends1.contentToString())


    //ADDING ARRAYS TO AN ARRAY
    var friends2 = arrayOf("Ben", "Paul", "Ken", "Mary", "Susan")
    friends2 = friends2.plus(arrayOf("Natalie", "Gitahi", "Gatweri"))
    println(friends2.contentToString())


    //FINDING THE MAXIMUM VALUE
    val statistics = arrayOf(21, 14, 46, 18, 9, 32, 67, 88, 43)
    print(statistics.maxOrNull())
    println(statistics.minOrNull())//RETURNS THE MINIMUM VALUE OR NULL
    println(statistics.size)//RETURNS THE NUMBER OF ELEMENTS IN AN ELEMENT
    println(statistics.count())//REFERENCES THE PROPERTY
    println(statistics.average())//AVERAGE FUNCTION
    println(statistics.sum())//REFERENCES THE PROPERTY
    println(statistics.sum().toDouble() / statistics.size)


    //CREATING AN EMPTY ARRAY- SPECIFY THE SIZE AND PROVIDE PLACEHOLDER
    val mt = Array(5) { 0 }
    mt[0] = 5
    mt[1] = 6
    mt[2] = 6

    println(mt.contentToString())


    var country: Array<String?> = arrayOf("Kenya, Rwanda, Burundi")
    println(country.contentToString())
    country = country.plus("Tz")
    println(country.contentToString())

    country[0] = "Dubai"
    println(country.contentToString())


    //SORTING IN ALPHABETICAL ORDER
    var friends7 = arrayOf("Ben", "Ken", "Paul", "Meg", "Abraham")
    friends7. forEachIndexed { idx, f ->
        if (idx == 1 || idx == 2) {
            println(f)
        }
    }

    friends7 = friends7.sortedArray()
    println(friends7.contentToString())


    //LOOPING THROUGH ARRAYS
    friends7.forEach { f -> //BLOCK VAR - FOR EACH OF THE ELEMENT IN THE ARRAY PRINT THEM
        println(f)
    }

    statistics .forEach { stat->
        println(stat*stat)
    }

    for (f in friends){
        println(f)
    }

    for(stat in statistics){
        println(stat*stat)
    }

}







//
//fun doSomething(arr: Array<Any>): Array<String>{
//
//
//}



