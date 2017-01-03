
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object accounts_login_Scope0 {
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

class accounts_login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Accounts.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Accounts.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""

  """),_display_(/*5.4*/welcome_menu()),format.raw/*5.18*/("""
  """),format.raw/*6.3*/("""<div class="main">
		<div class="wrapper">
			<div id="login" class="row" style="margin: auto">
				<form action="/authenticate" method="POST">
					<div class="large-12 columns text-center">
						<h3 class="text-center">Login to Pacemaker</h3>
							"""),_display_(/*12.9*/if(form.hasGlobalErrors)/*12.33*/ {_display_(Seq[Any](format.raw/*12.35*/("""
							    """),format.raw/*13.12*/("""<div data-alert class="alert-box alert radius">
							        """),_display_(/*14.17*/form/*14.21*/.globalError.message),format.raw/*14.41*/("""
							        """),format.raw/*15.16*/("""<a href="#" class="close">&times;</a>
							    </div>
							""")))}),format.raw/*17.9*/("""
				    """),format.raw/*18.9*/("""<input type="text" placeholder="Email" class="no-radius" name="email" />
				    <input type="password" placeholder="Password" class="no-radius" name="password" />
				    <button  class="button small border-radius-bottom" style="width: 100%">Login</button>
					 </div>
				</form>
			</div>
		</div>
	</div>
    
 """)))}))
      }
    }
  }

  def render(form:Form[Accounts.Login]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[Accounts.Login]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


}

/**/
object accounts_login extends accounts_login_Scope0.accounts_login
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 18:47:54 GMT 2016
                  SOURCE: /home/ftahir/Documents/Masters/Agile/pacemakerplay/app/views/accounts_login.scala.html
                  HASH: dfee27d4ff2901e95a5231337e38efd8a3600bf0
                  MATRIX: 777->1|900->29|928->32|949->45|988->47|1018->52|1052->66|1081->69|1361->323|1394->347|1434->349|1474->361|1565->425|1578->429|1619->449|1663->465|1757->529|1793->538
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|37->6|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|48->17|49->18
                  -- GENERATED --
              */
          