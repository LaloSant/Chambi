-- Solo si se quieren hacer su base local

sudo apt install postgre

-- crea un nuevo usuario de linux administrador

sudo -i -u postgres

psql

#	CREATE DATABASE chambitas;
#	CREATE USER chambitas_user WITH ENCRYPTED PASSWORD 'INNOVATEC';
#	GRANT ALL PRIVILEGES ON DATABASE chambitas TO chambitas_user;

#\du	--lista los usuarios y privilegios

psql -U postgres -d recetario -h localhost
-- puerto 5432
--contraseña postgre

CREATE SCHEMA recetario_user AUTHORIZATION recetario_user;

psql -U recetario_user -d recetario -h localhost

-- Si el esquema se llama igual que el usuario, el esquema no se tiene que especificar

