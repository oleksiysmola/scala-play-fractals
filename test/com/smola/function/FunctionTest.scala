package com.smola.function

import com.smola.complex.Complex
import org.scalatest.funsuite.AnyFunSuite

class FunctionTest extends AnyFunSuite {
  val underTest = new Function
  test("Returns zero at root -1") {
    // Given
    val complexNumber = new Complex(-1.0, 0.0)
    // When
    val actual = underTest.Evaluate(complexNumber)
    // Then
    val expected = new Complex(0.0, 0.0)
    assert(actual.equals(expected))
  }
  test("Returns zero at root i") {
    // Given
    val complexNumber = new Complex(0.0, 1.0)
    // When
    val actual = underTest.Evaluate(complexNumber)
    // Then
    val expected = new Complex(0.0, 0.0)
    assert(actual.equals(expected))
  }
  test("Returns zero at root -i") {
    // Given
    val complexNumber = new Complex(0.0, -1.0)
    // When
    val actual = underTest.Evaluate(complexNumber)
    // Then
    val expected = new Complex(0.0, 0.0)
    assert(actual.equals(expected))
  }
  test("Derivative returns 2 for z = -1") {
    // Given
    val complexNumber = new Complex(-1.0, 0.0)
    // When
    val actual = underTest.Derivative(complexNumber)
    // Then
    val expected = new Complex(2.0, 0.0)
    assert(actual.equals(expected))
  }

}
