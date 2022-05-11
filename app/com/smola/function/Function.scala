package com.smola.function

import com.smola.complex.Complex

class Function {
  def Evaluate(z: Complex): Complex = {
    // f(z) = (z + 1) (z + i) (z - i)
    (z + new Complex(1.0, 0.0))*(z + new Complex(0.0, 1.0))*(z + new Complex(0.0, -1.0))
  }
  def Derivative(z: Complex): Complex = {
    // Derivative f'(z) = (z + i) (z - i) + (z + 1) (z - i) + (z + 1) (z + i)
    (z + new Complex(0.0, 1.0))*(z + new Complex(0.0, -1.0)) +
      (z + new Complex(1.0, 0.0))*(z + new Complex(0.0, -1.0)) +
    (z + new Complex(1.0, 0.0))*(z + new Complex(0.0, 1.0))
  }

}
