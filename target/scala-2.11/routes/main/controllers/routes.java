
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ftahir/Documents/Masters/Agile/pacemakerplay/conf/routes
// @DATE:Thu Dec 29 01:11:44 GMT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReversePacemakerAPI PacemakerAPI = new controllers.ReversePacemakerAPI(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDashboard Dashboard = new controllers.ReverseDashboard(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAccounts Accounts = new controllers.ReverseAccounts(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReversePacemakerAPI PacemakerAPI = new controllers.javascript.ReversePacemakerAPI(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDashboard Dashboard = new controllers.javascript.ReverseDashboard(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAccounts Accounts = new controllers.javascript.ReverseAccounts(RoutesPrefix.byNamePrefix());
  }

}
