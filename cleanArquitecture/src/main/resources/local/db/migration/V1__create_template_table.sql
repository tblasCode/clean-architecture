create table template(
  id Long not null,
  titular varchar(200),
  descripcion text,
  coord_x float not null,
  coord_y float not null,
  fecha_template TIMESTAMP,
  PRIMARY KEY (id)
 );

 create sequence public.seq_id
   as integer;