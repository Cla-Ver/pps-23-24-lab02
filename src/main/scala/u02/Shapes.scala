package u02

//import scala.math.Pi

object Shapes {

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

        
    

}
