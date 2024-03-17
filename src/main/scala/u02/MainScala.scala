package u02


object Shapes:

    enum Shape:
        case Rectangle(side1: Double, side2: Double)
        case Circle(radius: Double)
        case Square(side: Double)
  
    object Shape:

        def perimeter(s: Shape): Double = s match
            case Shape.Square(i) => i * 4
            case Shape.Rectangle(s1, s2) => s1 * 2 + s2 * 2
            case Shape.Circle(r) => 2 * r * scala.math.Pi

        def scale(s: Shape, a: Double): Shape = s match
            case Shape.Square(i) => Shape.Square(i * a)
            case Shape.Rectangle(s1, s2) => Shape.Rectangle(s1 * a, s2 * a)
            case Shape.Circle(r) => Shape.Circle(r * a)

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


    /*Exercise 4*/
    val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y == z
    val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z
    def p3(x: Int)(y: Int)(z: Int): Boolean = x <= y && y == z
    def p4(x: Int, y: Int, z: Int) : Boolean = x <= y && y == z

    /*println(p1(10)(10)(10))
    println(p2(10, 10, 20))*/
    /* println(p3(10)(10))
    println(p4(10, 10, 10))*/


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
    
    /*println(gcd(8, 12))
    println(gcd(11, 3))*/


    /*Exercise 7. Definition of object Shape and its methods at the top of this file.*/

    import u02.Shapes.Shape

    val side: Int = 10
    val s: Shape = Shape.Square(side)
    val r: Shape = Shape.Rectangle(side, 20)
    val c: Shape = Shape.Circle(side)

    val s2: Shape = Shape.scale(s, 2)
    val r2: Shape = Shape.scale(r, 2)
    val c2: Shape = Shape.scale(c, 2)
