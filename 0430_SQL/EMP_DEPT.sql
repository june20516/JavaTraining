

/* 
부서 테이블 : DEPT
  부서코드 - Number(2) : deptNo
  부서명 - VarChar(14) : deptName
  부서의 위치 - VarChar(14) : deptLocal

사원정보 테이블 : EMP
  사원번호 - Number(4) (Primary key) : empNo
  사원이름 - VarChar(20) : empName
  직군 - VarChar(14) : job
  입사일 - Date : hireDate
  기본급 - Number(10) : Sal
  부서코드 - Number(2) : deptNo
*/

/*=================================*/

CREATE TABLE DEPT ( 
DeptNo NUMBER(2)  NOT NULL, 
DeptName VARCHAR(14) NOT NULL, 
DeptLocal VARCHAR(14) NOT NULL, 
CONSTRAINT DEPT_PK PRIMARY KEY (DeptNo) 
);

CREATE TABLE EMP (
empNo NUMBER(4) PRIMARY KEY,
empName VARCHAR(20) NOT NULL,
job VARCHAR(20),
hireDate DATE,
sal NUMBER(10),
deptNo NUMBER(2) NOT NULL
);

ALTER TABLE emp ADD CONSTRAINT FK_DEPTNO FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO);

CREATE TABLE EMP2 (
empNo NUMBER(4) PRIMARY KEY,
empName VARCHAR(20) NOT NULL,
job VARCHAR(20),
hireDate DATE,
sal NUMBER(10),
deptNo NUMBER(2),
FOREIGN KEY ( DEPTNO ) REFERENCES DEPT ( DEPTNO )
);


/*=================================*/

show tables;

/*=================================*/

INSERT INTO DEPT VALUES(1,'총무부','서울');
INSERT INTO DEPT VALUES(2,'인사부','대전');
INSERT INTO DEPT VALUES(3,'영업부','대구');
INSERT INTO DEPT VALUES(4,'감사부','부산');
INSERT INTO DEPT VALUES(5,'홍보부','런던');
INSERT INTO DEPT VALUES(6,'개발1부','켈리포니아');
INSERT INTO DEPT VALUES(7,'개발2부','켈리포니아');

SELECT * FROM DEPT;

/*=================================*/

// to_date( '2019-03-27', 'YY-MM-DD')

INSERT INTO EMP VALUES(1, 'bran','dev','2019-03-27',80000000, 1);
INSERT INTO EMP VALUES(2, 'kelley','aud','2016-10-09',70000000, 4);
INSERT INTO EMP VALUES(3, 'seop','dev','2017-09-08',70000000, 6);
INSERT INTO EMP VALUES(4, 'layne','dev','2014-02-04',60000000, 6);
INSERT INTO EMP VALUES(5, 'jully','hr','2017-05-13',70000000, 2);
INSERT INTO EMP VALUES(6, 'eddy','mkt','2019-03-20',50000000, 3);
INSERT INTO EMP VALUES(7, 'sol','lgs','2019-03-27',90000000, 1);
INSERT INTO EMP VALUES(8, 'lido','lgs','2018-12-20',90000000, 10);

INSERT INTO EMP2 VALUES(1, 'bran','dev','2019-03-27',80000000, 7);
INSERT INTO EMP2 VALUES(2, 'kelley','aud','2016-10-09',70000000, 4);
INSERT INTO EMP2 VALUES(3, 'seop','dev','2017-09-08',70000000, 6);
INSERT INTO EMP2 VALUES(4, 'layne','dev','2014-02-04',60000000, 6);
INSERT INTO EMP2 VALUES(5, 'jully','hr','2017-05-13',70000000, 2);
INSERT INTO EMP2 VALUES(6, 'eddy','mkt','2019-03-20',50000000, 3);
INSERT INTO EMP2 VALUES(7, 'sol','lgs','2019-03-27',90000000, 5);
INSERT INTO EMP2 VALUES(8, 'lido','lgs','2018-12-20',90000000, 10);

SELECT * FROM EMP order by empno;
SELECT * FROM DEPT;
SELECT * FROM  EMP2 ORDER BY EMPNO;

/*=================================*/

UPDATE EMP SET DEPTNO=7 WHERE EMPNO=1;
UPDATE EMP SET DEPTNO=5 WHERE EMPNO=7;

DELETE FROM DEPT where DEPTNO=1;
DELETE FROM DEPT where DEPTNO=2;

/*=================================*/