
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object friends_follow_Scope0 {
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

class friends_follow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[User],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[User], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main("follow")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
	"""),_display_(/*4.3*/dashboard_menu()),format.raw/*4.19*/("""
    
 """),format.raw/*6.2*/("""<script class="init">
	$(document).ready(function() """),format.raw/*7.31*/("""{"""),format.raw/*7.32*/("""
	"""),format.raw/*8.2*/("""$('#users').dataTable();
	"""),format.raw/*9.2*/("""}"""),format.raw/*9.3*/(""" """),format.raw/*9.4*/(""");
	</script>
 
  <div class="row">
  	"""),_display_(/*13.5*/if(flash.contains("success"))/*13.34*/ {_display_(Seq[Any](format.raw/*13.36*/("""
				    """),format.raw/*14.9*/("""<div data-alert class="alert-box success radius">
				        """),_display_(/*15.14*/flash/*15.19*/.get("success")),format.raw/*15.34*/("""
				        """),format.raw/*16.13*/("""<a href="#" class="close">&times;</a>
				    </div>
		""")))}),format.raw/*18.4*/("""	
		
			"""),format.raw/*20.4*/("""<div class="small-12 large-12 columns">
			<h2>"""),_display_(/*21.9*/user/*21.13*/.firstname),format.raw/*21.23*/(""" """),_display_(/*21.25*/user/*21.29*/.lastname),format.raw/*21.38*/("""'s Can Follow</h2>
			<table id="userActivities" class="display" cellspacing="0" width="100%">
				<thead>
					<tr>
						<th width="150">Name</th>
            			<th width="150">Email</th>
            		
            		</tr>
				</thead>
				<tfoot>
					<tr>
						<th width="150">Users</th>
            			<th width="150">Email</th>
            		</tr>
				</foot>
				<tbody>
					"""),_display_(/*37.7*/for(i <- 0 until users.size) yield /*37.35*/ {_display_(Seq[Any](format.raw/*37.37*/("""
					"""),format.raw/*38.6*/("""<tr>
					<td> """),_display_(/*39.12*/users(i)/*39.20*/.firstname),format.raw/*39.30*/(""" """),format.raw/*39.31*/("""</td> 
					<td> """),_display_(/*40.12*/users(i)/*40.20*/.email),format.raw/*40.26*/(""" """),format.raw/*40.27*/("""</td> 
	        		</tr>
					""")))}),format.raw/*42.7*/("""
				"""),format.raw/*43.5*/("""</tbody>
			</table>
		
		
		<form >
					<div class="large-12 columns text-center">
						<h3 class="text-center">Enter the Email Id to follow</h3>
					<input type="text" placeholder="Email" class="border-radius-top" name="email" required/>
				   
				    <button  class="button small border-radius-bottom" style="width: 100%">Follow</button>
					 </div>
				</form>
		</div><br>
		
	</div>
	""")))}))
      }
    }
  }

  def render(users:List[User],user:User): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[User],User) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


}

/**/
object friends_follow extends friends_follow_Scope0.friends_follow
              /*
                  -- GENERATED --
                  DATE: Thu Dec 29 01:01:30 GMT 2016
                  SOURCE: /home/ftahir/Documents/Masters/Agile/pacemakerplay/app/views/friends_follow.scala.html
                  HASH: 22cdafc0eb58d822911f2bf6e3450bdfbac8919e
                  MATRIX: 772->1|898->32|926->35|948->49|987->51|1015->54|1051->70|1084->77|1163->129|1191->130|1219->132|1271->158|1298->159|1325->160|1391->200|1429->229|1469->231|1505->240|1595->303|1609->308|1645->323|1686->336|1772->392|1807->400|1881->448|1894->452|1925->462|1954->464|1967->468|1997->477|2409->863|2453->891|2493->893|2526->899|2569->915|2586->923|2617->933|2646->934|2691->952|2708->960|2735->966|2764->967|2824->997|2856->1002
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|37->6|38->7|38->7|39->8|40->9|40->9|40->9|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|49->18|51->20|52->21|52->21|52->21|52->21|52->21|52->21|68->37|68->37|68->37|69->38|70->39|70->39|70->39|70->39|71->40|71->40|71->40|71->40|73->42|74->43
                  -- GENERATED --
              */
          