class Rectangulo(color: String, val altura: Double, val base: Double) : Figura (color) {

    /**
     * Reescribe la función heredada de la clase Figura para calcular el área del Rectángulo con la base y la altura.
     *
     * @return Double
     */
    override fun area(): Double {
        return altura * base
    }

    /**
     * Reescribe la función heredada de la clase Figura para calcular el perímetro del Rectángulo con la base y la altura.
     *
     * @return Double
     */
    override fun perimetro() : Double {
        return (altura + base) * 2
    }

    /**
     * Reescribe la función toString() para mostrar la información del Rectángulo
     *
     * @return String
     */
    override fun toString(): String {
        return "El rectángulo de color $color, base $base y altura $altura tiene un área de ${"%.2f".format(area())} " +
                "y perímetro de ${"%.2f".format(perimetro())}"
    }
}