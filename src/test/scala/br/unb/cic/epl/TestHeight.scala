package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestHeight extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "A Height Operation"

  var literal100 : Height.Literal = _
  var literal200 : Height.Literal = _
  var literal300 : Height.Literal = _
  var literal400 : Height.Literal = _
  var literal500 : Height.Literal = _ 

  before {
    literal100 = new Core.Literal(100) with Height.Literal
    literal200 = new Core.Literal(200) with Height.Literal
    literal300 = new Core.Literal(300) with Height.Literal
    literal400 = new Core.Literal(400) with Height.Literal
    literal500 = new Core.Literal(500) with Height.Literal
  }

  it should "return 4 when we call add2_height.height for the expression   ((100 * 200) + 300) + (500 - 400)" in {
    val mult_height = new MultHeight.Mult(literal100, literal200)
    val add1_height = new AddHeight.Add(mult_height, literal300)
    val sub_height = new SubHeight.Sub(literal500, literal400)
    val add2_height = new AddHeight.Add(add1_height, sub_height)

    add2_height.height() should be (4)
  }

}