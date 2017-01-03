
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <meta charset="utf-8">
	  		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        
        
        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.at("foundation5/css/foundation.css")),format.raw/*14.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.at("foundation5/css/dataTables.foundation.css")),format.raw/*15.115*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.at("stylesheets/main.css")),format.raw/*16.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.at("images/favicon.png")),format.raw/*17.97*/("""">
        
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.at("foundation5/js/modernizr.js")),format.raw/*19.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*20.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*21.23*/routes/*21.29*/.Assets.at("javascripts/jquery.dataTables.js")),format.raw/*21.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.at("foundation5/js/dataTables.foundation.js")),format.raw/*22.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.at("javascripts/highcharts.js")),format.raw/*23.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.at("javascripts/exporting.js")),format.raw/*24.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.at("javascripts/main.js")),format.raw/*25.62*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.at("foundation5/js/foundation.min.js")),format.raw/*26.75*/("""" type="text/javascript"></script>
        
        
        
    </head>
    <body>
        """),_display_(/*32.10*/content),format.raw/*32.17*/("""
        
        """),format.raw/*34.9*/("""<script>
				  $(document).foundation();
				</script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 18:47:54 GMT 2016
                  SOURCE: /home/ftahir/Documents/Masters/Agile/pacemakerplay/app/views/main.scala.html
                  HASH: ea250422c945aeaf7bbe97edc2cd6c4bddbb8035
                  MATRIX: 748->1|873->31|901->33|978->84|1003->89|1301->360|1316->366|1382->410|1465->466|1480->472|1557->527|1640->583|1655->589|1710->623|1798->684|1813->690|1866->722|1927->756|1942->762|2004->803|2088->860|2103->866|2169->911|2253->968|2268->974|2335->1020|2419->1077|2434->1083|2508->1136|2592->1193|2607->1199|2667->1238|2751->1295|2766->1301|2825->1339|2909->1396|2924->1402|2978->1435|3062->1492|3077->1498|3144->1544|3265->1638|3293->1645|3338->1663
                  LINES: 27->1|32->1|34->3|38->7|38->7|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|63->32|63->32|65->34
                  -- GENERATED --
              */
          