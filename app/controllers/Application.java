package controllers;

import play.*;
import play.mvc.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;


import views.html.*;
import models.*;

public class Application extends Controller {

    //BufferedReader br = null;
    //URL url = null;
    //URLConnection urlConn = null;
    //InputStreamReader  inStream = null;

    public static Result index() {
        return ok(index.render("Hello"));
    }

    public static Result getRecordHigh(String ticker) {

        BufferedReader br = null;
        URL url = null;
        URLConnection urlConn = null;
        InputStreamReader  inStream = null;

        String cvsSplitBy = ",";
        Float highestClose = Float.MIN_VALUE;
        Float lowestClose = Float.MAX_VALUE;
        boolean value;

        try {

          String line = "";
          url = new URL("http://ichart.yahoo.com/table.csv?s=" + ticker + "&e=.csv");
          urlConn = url.openConnection();
          inStream = new InputStreamReader(urlConn.getInputStream());
          br = new BufferedReader(inStream);


          while ((line = br.readLine()) != null) {


            // use comma as separator
            String[] entry = line.split(cvsSplitBy);

            // Skip first line of csv
            if(entry[4].equals("Close")){
              continue;
            }

            if (Float.parseFloat(entry[4]) > highestClose){
              highestClose = Float.parseFloat(entry[4]);
            }

            if (Float.parseFloat(entry[4]) < lowestClose){
              lowestClose = Float.parseFloat(entry[4]);
            }

          }

        } catch (FileNotFoundException e) {
            value = false;
            return badRequest(price.render("0.00"));
        } catch (IOException e) {
            value = false;
            return badRequest(price.render("0.00"));
        } finally {
          value = true;
            if (br != null) {
              try {
                br.close();
              } catch (IOException e) {
                  value = false;
                  return badRequest(price.render("0.00"));
              }
            }
        }

        // If valid
        if(value){
          Request.create(ticker, highestClose, lowestClose);
          NumberFormat formatter = new DecimalFormat("#0.00");
          return ok(price.render(formatter.format(highestClose)));
        } else{
            return badRequest(price.render("0.00"));
        }

    }

    public static Result getRecordLow(String ticker) {

        BufferedReader br = null;
        URL url = null;
        URLConnection urlConn = null;
        InputStreamReader  inStream = null;

        String line = "";
        String cvsSplitBy = ",";
        Float highestClose = Float.MIN_VALUE;
        Float lowestClose = Float.MAX_VALUE;
        boolean value;

        try {

          url = new URL("http://ichart.yahoo.com/table.csv?s=" + ticker + "&e=.csv");
          urlConn = url.openConnection();
          inStream = new InputStreamReader(urlConn.getInputStream());
          br = new BufferedReader(inStream);

          while ((line = br.readLine()) != null) {

            // use comma as separator
            String[] entry = line.split(cvsSplitBy);

            // Skip first line of csv
            if(entry[4].equals("Close")){
              continue;
            }

            if (Float.parseFloat(entry[4]) > highestClose){
              highestClose = Float.parseFloat(entry[4]);
            }

            if (Float.parseFloat(entry[4]) < lowestClose){
              lowestClose = Float.parseFloat(entry[4]);
            }

          }

        } catch (FileNotFoundException e) {
            value = false;
            return badRequest(price.render("0.00"));
        } catch (IOException e) {
            value = false;
            return badRequest(price.render("0.00"));
        } finally {
          value = true;
          if (br != null) {
            try {
              br.close();
            } catch (IOException e) {
                value = false;
                return badRequest(price.render("0.00"));
            }
          }
        }

        // If valid
        if(value){
          Request.create(ticker, highestClose, lowestClose);
          NumberFormat formatter = new DecimalFormat("#0.00");
          return ok(price.render(formatter.format(lowestClose)));
        } else{
            return badRequest(price.render("0.00"));
        }
    }

