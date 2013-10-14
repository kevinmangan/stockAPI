package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;
import play.data.format.*;

@Entity
public class Request extends Model{

  @Id
  public Long id;

  @Required
  public String ticker;

  @Required
  public Float highestClose;

  @Required
  public Float lowestClose;


  public Request(String ticker, Float highestClose, Float lowestClose){
    this.ticker = ticker;
    this.highestClose = highestClose;
    this.lowestClose = lowestClose;
  }

  public static Model.Finder<Long,Request> find = new Finder<Long,Request>(
    Long.class, Request.class
  );

  public static void create(String ticker, Float highestClose, Float lowestClose) {
    Request request = new Request(ticker, highestClose, lowestClose);
    request.save();
  }


}
