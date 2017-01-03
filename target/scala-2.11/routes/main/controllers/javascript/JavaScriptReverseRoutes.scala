
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ftahir/Documents/Masters/Agile/pacemakerplay/conf/routes
// @DATE:Thu Dec 29 01:11:44 GMT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:21
  class ReversePacemakerAPI(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def createLocation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.createLocation",
      """
        function(activityId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/activities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("activityId", activityId0) + "/locations"})
        }
      """
    )
  
    // @LINE:33
    def deleteActivity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.deleteActivity",
      """
        function(userId0,activityId1) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId0) + "/activities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("activityId", activityId1)})
        }
      """
    )
  
    // @LINE:23
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users"})
        }
      """
    )
  
    // @LINE:27
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.updateUser",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:25
    def user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.user",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:30
    def createActivity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.createActivity",
      """
        function(userId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId0) + "/activities"})
        }
      """
    )
  
    // @LINE:26
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.deleteUser",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:34
    def updateActivity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.updateActivity",
      """
        function(userId0,activityId1) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId0) + "/activities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("activityId", activityId1)})
        }
      """
    )
  
    // @LINE:21
    def users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.users",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users"})
        }
      """
    )
  
    // @LINE:22
    def deleteAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.deleteAllUsers",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users"})
        }
      """
    )
  
    // @LINE:29
    def activities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.activities",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId0) + "/activities"})
        }
      """
    )
  
    // @LINE:38
    def deleteAllLocations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.deleteAllLocations",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/acitivities"})
        }
      """
    )
  
    // @LINE:37
    def Locations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.Locations",
      """
        function(activityId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/activities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("activityId", activityId0) + "/locations"})
        }
      """
    )
  
    // @LINE:32
    def activity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacemakerAPI.activity",
      """
        function(userId0,activityId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId0) + "/activities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("activityId", activityId1)})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseDashboard(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def uploadActivityForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Dashboard.uploadActivityForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:13
    def friendList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Dashboard.friendList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "friends"})
        }
      """
    )
  
    // @LINE:14
    def report: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Dashboard.report",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "report"})
        }
      """
    )
  
    // @LINE:17
    def submitActivity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Dashboard.submitActivity",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submitactivity"})
        }
      """
    )
  
    // @LINE:15
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Dashboard.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseAccounts(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Accounts.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:10
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Accounts.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:11
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Accounts.register",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:12
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Accounts.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Accounts.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Accounts.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