    public static Result getOpenPrice(String year, String month, String day, String ticker) {

        BufferedReader br = null;
        URL url = null;
        URLConnection urlConn = null;
        InputStreamReader  inStream = null;

        String line = "";
        String cvsSplitBy = ",";
        Float highestClose = Float.MIN_VALUE;
        Float lowestClose = Float.MAX_VALUE;
        Float openPrice = Float.MIN_VALUE;
        boolean value = false;
        boolean foundDate = false;

        try {

          url = new URL("http://ichart.yahoo.com/table.csv?s=" + ticker + "&e=.csv");
          urlConn = url.openConnection();
          inStream = new InputStreamReader(urlConn.getInputStream());
          br = new BufferedReader(inStream);

          while ((line = br.readLine()) != null) {

            // use comma as separator
            String[] entry = line.split(cvsSplitBy);

            // Skip first line of csv
            if(entry[4].equals("Close")){
              continue;
            }

            if (Float.parseFloat(entry[4]) > highestClose){
              highestClose = Float.parseFloat(entry[4]);
            }

            if (Float.parseFloat(entry[4]) < lowestClose){
              lowestClose = Float.parseFloat(entry[4]);
            }

            if (entry[0].equals(year + "-" + month + "-" + day)){
               openPrice = Float.parseFloat(entry[1]);
               foundDate = true;
            }

          }

        } catch (FileNotFoundException e) {
            value = false;
            return badRequest(price.render("0.00"));
        } catch (IOException e) {
            value = false;
            return badRequest(price.render("0.00"));
        } finally {
          value = true;
          if (br != null) {
            try {
              br.close();
            } catch (IOException e) {
                value = false;
                return badRequest(price.render("0.00"));
            }
          }
        }

        // If valid
        if(value && foundDate){
          Request.create(ticker, highestClose, lowestClose);
          NumberFormat formatter = new DecimalFormat("#0.00");
          return ok(price.render(formatter.format(openPrice)));
        } else{
            return badRequest(price.render("0.00"));
        }
    }

    public static Result getClosePrice(String year, String month, String day, String ticker) {

        BufferedReader br = null;
        URL url = null;
        URLConnection urlConn = null;
        InputStreamReader  inStream = null;

        String line = "";
        String cvsSplitBy = ",";
        Float highestClose = Float.MIN_VALUE;
        Float lowestClose = Float.MAX_VALUE;
        Float closePrice = Float.MIN_VALUE;
        boolean value2 = false;
        boolean foundDate2 = false;


        try {

          url = new URL("http://ichart.yahoo.com/table.csv?s=" + ticker + "&e=.csv");
          urlConn = url.openConnection();
          inStream = new InputStreamReader(urlConn.getInputStream());
          br = new BufferedReader(inStream);

          while ((line = br.readLine()) != null) {

            // use comma as separator
            String[] entry = line.split(cvsSplitBy);

            // Skip first line of csv
            if(entry[4].equals("Close")){
              continue;
            }

            if(Float.parseFloat(entry[4]) > highestClose){
              highestClose = Float.parseFloat(entry[4]);
            }

            if(Float.parseFloat(entry[4]) < lowestClose){
              lowestClose = Float.parseFloat(entry[4]);
            }

            if(entry[0].equals(year + "-" + month + "-" + day)){
               closePrice = Float.parseFloat(entry[4]);
               foundDate2 = true;
            }

          }

        } catch (FileNotFoundException e) {
            value2 = false;
            return badRequest(price.render("0.00"));
        } catch (IOException e) {
            value2 = false;
            return badRequest(price.render("0.00"));
        } finally {
          value2 = true;
          if (br != null) {
            try {
              br.close();
            } catch (IOException e) {
                value2 = false;
                return badRequest(price.render("0.00"));
            }
          }
        }

        // If valid
        if(value2 && foundDate2){
          Request.create(ticker, highestClose, lowestClose);
          NumberFormat formatter = new DecimalFormat("#0.00");
          return ok(price.render(formatter.format(closePrice)));
        } else{
            return badRequest(price.render("0.00"));
        }
    }

    public static Result getRequestTotal() {
        int requestCount = Request.find.findRowCount();
        return ok(price.render(Long.toString(requestCount)));
    }

    public static Result getMostRecentTicker() {
        Integer requestCount = Request.find.findRowCount();

        if(requestCount == 0){
          return badRequest(price.render("0.00"));
        }else{
          Request request = Request.find.byId(Long.valueOf(requestCount));
          String ticker = request.ticker;
          return ok(price.render(ticker));
        }
    }

    public static Result getXRequestedTicker(Integer requestNumber) {

        int requestCount = Request.find.findRowCount();

        if(requestNumber <=0 || requestNumber > requestCount){
          return badRequest(price.render("0.00"));
        }


        Request request = Request.find.byId(Long.valueOf(requestNumber));
        String ticker = request.ticker;

        return ok(price.render(ticker));
    }

    public static Result getHighestClose() {
        List<Request> requests = Request.find.all();
        Float highest = Float.MIN_VALUE;
        for(Request request : requests) {
          if(request.highestClose > highest){
            highest = request.highestClose;
          }
        }

        NumberFormat formatter = new DecimalFormat("#0.00");
        return ok(price.render(formatter.format(highest)));
    }

    public static Result getLowestClose() {
        List<Request> requests = Request.find.all();
        Float lowest = Float.MAX_VALUE;
        for(Request request : requests) {
          if(request.lowestClose < lowest){
            lowest = request.lowestClose;
          }
        }

        NumberFormat formatter = new DecimalFormat("#0.00");
        return ok(price.render(formatter.format(lowest)));
    }

}
