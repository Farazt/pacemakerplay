
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ftahir/Documents/Masters/Agile/pacemakerplay/conf/routes
// @DATE:Thu Dec 29 01:11:44 GMT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:21
  class ReversePacemakerAPI(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def createLocation(activityId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/activities/" + implicitly[PathBindable[Long]].unbind("activityId", activityId) + "/locations")
    }
  
    // @LINE:33
    def deleteActivity(userId:Long, activityId:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/activities/" + implicitly[PathBindable[Long]].unbind("activityId", activityId))
    }
  
    // @LINE:23
    def createUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/users")
    }
  
    // @LINE:27
    def updateUser(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:25
    def user(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:30
    def createActivity(userId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/activities")
    }
  
    // @LINE:26
    def deleteUser(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:34
    def updateActivity(userId:Long, activityId:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/activities/" + implicitly[PathBindable[Long]].unbind("activityId", activityId))
    }
  
    // @LINE:21
    def users(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/users")
    }
  
    // @LINE:22
    def deleteAllUsers(): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "api/users")
    }
  
    // @LINE:29
    def activities(userId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/activities")
    }
  
    // @LINE:38
    def deleteAllLocations(): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "api/acitivities")
    }
  
    // @LINE:37
    def Locations(activityId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/activities/" + implicitly[PathBindable[Long]].unbind("activityId", activityId) + "/locations")
    }
  
    // @LINE:32
    def activity(userId:Long, activityId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/users/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/activities/" + implicitly[PathBindable[Long]].unbind("activityId", activityId))
    }
  
  }

  // @LINE:41
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:13
  class ReverseDashboard(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def uploadActivityForm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "upload")
    }
  
    // @LINE:13
    def friendList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "friends")
    }
  
    // @LINE:14
    def report(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "report")
    }
  
    // @LINE:17
    def submitActivity(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "submitactivity")
    }
  
    // @LINE:15
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
  }

  // @LINE:7
  class ReverseAccounts(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def signup(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:10
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:11
    def register(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:12
    def authenticate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "authenticate")
    }
  
    // @LINE:7
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
