package org.com.scalaTests

import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import org.com.practiceqsns.SquareRoot

class SquareRootTest extends TestCase {

  var square: SquareRoot = _

  override def setUp {
    square = new SquareRoot
  }

  @Test def testSquareRoot {

    assertTrue(true)
  }
}