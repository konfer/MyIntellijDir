/*------------------------------------------------------------------------------
创建非dba用户的wsec权限
------------------------------------------------------------------------------*/
grant connect to WSEC with admin option;
grant resource to WSEC with admin option;
grant mgmt_user to WSEC with admin option;
grant unlimited tablespace to WSEC with admin option;
grant create any table to WSEC with admin option;
grant create any view to WSEC with admin option;
grant create any sequence to WSEC with admin option;
grant create any trigger to WSEC with admin option;
grant create any procedure to WSEC with admin option;