package u02

import org.junit.*
import org.junit.Assert.*

import u02.Shapes.Shape

class ShapesTest {
    val side: Int = 10
    val s: Shape = Shape.Square(side)
    val r: Shape = Shape.Rectangle(side, 20)
    val c: Shape = Shape.Circle(side)


    @Test def testPerimeter() =
        assertEquals(side * 4, Shape.perimeter(s), 1e-10)
        assertEquals(60, Shape.perimeter(r), 1e-10)
        assertEquals(side * 2 * scala.math.Pi, Shape.perimeter(c), 1e-10)
  

    @Test def testScale() =
        val s2: Shape = Shape.scale(s, 2)
        assertEquals(side * 8, Shape.perimeter(s2), 1e-10)
        val r2: Shape = Shape.scale(r, 2)
        assertEquals(120, Shape.perimeter(r2), 1e-10)
        val c2: Shape = Shape.scale(c, 2)
        assertEquals((side * 2) * 2 * scala.math.Pi, Shape.perimeter(c2), 1e-10)
}
