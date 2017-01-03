
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ftahir/Documents/Masters/Agile/pacemakerplay/conf/routes
// @DATE:Thu Dec 29 01:11:44 GMT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Accounts_3: controllers.Accounts,
  // @LINE:13
  Dashboard_2: controllers.Dashboard,
  // @LINE:21
  PacemakerAPI_0: controllers.PacemakerAPI,
  // @LINE:41
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Accounts_3: controllers.Accounts,
    // @LINE:13
    Dashboard_2: controllers.Dashboard,
    // @LINE:21
    PacemakerAPI_0: controllers.PacemakerAPI,
    // @LINE:41
    Assets_1: controllers.Assets
  ) = this(errorHandler, Accounts_3, Dashboard_2, PacemakerAPI_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Accounts_3, Dashboard_2, PacemakerAPI_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Accounts.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Accounts.signup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Accounts.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Accounts.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Accounts.register()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate""", """controllers.Accounts.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """friends""", """controllers.Dashboard.friendList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """report""", """controllers.Dashboard.report()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.Dashboard.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Dashboard.uploadActivityForm()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitactivity""", """controllers.Dashboard.submitActivity()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users""", """controllers.PacemakerAPI.users()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users""", """controllers.PacemakerAPI.deleteAllUsers()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users""", """controllers.PacemakerAPI.createUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """id<[^/]+>""", """controllers.PacemakerAPI.user(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """id<[^/]+>""", """controllers.PacemakerAPI.deleteUser(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """id<[^/]+>""", """controllers.PacemakerAPI.updateUser(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """userId<[^/]+>/activities""", """controllers.PacemakerAPI.activities(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """userId<[^/]+>/activities""", """controllers.PacemakerAPI.createActivity(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """userId<[^/]+>/activities/""" + "$" + """activityId<[^/]+>""", """controllers.PacemakerAPI.activity(userId:Long, activityId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """userId<[^/]+>/activities/""" + "$" + """activityId<[^/]+>""", """controllers.PacemakerAPI.deleteActivity(userId:Long, activityId:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """userId<[^/]+>/activities/""" + "$" + """activityId<[^/]+>""", """controllers.PacemakerAPI.updateActivity(userId:Long, activityId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/activities/""" + "$" + """activityId<[^/]+>/locations""", """controllers.PacemakerAPI.createLocation(activityId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/activities/""" + "$" + """activityId<[^/]+>/locations""", """controllers.PacemakerAPI.Locations(activityId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/acitivities""", """controllers.PacemakerAPI.deleteAllLocations()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Accounts_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Accounts_index0_invoker = createInvoker(
    Accounts_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Accounts",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Accounts_signup1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Accounts_signup1_invoker = createInvoker(
    Accounts_3.signup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Accounts",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Accounts_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Accounts_login2_invoker = createInvoker(
    Accounts_3.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Accounts",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Accounts_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Accounts_logout3_invoker = createInvoker(
    Accounts_3.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Accounts",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Accounts_register4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Accounts_register4_invoker = createInvoker(
    Accounts_3.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Accounts",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Accounts_authenticate5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate")))
  )
  private[this] lazy val controllers_Accounts_authenticate5_invoker = createInvoker(
    Accounts_3.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Accounts",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """authenticate"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Dashboard_friendList6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("friends")))
  )
  private[this] lazy val controllers_Dashboard_friendList6_invoker = createInvoker(
    Dashboard_2.friendList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Dashboard",
      "friendList",
      Nil,
      "GET",
      """""",
      this.prefix + """friends"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Dashboard_report7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("report")))
  )
  private[this] lazy val controllers_Dashboard_report7_invoker = createInvoker(
    Dashboard_2.report(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Dashboard",
      "report",
      Nil,
      "GET",
      """""",
      this.prefix + """report"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Dashboard_index8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_Dashboard_index8_invoker = createInvoker(
    Dashboard_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Dashboard",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Dashboard_uploadActivityForm9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Dashboard_uploadActivityForm9_invoker = createInvoker(
    Dashboard_2.uploadActivityForm(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Dashboard",
      "uploadActivityForm",
      Nil,
      "GET",
      """""",
      this.prefix + """upload"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Dashboard_submitActivity10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitactivity")))
  )
  private[this] lazy val controllers_Dashboard_submitActivity10_invoker = createInvoker(
    Dashboard_2.submitActivity(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Dashboard",
      "submitActivity",
      Nil,
      "POST",
      """""",
      this.prefix + """submitactivity"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_PacemakerAPI_users11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_PacemakerAPI_users11_invoker = createInvoker(
    PacemakerAPI_0.users(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "users",
      Nil,
      "GET",
      """""",
      this.prefix + """api/users"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_PacemakerAPI_deleteAllUsers12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_PacemakerAPI_deleteAllUsers12_invoker = createInvoker(
    PacemakerAPI_0.deleteAllUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "deleteAllUsers",
      Nil,
      "DELETE",
      """""",
      this.prefix + """api/users"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_PacemakerAPI_createUser13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_PacemakerAPI_createUser13_invoker = createInvoker(
    PacemakerAPI_0.createUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "createUser",
      Nil,
      "POST",
      """""",
      this.prefix + """api/users"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_PacemakerAPI_user14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacemakerAPI_user14_invoker = createInvoker(
    PacemakerAPI_0.user(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "user",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """api/users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_PacemakerAPI_deleteUser15_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacemakerAPI_deleteUser15_invoker = createInvoker(
    PacemakerAPI_0.deleteUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "deleteUser",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """api/users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_PacemakerAPI_updateUser16_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacemakerAPI_updateUser16_invoker = createInvoker(
    PacemakerAPI_0.updateUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "updateUser",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """api/users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_PacemakerAPI_activities17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/activities")))
  )
  private[this] lazy val controllers_PacemakerAPI_activities17_invoker = createInvoker(
    PacemakerAPI_0.activities(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "activities",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """api/users/""" + "$" + """userId<[^/]+>/activities"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_PacemakerAPI_createActivity18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/activities")))
  )
  private[this] lazy val controllers_PacemakerAPI_createActivity18_invoker = createInvoker(
    PacemakerAPI_0.createActivity(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "createActivity",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """api/users/""" + "$" + """userId<[^/]+>/activities"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_PacemakerAPI_activity19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/activities/"), DynamicPart("activityId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacemakerAPI_activity19_invoker = createInvoker(
    PacemakerAPI_0.activity(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "activity",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """api/users/""" + "$" + """userId<[^/]+>/activities/""" + "$" + """activityId<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_PacemakerAPI_deleteActivity20_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/activities/"), DynamicPart("activityId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacemakerAPI_deleteActivity20_invoker = createInvoker(
    PacemakerAPI_0.deleteActivity(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "deleteActivity",
      Seq(classOf[Long], classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """api/users/""" + "$" + """userId<[^/]+>/activities/""" + "$" + """activityId<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_PacemakerAPI_updateActivity21_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/activities/"), DynamicPart("activityId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacemakerAPI_updateActivity21_invoker = createInvoker(
    PacemakerAPI_0.updateActivity(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "updateActivity",
      Seq(classOf[Long], classOf[Long]),
      "PUT",
      """""",
      this.prefix + """api/users/""" + "$" + """userId<[^/]+>/activities/""" + "$" + """activityId<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_PacemakerAPI_createLocation22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/activities/"), DynamicPart("activityId", """[^/]+""",true), StaticPart("/locations")))
  )
  private[this] lazy val controllers_PacemakerAPI_createLocation22_invoker = createInvoker(
    PacemakerAPI_0.createLocation(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "createLocation",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """api/activities/""" + "$" + """activityId<[^/]+>/locations"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_PacemakerAPI_Locations23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/activities/"), DynamicPart("activityId", """[^/]+""",true), StaticPart("/locations")))
  )
  private[this] lazy val controllers_PacemakerAPI_Locations23_invoker = createInvoker(
    PacemakerAPI_0.Locations(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "Locations",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """api/activities/""" + "$" + """activityId<[^/]+>/locations"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_PacemakerAPI_deleteAllLocations24_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/acitivities")))
  )
  private[this] lazy val controllers_PacemakerAPI_deleteAllLocations24_invoker = createInvoker(
    PacemakerAPI_0.deleteAllLocations(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacemakerAPI",
      "deleteAllLocations",
      Nil,
      "DELETE",
      """""",
      this.prefix + """api/acitivities"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Assets_at25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at25_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Accounts_index0_route(params) =>
      call { 
        controllers_Accounts_index0_invoker.call(Accounts_3.index())
      }
  
    // @LINE:8
    case controllers_Accounts_signup1_route(params) =>
      call { 
        controllers_Accounts_signup1_invoker.call(Accounts_3.signup())
      }
  
    // @LINE:9
    case controllers_Accounts_login2_route(params) =>
      call { 
        controllers_Accounts_login2_invoker.call(Accounts_3.login())
      }
  
    // @LINE:10
    case controllers_Accounts_logout3_route(params) =>
      call { 
        controllers_Accounts_logout3_invoker.call(Accounts_3.logout())
      }
  
    // @LINE:11
    case controllers_Accounts_register4_route(params) =>
      call { 
        controllers_Accounts_register4_invoker.call(Accounts_3.register())
      }
  
    // @LINE:12
    case controllers_Accounts_authenticate5_route(params) =>
      call { 
        controllers_Accounts_authenticate5_invoker.call(Accounts_3.authenticate())
      }
  
    // @LINE:13
    case controllers_Dashboard_friendList6_route(params) =>
      call { 
        controllers_Dashboard_friendList6_invoker.call(Dashboard_2.friendList())
      }
  
    // @LINE:14
    case controllers_Dashboard_report7_route(params) =>
      call { 
        controllers_Dashboard_report7_invoker.call(Dashboard_2.report())
      }
  
    // @LINE:15
    case controllers_Dashboard_index8_route(params) =>
      call { 
        controllers_Dashboard_index8_invoker.call(Dashboard_2.index())
      }
  
    // @LINE:16
    case controllers_Dashboard_uploadActivityForm9_route(params) =>
      call { 
        controllers_Dashboard_uploadActivityForm9_invoker.call(Dashboard_2.uploadActivityForm())
      }
  
    // @LINE:17
    case controllers_Dashboard_submitActivity10_route(params) =>
      call { 
        controllers_Dashboard_submitActivity10_invoker.call(Dashboard_2.submitActivity())
      }
  
    // @LINE:21
    case controllers_PacemakerAPI_users11_route(params) =>
      call { 
        controllers_PacemakerAPI_users11_invoker.call(PacemakerAPI_0.users())
      }
  
    // @LINE:22
    case controllers_PacemakerAPI_deleteAllUsers12_route(params) =>
      call { 
        controllers_PacemakerAPI_deleteAllUsers12_invoker.call(PacemakerAPI_0.deleteAllUsers())
      }
  
    // @LINE:23
    case controllers_PacemakerAPI_createUser13_route(params) =>
      call { 
        controllers_PacemakerAPI_createUser13_invoker.call(PacemakerAPI_0.createUser())
      }
  
    // @LINE:25
    case controllers_PacemakerAPI_user14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacemakerAPI_user14_invoker.call(PacemakerAPI_0.user(id))
      }
  
    // @LINE:26
    case controllers_PacemakerAPI_deleteUser15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacemakerAPI_deleteUser15_invoker.call(PacemakerAPI_0.deleteUser(id))
      }
  
    // @LINE:27
    case controllers_PacemakerAPI_updateUser16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacemakerAPI_updateUser16_invoker.call(PacemakerAPI_0.updateUser(id))
      }
  
    // @LINE:29
    case controllers_PacemakerAPI_activities17_route(params) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_PacemakerAPI_activities17_invoker.call(PacemakerAPI_0.activities(userId))
      }
  
    // @LINE:30
    case controllers_PacemakerAPI_createActivity18_route(params) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_PacemakerAPI_createActivity18_invoker.call(PacemakerAPI_0.createActivity(userId))
      }
  
    // @LINE:32
    case controllers_PacemakerAPI_activity19_route(params) =>
      call(params.fromPath[Long]("userId", None), params.fromPath[Long]("activityId", None)) { (userId, activityId) =>
        controllers_PacemakerAPI_activity19_invoker.call(PacemakerAPI_0.activity(userId, activityId))
      }
  
    // @LINE:33
    case controllers_PacemakerAPI_deleteActivity20_route(params) =>
      call(params.fromPath[Long]("userId", None), params.fromPath[Long]("activityId", None)) { (userId, activityId) =>
        controllers_PacemakerAPI_deleteActivity20_invoker.call(PacemakerAPI_0.deleteActivity(userId, activityId))
      }
  
    // @LINE:34
    case controllers_PacemakerAPI_updateActivity21_route(params) =>
      call(params.fromPath[Long]("userId", None), params.fromPath[Long]("activityId", None)) { (userId, activityId) =>
        controllers_PacemakerAPI_updateActivity21_invoker.call(PacemakerAPI_0.updateActivity(userId, activityId))
      }
  
    // @LINE:36
    case controllers_PacemakerAPI_createLocation22_route(params) =>
      call(params.fromPath[Long]("activityId", None)) { (activityId) =>
        controllers_PacemakerAPI_createLocation22_invoker.call(PacemakerAPI_0.createLocation(activityId))
      }
  
    // @LINE:37
    case controllers_PacemakerAPI_Locations23_route(params) =>
      call(params.fromPath[Long]("activityId", None)) { (activityId) =>
        controllers_PacemakerAPI_Locations23_invoker.call(PacemakerAPI_0.Locations(activityId))
      }
  
    // @LINE:38
    case controllers_PacemakerAPI_deleteAllLocations24_route(params) =>
      call { 
        controllers_PacemakerAPI_deleteAllLocations24_invoker.call(PacemakerAPI_0.deleteAllLocations())
      }
  
    // @LINE:41
    case controllers_Assets_at25_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at25_invoker.call(Assets_1.at(path, file))
      }
  }
}
