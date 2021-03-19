
import scala.io.StdIn.{readInt, readLine}

object Prueba {

  var sum : Int =0
  def cuentaProgresivaRecursiva(inicio : Int, fin:Int): Int = {
    var i = inicio
    if(inicio <=fin){
      sum = i +sum
      cuentaProgresivaRecursiva(i + 1, fin)
    }
    sum
  }

  var cont = 0
  def divisoresNumero(n: Int): Unit ={
    cont+=1
    if(n%cont==0 ){
      println(cont)
    }
    divisoresNumero(n)
  }

  var fac=1
  def factorialNumero(n: Int): Int = {
    cont+=1
    if(n >= cont){
      fac *= cont
      factorialNumero(n)
    }
    fac
  }

  def cocientesDivision(dividendo:Int, divisor:Int): Unit={
      if(cont <= dividendo){
        cont+=1
        if(cont%dividendo==0){
          println(cont/divisor)
        }
      }
    cocientesDivision(dividendo, divisor)
  }

  var cont2, cont3=0
  var listaDivisores1, listaDivisores2 = List(0)
  def conteoDivisores(num1: Int, num2: Int): Unit ={
    cont+=1
    if(num2%cont==0){
      cont3+=1
      //println(cont)
      listaDivisores1 = listaDivisores1 :+ cont
      if(cont == num2){
        println("El total de divisores del numero " + num2 + " es: " +cont3)
        listaDivisores1 = listaDivisores1.filter(_ > 0)
        println(listaDivisores1)
      }
    }
    if(num1%cont==0 ){
      cont2+=1
      listaDivisores2 = listaDivisores2 :+ cont
      if(cont == num1){
        println("El total de divisores del numero " + num1 + " es: " +cont2)
        listaDivisores2 = listaDivisores2.filter(_ > 0)
        println(listaDivisores2)
      }
    }
    conteoDivisores(num1, num2)
  }

  var binario = ""
  def convertirBinario(num: Int): Unit={
    var n = num

    if(n/2!=0){
      //println(n%2)
      binario = n%2 +binario
      n = n/2
      //println(n)

      if(n==1){
        binario=n+binario
        //println(n)
        println(binario)
      }
    }
    convertirBinario(n)
  }

  def cantidadVocales(cadena: String): Int={

    if(cont<cadena.length){
      //println(cadena.charAt(cont))
      if(cadena.charAt(cont).toString.equalsIgnoreCase("a")  || cadena.charAt(cont).toString.equalsIgnoreCase("e")
        || cadena.charAt(cont).toString.equalsIgnoreCase("i") || cadena.charAt(cont).toString.equalsIgnoreCase("o")
        || cadena.charAt(cont).toString.equalsIgnoreCase("u")){
        cont2+=1
        if(cont==(cadena.length -1)){
          println(cont2)
        }
      }
      cont+=1
    }
    cantidadVocales(cadena)

  }

  def main(args: Array[String]): Unit = {
    var option, num1, num2 = 0
    println("Elige el programa a ejecutar. (Ingresa el número correspondiente al programa)")
    println("1.- Programa que mueste la sumatoria de numeros enteros desde un limite inicial hasta un limite final.")
    println("2.- Programa que muestre los DIVISORES de un numero dado.")
    println("3.- Programa que muestre el FACTORIAL de un numero dado.")
    println("4.- Programa que muestre los cocientes enteros de la division entre entre dos números dados.")
    println("5.- Programa que muestre cuantos son los divisores enteros entre dos números dados.")
    println("6.- Programa que muestre la conversión de un numero decimal a su representación en sistema binario.")
    println("7.- Programa que calcule a cantidad de vocales en una cadena.")
    option = readInt()

    option match {
        case 1 =>
          var li, lf = 0
          println("Ingresa el limite inicial:  ")
          li = readInt()
          println("Ingresa el limite final: ")
          lf = readInt()
          println("Sumatoria: " + cuentaProgresivaRecursiva(li, lf))

        case 2 =>
          println("Ingresa un numero")
          num1 = readInt()
          println("Los numeros divisores de " + num1 + " son: ")
          divisoresNumero(num1)

        case 3 =>
          println("Ingresa un numero")
          num1 = readInt()
          println("El factorial del numero " + num1 + " es: " + factorialNumero(num1))

        case 4 =>
          var dividendo, divisor = 0
          println("Ingresa el numero dividendo: ")
          dividendo = readInt()
          println("Ingresa el numero divisor")
          divisor = readInt()
          println("Los cocientes de la division son: ")
          cocientesDivision(dividendo, divisor)

        case 5 =>
          println("Ingresa el numero 1: ")
          num1 = readInt()
          println("Ingresa el numero 2: ")
          num2 = readInt()
          conteoDivisores(num1, num2)

        case 6 =>
          println("Ingresa el numero: ")
          num1 = readInt()
          convertirBinario(num1)

        case 7 =>
          println("Ingresa una palabra")
          val cadena = readLine()
          cantidadVocales(cadena)
    }

  }

}
