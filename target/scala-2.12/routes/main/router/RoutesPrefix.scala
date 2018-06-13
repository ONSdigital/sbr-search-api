// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/urquha/Documents/Hello-World-x/sbr-search-api/conf/routes
// @DATE:Wed Jun 13 16:59:25 BST 2018


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
