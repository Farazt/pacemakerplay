
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_report_Scope0 {
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

class dashboard_report extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Activity],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(activities: List[Activity], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/main("Dashboard")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	"""),_display_(/*4.3*/dashboard_menu()),format.raw/*4.19*/("""
	
	"""),format.raw/*6.2*/("""<input type="hidden" value=""""),_display_(/*6.31*/user/*6.35*/.id),format.raw/*6.38*/("""" id='usersID'>"""),format.raw/*6.86*/("""
  """),format.raw/*7.3*/("""<script>
	
	// find logged in user id
  var uid = $('#usersID').attr("value");
 
	// construct api url
  var url = "http://localhost:9000/api/users/" + uid + "/activities";
	//var url = "/api/users/" + uid + "/activities";
	
	// get activity data using rest api
	$(document).ready(function () """),format.raw/*17.32*/("""{"""),format.raw/*17.33*/("""
		"""),format.raw/*18.3*/("""$.ajax("""),format.raw/*18.10*/("""{"""),format.raw/*18.11*/("""
			"""),format.raw/*19.4*/("""url:url,
			dataType: 'json',
			success: function(data) """),format.raw/*21.28*/("""{"""),format.raw/*21.29*/("""
				
				"""),format.raw/*23.5*/("""// create empty arrays
				var dateDistance_data = [];
				var dateDuration_data = [];
				
				// convert json array to array of objects, date & distance
				$.map(data, function(obj, i) """),format.raw/*28.34*/("""{"""),format.raw/*28.35*/("""
					"""),format.raw/*29.6*/("""dateDistance_data.push([obj.date, obj.distance, obj.activityType]);
				"""),format.raw/*30.5*/("""}"""),format.raw/*30.6*/(""");
				
				// reverse so that latest data appears to right of chart
				dateDistance_data = dateDistance_data.reverse();
				
				// convert json array to array of objects, date & duration
				$.map(data, function(obj, i) """),format.raw/*36.34*/("""{"""),format.raw/*36.35*/("""
					"""),format.raw/*37.6*/("""dateDuration_data.push([obj.date, obj.duration]);
				"""),format.raw/*38.5*/("""}"""),format.raw/*38.6*/(""");
				
				// reverse so that latest data appears to right of chart
				dateDuration_data = dateDuration_data.reverse();
				
				// create distance chart
				$('#chartContainer').highcharts("""),format.raw/*44.37*/("""{"""),format.raw/*44.38*/("""
					"""),format.raw/*45.6*/("""chart: """),format.raw/*45.13*/("""{"""),format.raw/*45.14*/("""
						"""),format.raw/*46.7*/("""type: 'column',
						marginRight: 130,
						marginBotom: 25
					"""),format.raw/*49.6*/("""}"""),format.raw/*49.7*/(""",
					title: """),format.raw/*50.13*/("""{"""),format.raw/*50.14*/("""
						"""),format.raw/*51.7*/("""text: 'Activity Distances'
					"""),format.raw/*52.6*/("""}"""),format.raw/*52.7*/(""",
					xAxis: """),format.raw/*53.13*/("""{"""),format.raw/*53.14*/("""
						"""),format.raw/*54.7*/("""type: 'category'
					"""),format.raw/*55.6*/("""}"""),format.raw/*55.7*/(""",
					yAxis: """),format.raw/*56.13*/("""{"""),format.raw/*56.14*/("""
						"""),format.raw/*57.7*/("""title: """),format.raw/*57.14*/("""{"""),format.raw/*57.15*/("""
							"""),format.raw/*58.8*/("""text: 'Distance Km'
						"""),format.raw/*59.7*/("""}"""),format.raw/*59.8*/(""",
						plotLines: ["""),format.raw/*60.19*/("""{"""),format.raw/*60.20*/("""
	              """),format.raw/*61.16*/("""value: 0,
	              width: 1,
	              color: '#808080'
	          """),format.raw/*64.12*/("""}"""),format.raw/*64.13*/("""]
					"""),format.raw/*65.6*/("""}"""),format.raw/*65.7*/(""",
					series: ["""),format.raw/*66.15*/("""{"""),format.raw/*66.16*/("""
						"""),format.raw/*67.7*/("""name: 'distance',
						data: dateDistance_data
					"""),format.raw/*69.6*/("""}"""),format.raw/*69.7*/("""]
				"""),format.raw/*70.5*/("""}"""),format.raw/*70.6*/(""");
				
				// create  duration chart
				$('#chartContainer2').highcharts("""),format.raw/*73.38*/("""{"""),format.raw/*73.39*/("""
					"""),format.raw/*74.6*/("""chart: """),format.raw/*74.13*/("""{"""),format.raw/*74.14*/("""
						"""),format.raw/*75.7*/("""type: 'line',
						marginRight: 130,
						marginBotom: 25
					"""),format.raw/*78.6*/("""}"""),format.raw/*78.7*/(""",
					title: """),format.raw/*79.13*/("""{"""),format.raw/*79.14*/("""
						"""),format.raw/*80.7*/("""text: 'Activity Duration'
					"""),format.raw/*81.6*/("""}"""),format.raw/*81.7*/(""",
					xAxis: """),format.raw/*82.13*/("""{"""),format.raw/*82.14*/("""
						"""),format.raw/*83.7*/("""type: 'category'
					"""),format.raw/*84.6*/("""}"""),format.raw/*84.7*/(""",
					yAxis: """),format.raw/*85.13*/("""{"""),format.raw/*85.14*/("""
						"""),format.raw/*86.7*/("""title: """),format.raw/*86.14*/("""{"""),format.raw/*86.15*/("""
							"""),format.raw/*87.8*/("""text: 'Duration minutes'
						"""),format.raw/*88.7*/("""}"""),format.raw/*88.8*/(""",
						plotLines: ["""),format.raw/*89.19*/("""{"""),format.raw/*89.20*/("""
	              """),format.raw/*90.16*/("""value: 0,
	              width: 1,
	              color: '#808080'
	          """),format.raw/*93.12*/("""}"""),format.raw/*93.13*/("""]
					"""),format.raw/*94.6*/("""}"""),format.raw/*94.7*/(""",
					legend: """),format.raw/*95.14*/("""{"""),format.raw/*95.15*/("""
						"""),format.raw/*96.7*/("""layout: 'vertical',
						align: 'right',
						x: -10,
						y: 100,
						borderWidth: 0
					"""),format.raw/*101.6*/("""}"""),format.raw/*101.7*/(""",
					series: ["""),format.raw/*102.15*/("""{"""),format.raw/*102.16*/("""
						"""),format.raw/*103.7*/("""name: 'minutes',
						data: dateDuration_data
					"""),format.raw/*105.6*/("""}"""),format.raw/*105.7*/("""]
				"""),format.raw/*106.5*/("""}"""),format.raw/*106.6*/(""");
			"""),format.raw/*107.4*/("""}"""),format.raw/*107.5*/("""
		"""),format.raw/*108.3*/("""}"""),format.raw/*108.4*/(""");
	"""),format.raw/*109.2*/("""}"""),format.raw/*109.3*/(""");
  </script>
	

  
	
	<div class="row">
	<br>
		<div id="chartContainer" style="min-width: 310px; height: 350px; margin: 0 auto"></div><br>
		<div id="chartContainer2" style="min-width: 310px; height: 350px; margin: 0 auto"></div><br>
		
		<div class="text-center">
			<button id="show" class="button success radius">View All Activities</button>
	    <button id="hide" class="button radius">Hide Activities</button>
    </div><br>
		<div id="viewHide" class="small-7 large-9 columns" hidden="true">
			<h2>"""),_display_(/*125.9*/user/*125.13*/.firstname),format.raw/*125.23*/("""'s Activities List</h2>
			<table>
				<thead>
					<tr>
						<th width="150">Type</th>
            <th width="150">Location</th>
            <th width="150">Distance Km</th>
            <th width="100">Date</th>
            <th width="150">Duration minutes</th>
				</thead>
				<tbody>
					"""),_display_(/*136.7*/for(i <- 0 until activities.size) yield /*136.40*/ {_display_(Seq[Any](format.raw/*136.42*/("""
					"""),format.raw/*137.6*/("""<tr>
						<td> """),_display_(/*138.13*/activities(i)/*138.26*/.activityType),format.raw/*138.39*/(""" """),format.raw/*138.40*/("""</td> 
	          <td> """),_display_(/*139.18*/activities(i)/*139.31*/.location),format.raw/*139.40*/(""" """),format.raw/*139.41*/("""</td> 
	          <td> """),_display_(/*140.18*/activities(i)/*140.31*/.distance),format.raw/*140.40*/(""" """),format.raw/*140.41*/("""</td>
	          <td> """),_display_(/*141.18*/activities(i)/*141.31*/.date),format.raw/*141.36*/(""" """),format.raw/*141.37*/("""</td>
	          <td> """),_display_(/*142.18*/activities(i)/*142.31*/.duration),format.raw/*142.40*/(""" """),format.raw/*142.41*/("""</td>
					</tr>
					""")))}),format.raw/*144.7*/("""
				"""),format.raw/*145.5*/("""</tbody>
			</table>
			
		</div>
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
object dashboard_report extends dashboard_report_Scope0.dashboard_report
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 18:47:54 GMT 2016
                  SOURCE: /home/ftahir/Documents/Masters/Agile/pacemakerplay/app/views/dashboard_report.scala.html
                  HASH: b514b365b8298cade31c6c6f0926d38ae821b14f
                  MATRIX: 780->1|915->41|943->44|968->61|1007->63|1035->66|1071->82|1101->86|1156->115|1168->119|1191->122|1233->170|1262->173|1583->466|1612->467|1642->470|1677->477|1706->478|1737->482|1822->539|1851->540|1888->550|2104->738|2133->739|2166->745|2265->817|2293->818|2544->1041|2573->1042|2606->1048|2687->1102|2715->1103|2935->1295|2964->1296|2997->1302|3032->1309|3061->1310|3095->1317|3189->1384|3217->1385|3259->1399|3288->1400|3322->1407|3381->1439|3409->1440|3451->1454|3480->1455|3514->1462|3563->1484|3591->1485|3633->1499|3662->1500|3696->1507|3731->1514|3760->1515|3795->1523|3848->1549|3876->1550|3924->1570|3953->1571|3997->1587|4103->1665|4132->1666|4166->1673|4194->1674|4238->1690|4267->1691|4301->1698|4381->1751|4409->1752|4442->1758|4470->1759|4573->1834|4602->1835|4635->1841|4670->1848|4699->1849|4733->1856|4825->1921|4853->1922|4895->1936|4924->1937|4958->1944|5016->1975|5044->1976|5086->1990|5115->1991|5149->1998|5198->2020|5226->2021|5268->2035|5297->2036|5331->2043|5366->2050|5395->2051|5430->2059|5488->2090|5516->2091|5564->2111|5593->2112|5637->2128|5743->2206|5772->2207|5806->2214|5834->2215|5877->2230|5906->2231|5940->2238|6064->2334|6093->2335|6138->2351|6168->2352|6203->2359|6283->2411|6312->2412|6346->2418|6375->2419|6409->2425|6438->2426|6469->2429|6498->2430|6530->2434|6559->2435|7095->2944|7109->2948|7141->2958|7463->3253|7513->3286|7554->3288|7588->3294|7633->3311|7656->3324|7691->3337|7721->3338|7773->3362|7796->3375|7827->3384|7857->3385|7909->3409|7932->3422|7963->3431|7993->3432|8044->3455|8067->3468|8094->3473|8124->3474|8175->3497|8198->3510|8229->3519|8259->3520|8313->3543|8346->3548
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|37->6|37->6|37->6|37->6|37->6|38->7|48->17|48->17|49->18|49->18|49->18|50->19|52->21|52->21|54->23|59->28|59->28|60->29|61->30|61->30|67->36|67->36|68->37|69->38|69->38|75->44|75->44|76->45|76->45|76->45|77->46|80->49|80->49|81->50|81->50|82->51|83->52|83->52|84->53|84->53|85->54|86->55|86->55|87->56|87->56|88->57|88->57|88->57|89->58|90->59|90->59|91->60|91->60|92->61|95->64|95->64|96->65|96->65|97->66|97->66|98->67|100->69|100->69|101->70|101->70|104->73|104->73|105->74|105->74|105->74|106->75|109->78|109->78|110->79|110->79|111->80|112->81|112->81|113->82|113->82|114->83|115->84|115->84|116->85|116->85|117->86|117->86|117->86|118->87|119->88|119->88|120->89|120->89|121->90|124->93|124->93|125->94|125->94|126->95|126->95|127->96|132->101|132->101|133->102|133->102|134->103|136->105|136->105|137->106|137->106|138->107|138->107|139->108|139->108|140->109|140->109|156->125|156->125|156->125|167->136|167->136|167->136|168->137|169->138|169->138|169->138|169->138|170->139|170->139|170->139|170->139|171->140|171->140|171->140|171->140|172->141|172->141|172->141|172->141|173->142|173->142|173->142|173->142|175->144|176->145
                  -- GENERATED --
              */
          