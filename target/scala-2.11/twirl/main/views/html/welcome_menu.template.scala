
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcome_menu_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class welcome_menu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/activeLink/*3.12*/(currentPath:String) = {{
if(request.path.equals(currentPath)) "active"
}};
Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*5.2*/("""

"""),format.raw/*7.1*/("""<div class="sticky">
   <nav class="top-bar" data-topbar role="navigation">
     <ul class="title-area">
       <li class="name">
         <h1><a href="/">PACEMAKER</a></h1>
       </li>
       <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
     </ul>
     <section class="top-bar-section">
       <ul class="right">
         <li class="divider"></li>
         <li class=""""),_display_(/*18.22*/activeLink("/signup")),format.raw/*18.43*/(""""><a href="/signup">Signup</a></li>
         <li class="divider"></li>
         <li class=""""),_display_(/*20.22*/activeLink("/login")),format.raw/*20.42*/(""""><a href="/login">Login</a></li>
       </ul>
     </section>
    
   </nav>
 </div>
    """))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object welcome_menu extends welcome_menu_Scope0.welcome_menu
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 18:47:54 GMT 2016
                  SOURCE: /home/ftahir/Documents/Masters/Agile/pacemakerplay/app/views/welcome_menu.scala.html
                  HASH: e9c7d27a42aacc02c0217aaa0959bcdc4adeb373
                  MATRIX: 752->1|832->6|850->16|952->3|980->89|1008->91|1436->492|1478->513|1597->605|1638->625
                  LINES: 27->1|31->3|31->3|34->1|36->5|38->7|49->18|49->18|51->20|51->20
                  -- GENERATED --
              */
          