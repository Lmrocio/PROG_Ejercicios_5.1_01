class Circulo(color: String, val radio: Double) : Figura (color) {

    /**
     * Reescribe la función heredada de la clase Figura para calcular el área del Círculo con el radio y el valor PI
     *
     * @return Double
     */
    override fun area(): Double {
        return Math.PI * radio * radio
    }

    /**
     * Reescribe la función heredada de la clase Figura para calcular el perímetro del Círculo con el radio y el valor PI
     *
     * @return Double
     */
    override fun perimetro(): Double {
        return 2 * Math.PI * radio
    }

    /**
     * Reescribe la función toString() para mostrar la información del Círculo
     *
     * @return String
     */
    override fun toString(): String {
        return "El círculo de color $color y radio $radio tiene un área de ${"%.2f".format(area())} y perímetro de ${"%.2f".format(perimetro())}"
    }
}