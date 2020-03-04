
/*
* Crea tabla personas
*/

create table ivillarroelr.personas
    (
    id int not null primary key,
    first_name varchar2(20) not null, 
    last_name varchar2(20) not null,
    age int not null
    );

/*
* Inserta filas en la tabla 
*/

insert into ivillarroelr.personas(id,first_name, last_name, age) values (1,'Ivan Felipe','Villarroel Ramirez', 31);

/*
* Cambia el nombre de columna ID a RUT
*/
alter table ivillarroelr.personas rename column id to rut;

/*
* Actualiza el valor de rut 
*/

update ivillarroelr.personas set rut=170411927 where rut=1;