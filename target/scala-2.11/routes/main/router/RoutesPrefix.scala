
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ftahir/Documents/Masters/Agile/pacemakerplay/conf/routes
// @DATE:Thu Dec 29 01:11:44 GMT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
