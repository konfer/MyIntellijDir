/*------------------------------------------------------------------------------
  Summary:  This file grant common priviliges to MarahWood database user explictly.
  Prerequests:
    The database user exists.
  Parameters:
    1  --   The database user that will be granted with.
  Examples:
    start MWOra9i2_GrantPriviliges.sql MW_SYS
------------------------------------------------------------------------------*/
grant ALTER ANY CLUSTER to &1 with admin option;
grant ALTER ANY DIMENSION to &1 with admin option;
grant ALTER ANY INDEX to &1 with admin option;
grant ALTER ANY INDEXTYPE to &1 with admin option;
grant ALTER ANY LIBRARY to &1 with admin option;
grant ALTER ANY OUTLINE to &1 with admin option;
grant ALTER ANY PROCEDURE to &1 with admin option;
grant ALTER ANY ROLE to &1 with admin option;
grant ALTER ANY SEQUENCE to &1 with admin option;
grant ALTER ANY SNAPSHOT to &1 with admin option;
grant ALTER ANY TABLE to &1 with admin option;
grant ALTER ANY TRIGGER to &1 with admin option;
grant ALTER ANY TYPE to &1 with admin option;
grant ALTER DATABASE to &1 with admin option;
grant ALTER PROFILE to &1 with admin option;
grant ALTER RESOURCE COST to &1 with admin option;
grant ALTER ROLLBACK SEGMENT to &1 with admin option;
grant ALTER SESSION to &1 with admin option;
grant ALTER SYSTEM to &1 with admin option;
grant ALTER TABLESPACE to &1 with admin option;
grant ALTER USER to &1 with admin option;
grant ANALYZE ANY to &1 with admin option;
grant AUDIT ANY to &1 with admin option;
grant AUDIT SYSTEM to &1 with admin option;
grant BACKUP ANY TABLE to &1 with admin option;
grant BECOME USER to &1 with admin option;
grant COMMENT ANY TABLE to &1 with admin option;
grant CREATE ANY CLUSTER to &1 with admin option;
grant CREATE ANY CONTEXT to &1 with admin option;
grant CREATE ANY DIMENSION to &1 with admin option;
grant CREATE ANY DIRECTORY to &1 with admin option;
grant CREATE ANY INDEX to &1 with admin option;
grant CREATE ANY INDEXTYPE to &1 with admin option;
grant CREATE ANY LIBRARY to &1 with admin option;
grant CREATE ANY OUTLINE to &1 with admin option;
grant CREATE ANY PROCEDURE to &1 with admin option;
grant CREATE ANY SEQUENCE to &1 with admin option;
grant CREATE ANY SNAPSHOT to &1 with admin option;
grant CREATE ANY SYNONYM to &1 with admin option;
grant CREATE ANY TABLE to &1 with admin option;
grant CREATE ANY TRIGGER to &1 with admin option;
grant CREATE ANY TYPE to &1 with admin option;
grant CREATE ANY VIEW to &1 with admin option;
grant CREATE CLUSTER to &1 with admin option;
grant CREATE DATABASE LINK to &1 with admin option;
grant CREATE DIMENSION to &1 with admin option;
grant CREATE INDEXTYPE to &1 with admin option;
grant CREATE LIBRARY to &1 with admin option;
grant CREATE PROCEDURE to &1 with admin option;
grant CREATE PROFILE to &1 with admin option;
grant CREATE PUBLIC DATABASE LINK to &1 with admin option;
grant CREATE PUBLIC SYNONYM to &1 with admin option;
grant CREATE ROLE to &1 with admin option;
grant CREATE ROLLBACK SEGMENT to &1 with admin option;
grant CREATE SEQUENCE to &1 with admin option;
grant CREATE SESSION to &1 with admin option;
grant CREATE SNAPSHOT to &1 with admin option;
grant CREATE SYNONYM to &1 with admin option;
grant CREATE TABLE to &1 with admin option;
grant CREATE TABLESPACE to &1 with admin option;
grant CREATE TRIGGER to &1 with admin option;
grant CREATE TYPE to &1 with admin option;
grant CREATE USER to &1 with admin option;
grant CREATE VIEW to &1 with admin option;
grant DEBUG ANY PROCEDURE to &1 with admin option;
grant DEBUG CONNECT SESSION to &1 with admin option;
grant DELETE ANY TABLE to &1 with admin option;
grant DROP ANY CLUSTER to &1 with admin option;
grant DROP ANY CONTEXT to &1 with admin option;
grant DROP ANY DIMENSION to &1 with admin option;
grant DROP ANY DIRECTORY to &1 with admin option;
grant DROP ANY INDEXTYPE to &1 with admin option;
grant DROP ANY LIBRARY to &1 with admin option;
grant DROP ANY OUTLINE to &1 with admin option;
grant DROP ANY PROCEDURE to &1 with admin option;
grant DROP ANY ROLE to &1 with admin option;
grant DROP ANY SEQUENCE to &1 with admin option;
grant DROP ANY SNAPSHOT to &1 with admin option;
grant DROP ANY SYNONYM to &1 with admin option;
grant DROP ANY TABLE to &1 with admin option;
grant DROP ANY TRIGGER to &1 with admin option;
grant DROP ANY TYPE to &1 with admin option;
grant DROP ANY VIEW to &1 with admin option;
grant DROP PROFILE to &1 with admin option;
grant DROP PUBLIC DATABASE LINK to &1 with admin option;
grant DROP PUBLIC SYNONYM to &1 with admin option;
grant DROP ROLLBACK SEGMENT to &1 with admin option;
grant DROP TABLESPACE to &1 with admin option;
grant DROP USER to &1 with admin option;
grant EXECUTE ANY INDEXTYPE to &1 with admin option;
grant EXECUTE ANY LIBRARY to &1 with admin option;
grant EXECUTE ANY PROCEDURE to &1 with admin option;
grant EXECUTE ANY TYPE to &1 with admin option;
grant FORCE ANY TRANSACTION to &1 with admin option;
grant FORCE TRANSACTION to &1 with admin option;
grant GLOBAL QUERY REWRITE to &1 with admin option;
grant grant ANY OBJECT PRIVILEGE to &1 with admin option;
grant grant ANY PRIVILEGE to &1 with admin option;
grant grant ANY ROLE to &1 with admin option;
grant INSERT ANY TABLE to &1 with admin option;
grant LOCK ANY TABLE to &1 with admin option;
grant MANAGE TABLESPACE to &1 with admin option;
grant ON COMMIT REFRESH to &1 with admin option;
grant QUERY REWRITE to &1 with admin option;
grant RESTRICTED SESSION to &1 with admin option;
grant SELECT ANY DICTIONARY to &1 with admin option;
grant SELECT ANY SEQUENCE to &1 with admin option;
grant SELECT ANY TABLE to &1 with admin option;
grant UNDER ANY TABLE to &1 with admin option;
grant UNDER ANY TYPE to &1 with admin option;
grant UNDER ANY VIEW to &1 with admin option;
grant UNLIMITED TABLESPACE to &1 with admin option;
grant UPDATE ANY TABLE to &1 with admin option;
