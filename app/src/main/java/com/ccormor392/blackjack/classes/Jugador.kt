package com.ccormor392.blackjack.classes

class Jugador() {
    private val cartasEnMano = mutableListOf<Carta>()
    fun cogerCarta(carta: Carta){
        cartasEnMano.add(carta)
    }
}