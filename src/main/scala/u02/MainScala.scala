package u02

object MainScala extends App:
    /*Exercise 3*/
    def positiveMethod(x: Int): String = x match
        case x if x >= 0 => "positive"
        case _ => "negative"
    
    val positiveLambda: Int => String = n => n match
        case n if n >= 0 => "positive"
        case _ => "negative"
    
    val empty: String => Boolean = _ == ""
    val neg: (String => Boolean) => (String => Boolean) = f => (i => !f(i))
    def emptyDef(s: String): Boolean = s match
        case s if s == "" => true
        case _ => false
    def negDef(f: String => Boolean): String => Boolean = i => f(i) match
        case true => false
        case false => true
    
    def genericNeg[X](f: X => Boolean): X => Boolean = i => f(i) match
        case true => false
        case false => true

    def positiveIntTest(x: Int): Boolean = x > 0

    /*Exercise 4*/
    val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y == z
    val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z
    def p3(x: Int)(y: Int)(z: Int): Boolean = x <= y && y == z
    def p4(x: Int, y: Int, z: Int) : Boolean = x <= y && y == z

    /*Exercise 5*/

    def compose[A](f: A => A, g: A => A): A => A = i => f(g(i))
    val inc: (i: Int) => Int = i => i + 5
    val append: (s: String) => String = s => s concat "."

    /*val funComposition1 = compose(append, append)
    val funComposition2 = compose(inc, inc)
    println(funComposition1("10"))
    println(funComposition2(10))*/


    /*Exercise 6*/

    def gcd(a: Int, b: Int): Int = a match
        case a if a == 0 => b
        case a if b == 0 => a
        case _ => gcd(b, a % b)

    /*Exercise 7 in Shapes.scala, ShapesTest.scala*/
    
    /*println(gcd(8, 12))
    println(gcd(11, 3))*/

    /*println(positiveMethod(1))
    println(positiveLambda(-11))*/
    /*val notEmpty = neg(empty)
    println(notEmpty("ciao"))
    val notEmptyDef = negDef(emptyDef)
    println(notEmptyDef(""))*/
    /*val negativeIntGenericTest = genericNeg(positiveIntTest)
    println(negativeIntGenericTest(-1))
    val notEmptyStringGenericTest = genericNeg(empty)
    println(notEmptyStringGenericTest("Hello"))*/
    /*println(p1(10)(10)(10))
    println(p2(10, 10, 20))*/
    /* println(p3(10)(10))
    println(p4(10, 10, 10))*/
