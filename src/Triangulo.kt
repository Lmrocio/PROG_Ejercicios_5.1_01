import kotlin.math.sqrt

class Triangulo: Figura {

    var altura: Double = 0.0
    var base: Double = 0.0
    var lado1: Double = 0.0
    var lado2: Double = 0.0
    var lado3: Double = 0.0

    constructor(color: String, altura: Double, base:Double) : super(color){
        this.altura = altura
        this.base = base
    }

    constructor(color: String,lado1: Double, lado2: Double, lado3: Double) : super(color) {
        this.lado1 = lado1
        this.lado2 = lado2
        this.lado3 = lado3
    }

    /**
     *  Reescribe la función que hereda de la clase Figura para calcular el área del triángulo tanto por sus tres lados
     *  como por la base y altura, dependiendo del constructor secundario usado.
     *
     *  @return Double
     */
    override fun area() : Double {
        return if (base > 0.0 && altura > 0.0) {
            0.5 * base * altura

        } else if (lado1 > 0.0 && lado2 > 0.0 && lado3 > 0.0) {
            val semipe = (lado1 + lado2 + lado3) / 2

            sqrt(semipe * (semipe - lado1) * (semipe - lado2) * (semipe - lado3))
        } else {

            println("No ha introducido suficientes datos para calcular el área.")
            0.0
        }
    }

    /**
     *  Reescribe la función que hereda de la clase Figura para calcular el perimetro del triángulo tanto por sus tres lados
     *  como por la base y altura, dependiendo del constructor secundario usado.
     *
     *  @return Double
     */
    override fun perimetro(): Double {
        return if (base > 0.0 && altura > 0.0) {

            val hipotenusa = sqrt(base * base + altura * altura)
            base + altura + hipotenusa

        } else if (lado1 > 0.0 && lado2 > 0.0 && lado3 > 0.0) {

           lado1 + lado2 + lado3

        } else {

            println("No ha introducido suficientes datos para calcular el perímetro.")
            0.0
        }
    }

    /**
     * Reescribe la función toString() para mostrar la información del Triángulo
     *
     * @return String
     */
    override fun toString(): String {
        return "El tríangulo de color $color, base $base, altura $altura, lados $lado1, $lado2, $lado3 " +
                "tiene un área de ${"%.2f".format(area())} y perímetro de ${"%.2f".format(perimetro())}"
    }
}