import org.junit.Assert._
import org.junit.Test
import org.mockito.Mockito._

import scala.collection.AbstractIterator

class IteratorMapIsLazy {

  @Test def mapIsLazyUsingSpyFrom(): Unit = {
    val i0 = Iterator.from(0)
    i0.next()
    val it = spy(i0)
    verify(it, never).next() // FIXME ***nondeterministic*** NPE on Linux but not MacOS
  }
}
