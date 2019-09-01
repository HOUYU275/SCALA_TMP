object Scala_01 {
  class Outer{
    class Mider{
      private def f(){}//只能在该类中访问（在类中定义的函数即是方法）
      printf("f")
      class Inner{
        f()
      }
    }
//    (new Mider).f()//私有变量，不可调用
  }

  class Super{
    protected def f() {println("f")}//只能在该类的子类中访问
  }
  class Sub extends Super{
    f()
  }
  class Other{
//    (new Super).f() //错误
  }

  class OutTmp {
    class Inner {
      def f() { println("f") }
      class InnerMost {
        f() // 正确
      }
    }
    (new Inner).f() // 正确因为 f() 是 public
  }

  def add(a:Int,b:Int):Int={//add function
   var sum:Int=0
   sum=a+b
   sum
  }


 def main(args:Array[String]):Unit= {
   println("Hello,world!")
   val myVal:String ="foo"
   var myVar:String ="too"
   myVar="foo"
   var VariableName:Integer=10
   val xmax,ymax=100
   var coup=(30,"island")



 }
}
