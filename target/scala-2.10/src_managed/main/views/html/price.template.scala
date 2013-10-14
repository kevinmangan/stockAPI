
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object price extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(price: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),_display_(Seq[Any](/*3.2*/main("")/*3.10*/ {_display_(Seq[Any](format.raw/*3.12*/("""

    """),_display_(Seq[Any](/*5.6*/price)),format.raw/*5.11*/("""


""")))})),format.raw/*8.2*/("""
"""))}
    }
    
    def render(price:String): play.api.templates.Html = apply(price)
    
    def f:((String) => play.api.templates.Html) = (price) => apply(price)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 12 15:39:12 EDT 2013
                    SOURCE: /Users/kevinmangan/School/SoftwareEngineering/kmm2256_hw1/app/views/price.scala.html
                    HASH: 126732124ad94c59f6c5232fbd484b57366b00fe
                    MATRIX: 723->1|815->16|852->19|868->27|907->29|948->36|974->41|1008->45
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|36->8
                    -- GENERATED --
                */
            