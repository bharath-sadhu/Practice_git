package org.com.PartialFunction

class SquareRoot {
  val squareRoot = new PartialFunction[Double, Double] {
    def isDefinedAt(x: Double) = {
      x >= 0
    }
    def apply(x: Double) = {
      math.sqrt(x)
    }
  }
}