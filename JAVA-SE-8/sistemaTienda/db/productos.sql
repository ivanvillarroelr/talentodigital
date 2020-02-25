CREATE TABLE tienda.productos
(
    "ID" integer NOT NULL,
    nombre_producto text NOT NULL,
    precio integer NOT NULL,
    stock integer NOT NULL,
    PRIMARY KEY ("ID")
)
WITH (
    OIDS = FALSE
);

ALTER TABLE tienda.productos
    OWNER to postgres;
COMMENT ON TABLE tienda.productos
    IS 'tabla que contiene el ID, nombre de producto, stock disponible y precio. ';