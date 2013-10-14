import play.*;
import play.mvc.*;

import static play.mvc.Results.*;
import views.html.*;




public class Global extends GlobalSettings {

  @Override
  public Result onHandlerNotFound(Http.RequestHeader request){
    return ok(
      price.render("0.00")
    );
  }

  @Override
  public Result onBadRequest(Http.RequestHeader request, String error){
    return ok(
      price.render("0.00")
    );
  }

  @Override
  public Result onError(Http.RequestHeader request, Throwable t){
    return ok(
      price.render("0.00")
    );
  }


}
