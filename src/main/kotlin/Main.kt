import kotlin.math.*
import java.util.*

class Point(val x: Double, val y: Double)

fun main() {
    val point1 = inputPoint("Введите координаты первой точки (x, y): ")
    val point2 = inputPoint("Введите координаты второй точки (x, y): ")

    val distance = calculateDistance(point1, point2)

    println("Расстояние между двумя точками: $distance")
}

fun inputPoint(prompt: String): Point {
    val scanner = Scanner(System.`in`)
    print(prompt)
    val x = scanner.nextDouble()
    val y = scanner.nextDouble()
    return Point(x, y)
}

fun calculateDistance(point1: Point, point2: Point): Double {
    val deltaX = point2.x - point1.x
    val deltaY = point2.y - point1.y
    return sqrt(deltaX * deltaX + deltaY * deltaY)
}