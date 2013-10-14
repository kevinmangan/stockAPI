// @SOURCE:/Users/kevinmangan/School/SoftwareEngineering/kmm2256_hw1/conf/routes
// @HASH:a112046eecf2061dd0fdb02bd457310f95ee1978
// @DATE:Wed Sep 04 19:21:51 EDT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_getRecordHigh1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getRecordHigh/"),DynamicPart("ticker", """[^/]+""",true))))
        

// @LINE:12
private[this] lazy val controllers_Application_getRecordLow2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getRecordLow/"),DynamicPart("ticker", """[^/]+""",true))))
        

// @LINE:15
private[this] lazy val controllers_Application_getOpenPrice3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getOpenPrice/"),DynamicPart("year", """[^/]+""",true),StaticPart("/"),DynamicPart("month", """[^/]+""",true),StaticPart("/"),DynamicPart("day", """[^/]+""",true),StaticPart("/"),DynamicPart("ticker", """[^/]+""",true))))
        

// @LINE:18
private[this] lazy val controllers_Application_getClosePrice4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getClosePrice/"),DynamicPart("year", """[^/]+""",true),StaticPart("/"),DynamicPart("month", """[^/]+""",true),StaticPart("/"),DynamicPart("day", """[^/]+""",true),StaticPart("/"),DynamicPart("ticker", """[^/]+""",true))))
        

// @LINE:21
private[this] lazy val controllers_Application_getRequestTotal5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getRequestTotal"))))
        

// @LINE:24
private[this] lazy val controllers_Application_getMostRecentTicker6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getMostRecentTicker"))))
        

// @LINE:27
private[this] lazy val controllers_Application_getXRequestedTicker7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getXRequestedTicker/"),DynamicPart("requestNumber", """[^/]+""",true))))
        

// @LINE:30
private[this] lazy val controllers_Application_getHighestClose8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getHighestClose"))))
        

// @LINE:33
private[this] lazy val controllers_Application_getLowestClose9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getLowestClose"))))
        

// @LINE:36
private[this] lazy val controllers_Assets_at10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getRecordHigh/$ticker<[^/]+>""","""controllers.Application.getRecordHigh(ticker:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getRecordLow/$ticker<[^/]+>""","""controllers.Application.getRecordLow(ticker:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getOpenPrice/$year<[^/]+>/$month<[^/]+>/$day<[^/]+>/$ticker<[^/]+>""","""controllers.Application.getOpenPrice(year:String, month:String, day:String, ticker:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getClosePrice/$year<[^/]+>/$month<[^/]+>/$day<[^/]+>/$ticker<[^/]+>""","""controllers.Application.getClosePrice(year:String, month:String, day:String, ticker:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getRequestTotal""","""controllers.Application.getRequestTotal()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getMostRecentTicker""","""controllers.Application.getMostRecentTicker()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getXRequestedTicker/$requestNumber<[^/]+>""","""controllers.Application.getXRequestedTicker(requestNumber:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getHighestClose""","""controllers.Application.getHighestClose()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getLowestClose""","""controllers.Application.getLowestClose()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_getRecordHigh1(params) => {
   call(params.fromPath[String]("ticker", None)) { (ticker) =>
        invokeHandler(controllers.Application.getRecordHigh(ticker), HandlerDef(this, "controllers.Application", "getRecordHigh", Seq(classOf[String]),"GET", """ Returns the record high close for the stock with the given ticker symbol. On error return 0.00.""", Routes.prefix + """getRecordHigh/$ticker<[^/]+>"""))
   }
}
        

// @LINE:12
case controllers_Application_getRecordLow2(params) => {
   call(params.fromPath[String]("ticker", None)) { (ticker) =>
        invokeHandler(controllers.Application.getRecordLow(ticker), HandlerDef(this, "controllers.Application", "getRecordLow", Seq(classOf[String]),"GET", """ Returns the record low close for the stock with the given ticker symbol. On error return 0.00.""", Routes.prefix + """getRecordLow/$ticker<[^/]+>"""))
   }
}
        

// @LINE:15
case controllers_Application_getOpenPrice3(params) => {
   call(params.fromPath[String]("year", None), params.fromPath[String]("month", None), params.fromPath[String]("day", None), params.fromPath[String]("ticker", None)) { (year, month, day, ticker) =>
        invokeHandler(controllers.Application.getOpenPrice(year, month, day, ticker), HandlerDef(this, "controllers.Application", "getOpenPrice", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """ Return the open price of the stock with the ticker parameter on the given date. On error return 0.00.""", Routes.prefix + """getOpenPrice/$year<[^/]+>/$month<[^/]+>/$day<[^/]+>/$ticker<[^/]+>"""))
   }
}
        

// @LINE:18
case controllers_Application_getClosePrice4(params) => {
   call(params.fromPath[String]("year", None), params.fromPath[String]("month", None), params.fromPath[String]("day", None), params.fromPath[String]("ticker", None)) { (year, month, day, ticker) =>
        invokeHandler(controllers.Application.getClosePrice(year, month, day, ticker), HandlerDef(this, "controllers.Application", "getClosePrice", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """ Return the close price of the stock with the ticker parameter on the given date. On error return 0.00.""", Routes.prefix + """getClosePrice/$year<[^/]+>/$month<[^/]+>/$day<[^/]+>/$ticker<[^/]+>"""))
   }
}
        

// @LINE:21
case controllers_Application_getRequestTotal5(params) => {
   call { 
        invokeHandler(controllers.Application.getRequestTotal(), HandlerDef(this, "controllers.Application", "getRequestTotal", Nil,"GET", """ Returns the total number of requests about stock prices, i.e. the above 4 routes.""", Routes.prefix + """getRequestTotal"""))
   }
}
        

// @LINE:24
case controllers_Application_getMostRecentTicker6(params) => {
   call { 
        invokeHandler(controllers.Application.getMostRecentTicker(), HandlerDef(this, "controllers.Application", "getMostRecentTicker", Nil,"GET", """ Returns the ticker about which information was requested.  If none then return 0.00.""", Routes.prefix + """getMostRecentTicker"""))
   }
}
        

// @LINE:27
case controllers_Application_getXRequestedTicker7(params) => {
   call(params.fromPath[Integer]("requestNumber", None)) { (requestNumber) =>
        invokeHandler(controllers.Application.getXRequestedTicker(requestNumber), HandlerDef(this, "controllers.Application", "getXRequestedTicker", Seq(classOf[Integer]),"GET", """ Returns the requestNumberth ticker requested.  If request number is 2 then return the second ticker requested.""", Routes.prefix + """getXRequestedTicker/$requestNumber<[^/]+>"""))
   }
}
        

// @LINE:30
case controllers_Application_getHighestClose8(params) => {
   call { 
        invokeHandler(controllers.Application.getHighestClose(), HandlerDef(this, "controllers.Application", "getHighestClose", Nil,"GET", """ Returns the highest close of any stock requested.  On error return 0.00""", Routes.prefix + """getHighestClose"""))
   }
}
        

// @LINE:33
case controllers_Application_getLowestClose9(params) => {
   call { 
        invokeHandler(controllers.Application.getLowestClose(), HandlerDef(this, "controllers.Application", "getLowestClose", Nil,"GET", """ Returns the lowest close of any stock requested.  On error return 0.00""", Routes.prefix + """getLowestClose"""))
   }
}
        

// @LINE:36
case controllers_Assets_at10(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        