
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_menu_Scope0 {
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

class dashboard_menu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
  <nav class="top-bar" data-topbar>
    <ul class="title-area">
      <li class="name">
        <h1><a href="/">Pacemaker</a></h1>
      </li>
      <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
    </ul>
    <section class="top-bar-section">
      <ul class="right">
        <li class="divider"></li>
        <li class=""""),_display_(/*18.21*/activeLink("/dashboard")),format.raw/*18.45*/(""""><a href="/dashboard">Dashboard</a></li>
        <li class="divider"></li>
        <li class=""""),_display_(/*20.21*/activeLink("/upload")),format.raw/*20.42*/(""""><a href="/upload">Add Activity</a></li>
        <li class="divider"></li>
        <li class=""""),_display_(/*22.21*/activeLink("/friends")),format.raw/*22.43*/(""""><a href="/friends">Follow Friends</a></li>
        <li class="divider"></li>
        <li class=""""),_display_(/*24.21*/activeLink("/report")),format.raw/*24.42*/(""""><a href="/report">Activity Summary</a></li>
        <li class="divider"></li>
        <li><a href="/logout">Logout</a></li>
      </ul>
    </section>
  </nav>
</div>   """))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object dashboard_menu extends dashboard_menu_Scope0.dashboard_menu
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 21:52:04 GMT 2016
                  SOURCE: /home/ftahir/Documents/Masters/Agile/pacemakerplay/app/views/dashboard_menu.scala.html
                  HASH: 814cda860cdf207f3bf5307511b019c20c9537a3
                  MATRIX: 756->1|836->6|854->16|956->3|984->89|1012->91|1411->463|1456->487|1579->583|1621->604|1744->700|1787->722|1913->821|1955->842
                  LINES: 27->1|31->3|31->3|34->1|36->5|38->7|49->18|49->18|51->20|51->20|53->22|53->22|55->24|55->24
                  -- GENERATED --
              */
          