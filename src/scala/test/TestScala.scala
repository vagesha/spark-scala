package scala.test

object TestScala {
  
  def factorial(num: Int): Int = {
    
    if(num <=1) 1
    else num * factorial(num-1)
  }
  
  def gcd(a: Int, b: Int): Int = {
    
    if(b == 0) a
    else gcd(b, a%b)
    
  }

  def main(args : Array[String]) {
    
    println(factorial(5))
    println(gcd(11, 13))  
  }
  
}