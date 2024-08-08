CREATE TABLE cl_pais (
	pa_pais smallint NOT NULL,
	pa_descripcion VARCHAR(64) NOT NULL,
	pa_abreviatura char(3) NOT NULL,
	pa_nacionalidad VARCHAR(64) NOT NULL,
	pa_estado char(1) NULL,
	pa_continente char(3) NOT NULL,
	pa_pais_super char(3) NULL
);
CREATE UNIQUE INDEX cl_pais_Key ON cl_pais (pa_pais);