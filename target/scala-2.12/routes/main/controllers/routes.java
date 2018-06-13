// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/urquha/Documents/Hello-World-x/sbr-search-api/conf/routes
// @DATE:Wed Jun 13 16:59:25 BST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseIndexController IndexController = new controllers.ReverseIndexController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseIndexController IndexController = new controllers.javascript.ReverseIndexController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
