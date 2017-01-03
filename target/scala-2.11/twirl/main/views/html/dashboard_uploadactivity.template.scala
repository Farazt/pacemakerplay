
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_uploadactivity_Scope0 {
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

class dashboard_uploadactivity extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Upload activity")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
	"""),_display_(/*4.3*/dashboard_menu()),format.raw/*4.19*/("""
   
 """),format.raw/*6.2*/("""<script type="text/javascript">
    var datefield=document.createElement("input")
    datefield.setAttribute("type", "date")
    if (datefield.type!="date")"""),format.raw/*9.32*/("""{"""),format.raw/*9.33*/(""" """),format.raw/*9.34*/("""//if browser doesn't support input type="date", load files for jQuery UI Date Picker
        document.write('<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />\n')
        document.write('<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"><\/script>\n')
        document.write('<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"><\/script>\n')
    """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/("""
"""),format.raw/*14.1*/("""</script>
 
<script>
if (datefield.type!="date")"""),format.raw/*17.28*/("""{"""),format.raw/*17.29*/(""" """),format.raw/*17.30*/("""//if browser doesn't support input type="date", initialize date picker widget:
    jQuery(function($)"""),format.raw/*18.23*/("""{"""),format.raw/*18.24*/(""" """),format.raw/*18.25*/("""//on document.ready
        $('#activityDate').datepicker();
    """),format.raw/*20.5*/("""}"""),format.raw/*20.6*/(""")
"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/("""
"""),format.raw/*22.1*/("""</script>
 
	<div class="main">
		<div class="wrapper">
			<div id="login" class="row" style="margin: auto">
				<form action="/submitactivity" method="POST">
					<div class="large-12 columns text-center">
						<h3 class="text-center">Enter Activity Details:</h3>
						<label>Please select an activity</label>
						<select name="kind" required>
							<option></option>
							<option value="walking">Walking</option>
							<option value="running">Running</option>
							<option value="cycling">Cycling</option>
							<option value="hiking">Hiking</option>
							<option value="swimming">Swimming</option>
							<option value="rowing">Rowing</option>
						</select>
						
				    <input type="text" placeholder="Activity location:" class="no-radius" name="location" required/>
				    <input type="number" min="0" placeholder="Distance in km:" class="no-radius" name="distance"  required/>
				    <input type="date" name="date" id="activityDate" placeholder="Activity date:" required>
				    <input type="number" min="0" placeholder="Duration minutes:" class="no-radius" step="5" name="duration"  required/>
				    <button  class="button small border-radius-bottom" style="width: 100%">Upload Activity</button>
					 </div>
				</form>
			</div>
		</div>
	</div>
""")))}),format.raw/*51.2*/("""
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
object dashboard_uploadactivity extends dashboard_uploadactivity_Scope0.dashboard_uploadactivity
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 18:47:54 GMT 2016
                  SOURCE: /home/ftahir/Documents/Masters/Agile/pacemakerplay/app/views/dashboard_uploadactivity.scala.html
                  HASH: 878765a9718271b8606c54df26e05ca9b7edf0bc
                  MATRIX: 776->1|872->3|900->6|931->29|970->31|998->34|1034->50|1066->56|1249->212|1277->213|1305->214|1809->691|1837->692|1865->693|1941->741|1970->742|1999->743|2128->844|2157->845|2186->846|2278->911|2306->912|2335->914|2363->915|2391->916|3699->2194
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|37->6|40->9|40->9|40->9|44->13|44->13|45->14|48->17|48->17|48->17|49->18|49->18|49->18|51->20|51->20|52->21|52->21|53->22|82->51
                  -- GENERATED --
              */
          