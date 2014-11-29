/*------------------------------------------------------------------------------
创建将mw_sys的权限赋予wsec
------------------------------------------------------------------------------*/
grant select ,insert ,update ,delete on wsec.MWT_PD_EMPS to mw_sys;
grant select ,insert ,update ,delete on wsec.MWT_IS_USER to mw_sys;
grant select ,insert ,update ,delete on wsec.MWT_PD_DEPS to mw_sys;
exit;