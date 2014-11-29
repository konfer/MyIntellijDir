@echo OFF
:begin
   @set input=
   @set /p input=请输入要导入数据的日期（格式为yyyyMMdd）:
   if exist sgccwsyj_db_kf_back.rar goto yes
   if not exist sgccwsyj_db_kf_back.rar goto no
:yes
  echo 解压缩数据库备份文
  echo 重建平台用户
  sqlplus system/sys@DB @MWOra9i2_CreateUsers.sql
  echo 将开发库内容导入测试库
  @imp system/sys@DB file=E:\HN_DB\yjzh.dmp log=yjzh_imp.log Full=y
  sqlplus system/sys@DB @MWOra9i2_Grantsystowsec.sql
  echo 删除解压得到的文件
  del yjzh.*
  echo 数据导入完毕
  @goto end
:no
  echo 对不起，没有您所输入日期的数据或您所输入日期格式不正确！
  @goto end
:end
  pause
 

 ---------------------------
服务
---------------------------
Windows 不能在 本地计算机 启动 OracleDBConsoleDB。有关更多信息，查阅系统事件日志。如果这是非 Microsoft 服务，请与服务厂商联系，并参考特定服务错误代码 2。
---------------------------
确定   
---------------------------
