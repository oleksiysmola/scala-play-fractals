package com.smola.complex

import org.scalatest.funsuite.AnyFunSuite

class ComplexTest extends AnyFunSuite {
  val underTest = new Complex(1.0, 1.0)
  test("Can add complex numbers") {
    // Given
    val complexNumber = new Complex(1.0, 1.0)
    // When
    val actual = underTest + complexNumber
    // Then
    val expected = new Complex(2.0, 2.0)
    assert(actual.equals(expected))
  }
}
