
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("")/*3.10*/ {_display_(Seq[Any](format.raw/*3.12*/("""



""")))})),format.raw/*7.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 12 15:38:37 EDT 2013
                    SOURCE: /Users/kevinmangan/School/SoftwareEngineering/kmm2256_hw1/app/views/index.scala.html
                    HASH: 7b7262dfbe53ea43c342db3d71154433c1d7780a
                    MATRIX: 723->1|817->18|854->21|870->29|909->31|944->36
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7
                    -- GENERATED --
                */
            