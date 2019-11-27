package com.me

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.ExtensionContext
import org.opentest4j.AssertionFailedError


internal class GameTest {

    @AfterEach
    fun after(){

    }

    @Test
    fun getGameField() {
        val gameField = Game().gameField
        assertThat(gameField.size, equalTo(15))
        gameField.forEach {
            row -> assertThat(row.size, equalTo(20))
            row.forEach { value -> assertThat(value, equalTo(0)) }
        }
    }
}