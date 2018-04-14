import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.Add
import br.unb.cic.epl.Height
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.AddHeight
import br.unb.cic.epl.Sub
import br.unb.cic.epl.SubEval
import br.unb.cic.epl.SubHeight
import br.unb.cic.epl.Mult
import br.unb.cic.epl.MultEval
import br.unb.cic.epl.MultHeight

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal with Height.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal with Height.Literal

  val sum = new Add.Add(lit100, lit500) 
  val sub = new Sub.Sub(lit100, lit500)
  val mult = new Mult.Mult(lit100, lit500)

  val sum_eval = new AddEval.Add(lit100, lit500)
  val sub_eval = new SubEval.Sub(lit100, lit500)
  val mult_eval = new MultEval.Mult(lit100, lit500)

  val sum_height = new AddHeight.Add(lit100, lit500)
  val sub_height = new SubHeight.Sub(lit100, lit500)
  val mult_height = new MultHeight.Mult(lit100, lit500)

  println(sum.print())
  println(sum_eval.eval())
  println(sub.print())
  println(sub_eval.eval())
  println(mult.print())
  println(mult_eval.eval())
  println(sum_height.height())
  println(sub_height.height())
  println(mult_height.height())

}
