
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_main_Scope0 {
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

class dashboard_main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Activity],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(activities: List[Activity], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/main("Dashboard")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	"""),_display_(/*4.3*/dashboard_menu()),format.raw/*4.19*/("""
    
 """),format.raw/*6.2*/("""<script class="init">
	$(document).ready(function() """),format.raw/*7.31*/("""{"""),format.raw/*7.32*/("""
	"""),format.raw/*8.2*/("""$('#userActivities').dataTable();
	"""),format.raw/*9.2*/("""}"""),format.raw/*9.3*/(""" """),format.raw/*9.4*/(""");
	</script>
 
  <div class="row">
  	"""),_display_(/*13.5*/if(flash.contains("success"))/*13.34*/ {_display_(Seq[Any](format.raw/*13.36*/("""
				    """),format.raw/*14.9*/("""<div data-alert class="alert-box success radius">
				        """),_display_(/*15.14*/flash/*15.19*/.get("success")),format.raw/*15.34*/("""
				        """),format.raw/*16.13*/("""<a href="#" class="close">&times;</a>
				    </div>
		""")))}),format.raw/*18.4*/("""
		
		"""),format.raw/*20.3*/("""<div class="small-12 large-12 columns">
			<h2>"""),_display_(/*21.9*/user/*21.13*/.firstname),format.raw/*21.23*/(""" """),_display_(/*21.25*/user/*21.29*/.lastname),format.raw/*21.38*/("""'s Activities</h2>
			<table id="userActivities" class="display" cellspacing="0" width="100%">
				<thead>
					<tr>
						<th width="150">Type</th>
            <th width="150">Location</th>
            <th width="150">Distance Km</th>
            <th width="100">Date</th>
            <th width="100">Dutation minutes</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<th width="150">Type</th>
            <th width="150">Location</th>
            <th width="150">Distance Km</th>
            <th width="100">Date</th>
            <th width="100">Dutation minutes</th>
					</tr>
				</foot>
				<tbody>
					"""),_display_(/*42.7*/for(i <- 0 until activities.size) yield /*42.40*/ {_display_(Seq[Any](format.raw/*42.42*/("""
					"""),format.raw/*43.6*/("""<tr>
				<td> """),_display_(/*44.11*/activities(i)/*44.24*/.activityType),format.raw/*44.37*/(""" """),format.raw/*44.38*/("""</td> 
	          	<td> """),_display_(/*45.19*/activities(i)/*45.32*/.location),format.raw/*45.41*/(""" """),format.raw/*45.42*/("""</td> 
	          	<td> """),_display_(/*46.19*/activities(i)/*46.32*/.distance),format.raw/*46.41*/(""" """),format.raw/*46.42*/("""</td>
	          	<td> """),_display_(/*47.19*/activities(i)/*47.32*/.date),format.raw/*47.37*/("""  """),format.raw/*47.39*/("""</td>
	          	<td> """),_display_(/*48.19*/activities(i)/*48.32*/.duration),format.raw/*48.41*/("""  """),format.raw/*48.43*/("""</td>
					</tr>
					""")))}),format.raw/*50.7*/("""
				"""),format.raw/*51.5*/("""</tbody>
			</table>
		</div><br>
		
	
		
	</div>
""")))}))
      }
    }
  }

  def render(activities:List[Activity],user:User): play.twirl.api.HtmlFormat.Appendable = apply(activities,user)

  def f:((List[Activity],User) => play.twirl.api.HtmlFormat.Appendable) = (activities,user) => apply(activities,user)

  def ref: this.type = this

}


}

/**/
object dashboard_main extends dashboard_main_Scope0.dashboard_main
              /*
                  -- GENERATED --
                  DATE: Thu Dec 29 00:21:00 GMT 2016
                  SOURCE: /home/ftahir/Documents/Masters/Agile/pacemakerplay/app/views/dashboard_main.scala.html
                  HASH: 6c51f09c6a4cd5b808e2c6108ade0854220acfcf
                  MATRIX: 776->1|911->41|939->44|964->61|1003->63|1031->66|1067->82|1100->89|1179->141|1207->142|1235->144|1296->179|1323->180|1350->181|1416->221|1454->250|1494->252|1530->261|1620->324|1634->329|1670->344|1711->357|1797->413|1830->419|1904->467|1917->471|1948->481|1977->483|1990->487|2020->496|2664->1114|2713->1147|2753->1149|2786->1155|2828->1170|2850->1183|2884->1196|2913->1197|2965->1222|2987->1235|3017->1244|3046->1245|3098->1270|3120->1283|3150->1292|3179->1293|3230->1317|3252->1330|3278->1335|3308->1337|3359->1361|3381->1374|3411->1383|3441->1385|3494->1408|3526->1413
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|37->6|38->7|38->7|39->8|40->9|40->9|40->9|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|49->18|51->20|52->21|52->21|52->21|52->21|52->21|52->21|73->42|73->42|73->42|74->43|75->44|75->44|75->44|75->44|76->45|76->45|76->45|76->45|77->46|77->46|77->46|77->46|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|81->50|82->51
                  -- GENERATED --
              */
          