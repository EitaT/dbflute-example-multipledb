
-- =======================================================================================
--                                                                            Myself Check
--                                                                            ============
-- 'MYSELF_CHECK' and 'MYSELF' for MyselfInScopeSubQuery Check
CREATE TABLE MYSELF_CHECK ( 
	MYSELF_CHECK_ID integer NOT NULL,
	MYSELF_CHECK_NAME varchar(80) NOT NULL,
	MYSELF_ID integer
)
;
ALTER TABLE MYSELF_CHECK ADD CONSTRAINT PK_MYSELF_CHECK PRIMARY KEY (MYSELF_CHECK_ID) ;
CREATE TABLE MYSELF (
	MYSELF_ID integer NOT NULL,
	MYSELF_NAME varchar(80) NOT NULL
)
;
ALTER TABLE MYSELF ADD CONSTRAINT PK_MYSELF PRIMARY KEY (MYSELF_ID) ;
ALTER TABLE MYSELF_CHECK ADD CONSTRAINT FK_MYSELF_CHECK_SELF
	FOREIGN KEY (MYSELF_ID) REFERENCES MYSELF (MYSELF_ID) ;
