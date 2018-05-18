import org.junit.Assert._
import org.junit.Test
import org.mockito.Mockito._

import scala.collection.AbstractIterator

class IteratorMapIsLazy {

  @Test def mapIsLazyUsingSpyFrom(): Unit = {
    val it = spy(Iterator.from(0))
    verify(it, never).next() // FIXME ***nondeterministic*** NPE on Linux but not MacOS
  }
}
