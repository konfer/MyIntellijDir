@echo OFF
:begin
   @set input=
   @set /p input=������Ҫ�������ݵ����ڣ���ʽΪyyyyMMdd��:
   if exist sgccwsyj_db_kf_back.rar goto yes
   if not exist sgccwsyj_db_kf_back.rar goto no
:yes
  echo ��ѹ�����ݿⱸ����
  echo �ؽ�ƽ̨�û�
  sqlplus system/sys@DB @MWOra9i2_CreateUsers.sql
  echo �����������ݵ�����Կ�
  @imp system/sys@DB file=E:\HN_DB\yjzh.dmp log=yjzh_imp.log Full=y
  sqlplus system/sys@DB @MWOra9i2_Grantsystowsec.sql
  echo ɾ����ѹ�õ����ļ�
  del yjzh.*
  echo ���ݵ������
  @goto end
:no
  echo �Բ���û�������������ڵ����ݻ������������ڸ�ʽ����ȷ��
  @goto end
:end
  pause
 

 ---------------------------
����
---------------------------
Windows ������ ���ؼ���� ���� OracleDBConsoleDB���йظ�����Ϣ������ϵͳ�¼���־��������Ƿ� Microsoft ���������������ϵ�����ο��ض����������� 2��
---------------------------
ȷ��   
---------------------------
