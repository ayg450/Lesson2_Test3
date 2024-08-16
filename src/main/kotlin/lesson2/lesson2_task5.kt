package org.example.lesson2

//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.

fun main() {
    var seconds = 6480
    val minutes = seconds / 60 - 60
    val hours: Int = seconds / 3600
    seconds = (seconds - 3600 - 2880)
    print("0" + hours)
    print(":")
    print(minutes)
    print(":")
    print(seconds)
    print("0")
}