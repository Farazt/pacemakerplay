
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object accounts_signup_Scope0 {
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

class accounts_signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Signup")/*2.16*/ {_display_(Seq[Any](format.raw/*2.18*/("""
  """),_display_(/*3.4*/welcome_menu()),format.raw/*3.18*/("""

	"""),format.raw/*5.2*/("""<div class="main">
		<div class="wrapper">
		
			<div id="login" class="row" style="margin: auto">
				<form action="/register" method="POST">
					<div class="large-12 columns text-center">
						<h3 class="text-center">Signup to Pacemaker</h3>
					<input type="text" placeholder="First Name" class="border-radius-top" name="firstname" required/>
				    <input type="text" placeholder="Last Name" class="no-radius" name="lastname" required/>
				    <input type="email" placeholder="Email" class="no-radius" name="email"  required/>
				    <input type="password" placeholder="Password" class="no-radius" name="password" required/>
				    <button  class="button small border-radius-bottom" style="width: 100%">Register</button>
					 </div>
				</form>
			</div>
		</div>
	</div>
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
object accounts_signup extends accounts_signup_Scope0.accounts_signup
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 18:47:54 GMT 2016
                  SOURCE: /home/ftahir/Documents/Masters/Agile/pacemakerplay/app/views/accounts_signup.scala.html
                  HASH: eb7a9d98653ae614e75131ba312c9e125ffcf52e
                  MATRIX: 847->2|869->16|908->18|937->22|971->36|1000->39
                  LINES: 32->2|32->2|32->2|33->3|33->3|35->5
                  -- GENERATED --
              */
          