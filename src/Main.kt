fun main() {

    /*********************************** Creating A Map ****************************************/
    /*creating a map using various methods
    a map can be created as mutable or immutable using various functions
            immutable maps are readOnly while mutable maps support much more operations

    using the MapOf() will create a map that is read only
    you cannot alter the immutable map*/

    val immutableMap = mapOf(
        Pair(1, 34),
        Pair(2, 34),
        Pair(34, 56),
        43 to 34
    )
//.entries() reads the pair
    println(immutableMap.entries)


// size() gives the size of the map same as the count()
    println(immutableMap.count())
    println(immutableMap.size)

    //creating a mutable map using mutableMapOf()

    val mutableMap1 = mutableMapOf(
        Pair("Developer", "No Sleep"),
        Pair("Manchester", "No trophy"),

        )
    val mutableMap2 = mutableMapOf(
        Pair(3, "No Sleep"),
        Pair(2, "No trophy"),
    )

    /*We can also create mutable maps using the HashMap
     function however this is a java class not a kotlin one*/

    val hashMap = HashMap<Int, String>()

    hashMap[1] = "Ronaldo"
    hashMap[2] = "Messi"
    hashMap[3] = "Drogba"
    hashMap[4] = "Benzema"

    println(hashMap.entries)



    val sortedMap = sortedMapOf(
        3 to "Felix",
        1 to "hassan",
        10 to "Osman",
        21 to "Egypt",
        12 to "Kenya"

    )

    println(sortedMap)


/*********************************************** Iteration on maps ********************************************/

    /* we now do more complex operations on maps
    * Lets iterate through each element on the map
    * using the iterator function*/


    /* Here we want to print the keys you can also print the values*/
   sortedMap.iterator().forEach {

       println(it.key)
   }

    //You can also use a for loop to iterate through the map
    for ((key,value) in sortedMap){
        println("key: $key value => $value")
    }
    // or you can iterate using the forEach{} lambda

    sortedMap.forEach{ (key,value) ->
        println("key => $key, value => $value")

    }

    /********************** further operations on maps ********************************/

    // checking if a map contains a specific key
    /* we use containsKey() method it returns a boolean true or false*/

    println(sortedMap.containsKey(23))

    /* we use containsValue() method  to check if the map contains a certain value t returns a boolean true or false*/

    println(sortedMap.containsValue("hassan"))

    /* we use isEmpty method  to check if the map is empty it is returns a boolean */
    println(sortedMap.isEmpty())

    /*    with mutable maps we can do a number of operations on them,
        we can add them together using the + and plus() operations*/

    val newMap = mutableMap2 + mutableMap1
    val addedMap = mutableMap2.plus(mutableMap1)

    println(newMap.entries)
    println(addedMap.entries)

    /*    we can sort maps using the toSortedMap() function
                or we can use the sortedMapOf() function*/

    println(mutableMap2.toSortedMap())

    /* we can also remove entries from a map using remove() or minus()  or - operators*/

    sortedMap.remove(3) //this affects the original map
    sortedMap- listOf(1)
    sortedMap.minus(12) //this does not affect the original map

    println(sortedMap.entries)



}