package joelabs.nashorn

import org.mockito.Mockito._
import org.scalatest._
import org.scalatest.mock.MockitoSugar

import scala.collection.mutable.Stack

class ScalaTest extends FlatSpec with Matchers with MockitoSugar {
  val banan: Banan = mock[Banan]("banan")
  val kaka: Kaka = new Kaka(banan)

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be(2)
    stack.pop() should be(1)
    stack.size should be(0)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[Int]
    a[NoSuchElementException] should be thrownBy {
      emptyStack.pop()
    }
  }

  it should "return top element but not be modified when peeking at the top" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)

    stack.top should be(2)
    stack.size should be(2)
  }

  "A cake" should "mash the banana" in {
    kaka.smäll()
    verify(banan).mosa()
    verifyNoMoreInteractions(banan)
  }
}