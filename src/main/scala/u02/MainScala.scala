package u02

object MainScala extends App:
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
    val negativeIntGenericTest = genericNeg(positiveIntTest)
    println(negativeIntGenericTest(-1))
    val notEmptyStringGenericTest = genericNeg(empty)
    println(notEmptyStringGenericTest("Hello"))
