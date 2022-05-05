package com.smola.complex

class Complex(re: Double, im: Double) {
  val real = re
  val imaginary = im

  def conjugate(): Complex = {
    new Complex(this.real, -this.imaginary)
  }

  def +(complexNumber: Complex): Complex = {
    val newReal = complexNumber.real + this.real
    val newImaginary = complexNumber.imaginary + this.imaginary
    new Complex(newReal, newImaginary)
  }

  def -(complexNumber: Complex): Complex = {
    val newReal = this.real - complexNumber.real
    val newImaginary = this.imaginary - complexNumber.imaginary
    new Complex(newReal, newImaginary)
  }

  def *(complexNumber: Complex): Complex = {
    val newReal = complexNumber.real*this.real - complexNumber.imaginary*this.imaginary
    val newImaginary = complexNumber.real*this.imaginary + complexNumber.imaginary*this.real
    new Complex(newReal, newImaginary)
  }
  def /(complexNumber: Complex): Complex = {
    val newReal = (complexNumber.real*this.real + complexNumber.imaginary*this.imaginary)/(math.pow(this.real, 2) + math.pow(this.imaginary, 2))
    val newImaginary = (- complexNumber.real*this.imaginary + complexNumber.imaginary*this.real)/(math.pow(this.real, 2) + math.pow(this.imaginary, 2))
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
