package com.me

class Game {
    val gameField: Array<Array<Int>> = zeros(15, 20)

    private fun zeros(height: Int, width: Int): Array<Array<Int>> {
        return Array(height) { Array(width) { 0 } }
    }

}