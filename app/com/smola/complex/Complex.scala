package com.smola.complex

class Complex(re: Double, im: Double) {
  val real = re
  val imaginary = im

  def +(complexNumber: Complex): Complex = {
    val newReal = complexNumber.real + this.real
    val newImaginary = complexNumber.imaginary + this.imaginary
    new Complex(newReal, newImaginary)
  }

  def canEqual(other: Any): Boolean = other.isInstanceOf[Complex]

  override def equals(other: Any): Boolean = other match {
    case that: Complex =>
      (that canEqual this) &&
        real == that.real &&
        imaginary == that.imaginary
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(real, imaginary)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
