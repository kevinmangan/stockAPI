# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table request (
  id                        bigint not null,
  ticker                    varchar(255),
  highest_close             float,
  lowest_close              float,
  constraint pk_request primary key (id))
;

create sequence request_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists request;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists request_seq;

