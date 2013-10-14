// @SOURCE:/Users/kevinmangan/School/SoftwareEngineering/kmm2256_hw1/conf/routes
// @HASH:a112046eecf2061dd0fdb02bd457310f95ee1978
// @DATE:Wed Sep 04 19:21:51 EDT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:33
def getLowestClose(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getLowestClose")
}
                                                

// @LINE:24
def getMostRecentTicker(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getMostRecentTicker")
}
                                                

// @LINE:15
def getOpenPrice(year:String, month:String, day:String, ticker:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getOpenPrice/" + implicitly[PathBindable[String]].unbind("year", dynamicString(year)) + "/" + implicitly[PathBindable[String]].unbind("month", dynamicString(month)) + "/" + implicitly[PathBindable[String]].unbind("day", dynamicString(day)) + "/" + implicitly[PathBindable[String]].unbind("ticker", dynamicString(ticker)))
}
                                                

// @LINE:12
def getRecordLow(ticker:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getRecordLow/" + implicitly[PathBindable[String]].unbind("ticker", dynamicString(ticker)))
}
                                                

// @LINE:18
def getClosePrice(year:String, month:String, day:String, ticker:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getClosePrice/" + implicitly[PathBindable[String]].unbind("year", dynamicString(year)) + "/" + implicitly[PathBindable[String]].unbind("month", dynamicString(month)) + "/" + implicitly[PathBindable[String]].unbind("day", dynamicString(day)) + "/" + implicitly[PathBindable[String]].unbind("ticker", dynamicString(ticker)))
}
                                                

// @LINE:27
def getXRequestedTicker(requestNumber:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getXRequestedTicker/" + implicitly[PathBindable[Integer]].unbind("requestNumber", requestNumber))
}
                                                

// @LINE:21
def getRequestTotal(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getRequestTotal")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:30
def getHighestClose(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getHighestClose")
}
                                                

// @LINE:9
def getRecordHigh(ticker:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getRecordHigh/" + implicitly[PathBindable[String]].unbind("ticker", dynamicString(ticker)))
}
                                                
    
}
                          

// @LINE:36
class ReverseAssets {
    

// @LINE:36
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:33
def getLowestClose : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getLowestClose",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getLowestClose"})
      }
   """
)
                        

// @LINE:24
def getMostRecentTicker : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getMostRecentTicker",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getMostRecentTicker"})
      }
   """
)
                        

// @LINE:15
def getOpenPrice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getOpenPrice",
   """
      function(year,month,day,ticker) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getOpenPrice/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("year", encodeURIComponent(year)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("month", encodeURIComponent(month)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("day", encodeURIComponent(day)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ticker", encodeURIComponent(ticker))})
      }
   """
)
                        

// @LINE:12
def getRecordLow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getRecordLow",
   """
      function(ticker) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getRecordLow/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ticker", encodeURIComponent(ticker))})
      }
   """
)
                        

// @LINE:18
def getClosePrice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getClosePrice",
   """
      function(year,month,day,ticker) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getClosePrice/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("year", encodeURIComponent(year)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("month", encodeURIComponent(month)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("day", encodeURIComponent(day)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ticker", encodeURIComponent(ticker))})
      }
   """
)
                        

// @LINE:27
def getXRequestedTicker : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getXRequestedTicker",
   """
      function(requestNumber) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getXRequestedTicker/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("requestNumber", requestNumber)})
      }
   """
)
                        

// @LINE:21
def getRequestTotal : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getRequestTotal",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getRequestTotal"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:30
def getHighestClose : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getHighestClose",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getHighestClose"})
      }
   """
)
                        

// @LINE:9
def getRecordHigh : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getRecordHigh",
   """
      function(ticker) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getRecordHigh/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ticker", encodeURIComponent(ticker))})
      }
   """
)
                        
    
}
              

// @LINE:36
class ReverseAssets {
    

// @LINE:36
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:33
def getLowestClose(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getLowestClose(), HandlerDef(this, "controllers.Application", "getLowestClose", Seq(), "GET", """ Returns the lowest close of any stock requested.  On error return 0.00""", _prefix + """getLowestClose""")
)
                      

// @LINE:24
def getMostRecentTicker(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getMostRecentTicker(), HandlerDef(this, "controllers.Application", "getMostRecentTicker", Seq(), "GET", """ Returns the ticker about which information was requested.  If none then return 0.00.""", _prefix + """getMostRecentTicker""")
)
                      

// @LINE:15
def getOpenPrice(year:String, month:String, day:String, ticker:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getOpenPrice(year, month, day, ticker), HandlerDef(this, "controllers.Application", "getOpenPrice", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """ Return the open price of the stock with the ticker parameter on the given date. On error return 0.00.""", _prefix + """getOpenPrice/$year<[^/]+>/$month<[^/]+>/$day<[^/]+>/$ticker<[^/]+>""")
)
                      

// @LINE:12
def getRecordLow(ticker:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getRecordLow(ticker), HandlerDef(this, "controllers.Application", "getRecordLow", Seq(classOf[String]), "GET", """ Returns the record low close for the stock with the given ticker symbol. On error return 0.00.""", _prefix + """getRecordLow/$ticker<[^/]+>""")
)
                      

// @LINE:18
def getClosePrice(year:String, month:String, day:String, ticker:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getClosePrice(year, month, day, ticker), HandlerDef(this, "controllers.Application", "getClosePrice", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """ Return the close price of the stock with the ticker parameter on the given date. On error return 0.00.""", _prefix + """getClosePrice/$year<[^/]+>/$month<[^/]+>/$day<[^/]+>/$ticker<[^/]+>""")
)
                      

// @LINE:27
def getXRequestedTicker(requestNumber:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getXRequestedTicker(requestNumber), HandlerDef(this, "controllers.Application", "getXRequestedTicker", Seq(classOf[Integer]), "GET", """ Returns the requestNumberth ticker requested.  If request number is 2 then return the second ticker requested.""", _prefix + """getXRequestedTicker/$requestNumber<[^/]+>""")
)
                      

// @LINE:21
def getRequestTotal(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getRequestTotal(), HandlerDef(this, "controllers.Application", "getRequestTotal", Seq(), "GET", """ Returns the total number of requests about stock prices, i.e. the above 4 routes.""", _prefix + """getRequestTotal""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:30
def getHighestClose(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getHighestClose(), HandlerDef(this, "controllers.Application", "getHighestClose", Seq(), "GET", """ Returns the highest close of any stock requested.  On error return 0.00""", _prefix + """getHighestClose""")
)
                      

// @LINE:9
def getRecordHigh(ticker:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getRecordHigh(ticker), HandlerDef(this, "controllers.Application", "getRecordHigh", Seq(classOf[String]), "GET", """ Returns the record high close for the stock with the given ticker symbol. On error return 0.00.""", _prefix + """getRecordHigh/$ticker<[^/]+>""")
)
                      
    
}
                          

// @LINE:36
class ReverseAssets {
    

// @LINE:36
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      