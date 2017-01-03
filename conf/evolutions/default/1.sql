# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table my_activity (
  id                            bigint not null,
  user_id                       bigint not null,
  activity_type                 varchar(255),
  location                      varchar(255),
  date                          varchar(255),
  distance                      NUMERIC,
  duration                      NUMERIC,
  constraint pk_my_activity primary key (id)
);
create sequence my_activity_seq;

create table location (
  id                            bigint not null,
  activity_id                   bigint not null,
  latitude                      NUMERIC,
  longitude                     NUMERIC,
  constraint pk_location primary key (id)
);
create sequence location_seq;

create table my_user (
  id                            bigint not null,
  firstname                     varchar(255),
  lastname                      varchar(255),
  email                         varchar(255),
  password                      varchar(255),
  constraint pk_my_user primary key (id)
);
create sequence my_user_seq;

alter table my_activity add constraint fk_my_activity_user_id foreign key (user_id) references my_user (id) on delete restrict on update restrict;
create index ix_my_activity_user_id on my_activity (user_id);

alter table location add constraint fk_location_activity_id foreign key (activity_id) references my_activity (id) on delete restrict on update restrict;
create index ix_location_activity_id on location (activity_id);


# --- !Downs

alter table my_activity drop constraint if exists fk_my_activity_user_id;
drop index if exists ix_my_activity_user_id;

alter table location drop constraint if exists fk_location_activity_id;
drop index if exists ix_location_activity_id;

drop table if exists my_activity;
drop sequence if exists my_activity_seq;

drop table if exists location;
drop sequence if exists location_seq;

drop table if exists my_user;
drop sequence if exists my_user_seq;

