package com.smola.function

import com.smola.complex.Complex

class Function {
  def Evaluate(z: Complex): Complex = {
    (z + new Complex(1.0, 0.0))*(z + new Complex(0.0, 1.0))*(z + new Complex(0.0, -1.0))
  }

}
