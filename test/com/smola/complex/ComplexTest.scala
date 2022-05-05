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
  test("Can find conjugate of complex number") {
    // When
    val actual = underTest.conjugate()
    // Then
    val expected = new Complex(1.0, -1.0)
    assert(actual.equals(expected))
  }
  test("Can subtract complex numbers") {
    // Given
    val complexNumber = new Complex(1.0, 1.0)
    // When
    val actual = underTest - complexNumber
    // Then
    val expected = new Complex(0.0, 0.0)
    assert(actual.equals(expected))
  }
  test("Can multiply complex numbers") {
    // Given
    val complexNumber = new Complex(1.0, 1.0)
    // When
    val actual = underTest * complexNumber
    // Then
    val expected = new Complex(0, 2)
    assert(actual.equals(expected))
  }
  test("Can divide complex numbers") {
    // Given
    val complexNumber = new Complex(1.0, 1.0)
    // When
    val actual = underTest / complexNumber
    // Then
    val expected = new Complex(1.0, 0)
    assert(actual.equals(expected))
  }

}
