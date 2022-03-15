import org.w3c.dom.ranges.Range
import java.security.KeyStore.TrustedCertificateEntry
import java.util.*

fun main(args: Array<String>) {

    /*
    // underscore in number
    var age:Byte = 30
    var height:Int = 170
    var distance:Short = 2000
    var balance:Long = 1000000000L

    println(age)
    println(height)
    println(distance)
    println(balance)

    // floating point number
    var value:Float = 98.98F
    var radius:Double = 2.345679E7

    println(value)
    println(radius)

    // literal
    var decimalLiteral: Int = 100
    var hexadecimal: Int = 0xFF
    var binaryLiteral: Int = 0b0001 // Hanya bisa bilangan biner yaitu 0 dan 1

    println(decimalLiteral)
//    println(hexadecimal + " " + binaryLiteral)
    println(hexadecimal)
    println(binaryLiteral)

    // underscore in number
    var age:Byte = 3_0
    var height: Int = 1_7_0 // Tidak bisa digunakan untuk dataType Double/ Float
    var distance: Short = 2_000
    var balance: Long = 100_000_0101L

    println(age)
    println(height)
    println(distance)
    println(balance)

    // Conversion
//    var number: Double = 12.0156
    print("Enter number in Double : ")
    val number = readLine()!!.toDouble() // Pake syntax ini masih bisa input menggunakan STRING dataType
//    val number = Integer.valueOf(readLine())

    var toInt: Int      = number.toInt()
//    var toByte: Byte    = number.toByte() // Tidak bisa convert from DOUBLE to BYTE, so DOUBLE -> INT -> BYTE
    var toByte: Byte    = number.toInt().toByte()
//    var toShort: Short  = number.toShort() // Tidak bisa conver from DOUBLE to SHORT, so DOUBLE -> INT -> SHORT
    var toShort: Short  = number.toInt().toShort()
    var toFloat : Float = number.toDouble().toFloat()

    println("Double to Int = $toInt")
    println("Double to Byte = $toByte")
    println("Double to Short = $toShort")
    println("Double to Float = $toFloat")

    // Number overflow
    var number: Long    = 9_000_000_000L
    var toInt: Int      = number.toInt()

    println("Long to Int = $toInt")

//    var a: Int   = 0_111 // Tidak bisa assign value seperti ini

    // create an object for scanner class
    val number1 = Scanner(System.`in`)
//    print("Enter an integer: ")
    // nextInt() method is used to take next integer value and store in enteredNumber1 variable
//    var enteredNumber1:Int = number1.nextInt()
//    println("You entered: $enteredNumber1")

    val number2 = Scanner(System.`in`)
//    print("Enter a float value: ")
    // nextFloat() method is used to take next Float value and store in enteredNumber2 variable
//    var enteredNumber2:Float = number2.nextFloat()
//    println("You entered: $enteredNumber2")

    val booleanValue = Scanner(System.`in`)
    print("Enter a boolean: ")
    // nextBoolean() method is used to take next boolean value and store in enteredBoolean variable
    var enteredBoolean:Boolean = booleanValue.nextBoolean() // True/ False
    println("You entered: $enteredBoolean")

    // Character
    var a: Char     = 'A'
    var z: Char     = 'Z'
    var zz: Char     = '1'

    print(a)
    print(z)
    print(zz)

    // Boolean
    var bln: Boolean    = true
    println(bln)
    println(!bln)

    var firstName: String   = "Afwan"
    var lastName: String    = "Zikri"
    var fullName: String    = "Afwan Zikri"
//    var fullName2: String   = firstName + " " + lastName // for better should use template like example below
    var fullName2: String   = "$firstName  $lastName"
    var address: String     = """
        Apt Amethyst Tower ANT 7/25 RT 018/ RW 002
        Gunung Sahari Utara, Kec. Sawah Besar, Jakarta Pusat 10710
    """.trimIndent()

    var address2: String    = """
        >Perumnas Kampung Ladang, Belakang RS Paru-Paru Sumatera Barat
        >Lubuk Alung, Kabupaten Padang Pariman, Sumatera Barat
    """.trimMargin(">")

    var address3: String    = """
        |Jorong Tabu Baraie, Kabupaten Tanah Datar
        |Sumatera Barat
    """.trimMargin()

    println("FirstName = ${firstName}")
    println("LastName = ${lastName}")
    println("FullName = ${fullName}")
    println(message = "FullName-2 = ${fullName2}")
    println("Address-1 = $address")
    println("Address-2 = $address2")
    println("Address-3 = $address3") // Shortcut CoPas line is cmd + D

    var number: Array<Int> = arrayOf(1,2,3,4,5,6,7)
    var sentence: Array<String> = arrayOf("aku", "adalah", "seorang", "Programmer")

    println(number)
    println("isi indeks ke-3 arrayOfNumber = ${number[3]}")
//    println("isi indeks ke-2 arrayOfSentence = ${sentence[4]}") // Index 4 out of bounds for length 4
    println("isi indeks ke-2 arrayOfSentence = ${sentence[3]}")
    println("Size array of number is : ${number.size}") // how size array of number
    println("Size array of sentence is : ${sentence.size}") // how size array of sentence
    println(sentence.get(0))
    sentence.set(0, "Awak") // Manipulate Array of Sentence[0] from "aku" menjadi "Awak"
    println(sentence.get(0))
    println(sentence.get(0).equals("Awak"))

    var sentence: Array<String?> = arrayOfNulls(5)
//    var sentence: Array<String?> = emptyArray()
    sentence[0] = 123.toString()
    sentence[1] = "Aden"
    sentence[4] = "isi"

    println(sentence[0])
    println(sentence[1])
    println(sentence[2])
    println(sentence[4])
     */

    val range: IntRange = 1..100
//    val range1 = 1..99
//    val range1 = 1..99 step 3
    val range1 = 99 downTo 1 step 2

    println(range)
    println(range1)
    println(range1.count()) // Menghitung jumlah data range
    println(range1.first) // get angka awal "range"
    println(range1.last) // get angka terakhir "range"
//    println(range1.start) // get angka awal/ start "range", dimulai dari angka terkecil ke besar >< tidak bisa kebalikannya
    println(range1.step) // kenaikan angka pada "range"
    println(range1.contains(98)) // membandingkan angka yg didalam () dengan angka pada "range"
//    println(range1.random()) // get angka random dari angka "range", dimulai dari angka terkecil ke besar >< tidak bisa kebalikannya

}