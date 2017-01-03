
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcome_main_Scope0 {
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

class welcome_main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
  """),_display_(/*4.4*/welcome_menu()),format.raw/*4.18*/("""
    """),format.raw/*5.5*/("""<html>
   
    <body>
	
	<div class="row"  >
		<div class="small-2 large-4 columns">
			<img src=""""),_display_(/*11.15*/routes/*11.21*/.Assets.at("images/heartbeat.png")),format.raw/*11.55*/("""" class="ui medium image">
		</div>
		<div class="small-6 large-8 columns">
					"""),_display_(/*14.7*/if(flash.contains("success"))/*14.36*/ {_display_(Seq[Any](format.raw/*14.38*/("""
				    	"""),format.raw/*15.10*/("""<div data-alert class="alert-box success radius">
				        """),_display_(/*16.14*/flash/*16.19*/.get("success")),format.raw/*16.34*/("""
				        """),format.raw/*17.13*/("""<a href="#" class="close">&times;</a>
				      </div>
				    """)))}),format.raw/*19.10*/("""
			"""),format.raw/*20.4*/("""<h1> Pacemaker</h1>
			<ul class="square">
				<li>Save your activites</li>
				<li>Search activity list</li>
				<li>Summarize Activities using charts</li>
			</ul>
		</div>
		
	</div>
	
	<body>
	</html>
	
 
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object welcome_main extends welcome_main_Scope0.welcome_main
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 18:47:54 GMT 2016
                  SOURCE: /home/ftahir/Documents/Masters/Agile/pacemakerplay/app/views/welcome_main.scala.html
                  HASH: f19a6539c4ddbdbc49ecab0066c4273c83563787
                  MATRIX: 752->1|848->3|876->6|899->21|938->23|967->27|1001->41|1032->46|1158->145|1173->151|1228->185|1336->267|1374->296|1414->298|1452->308|1542->371|1556->376|1592->391|1633->404|1728->468|1759->472
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|36->5|42->11|42->11|42->11|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|50->19|51->20
                  -- GENERATED --
              */
          