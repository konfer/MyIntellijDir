create user MW_SYS identified by sys default tablespace "MWS_SYS";
start MWOra9i2_GrantPriviliges.sql MW_SYS;

create user MW_RTM identified by rtm default tablespace "MWS_RTM";
start MWOra9i2_GrantPriviliges.sql MW_RTM;

create user MW_APP identified by app default tablespace "MWS_APP";
start MWOra9i2_GrantPriviliges.sql MW_APP;

create user WSEC identified by WSEC default tablespace "WSEC_MAIN" temporary tablespace wsec_temp profile DEFAULT;
start MWOra9i2_Grantwsec.sql wsec;
exit;

