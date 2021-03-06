-- 도서관
DROP SCHEMA IF EXISTS book_project; 

-- 도서관
CREATE SCHEMA book_project;

-- 도서
CREATE TABLE book_project.bookInfo (
	b_code       CHAR(4)     NOT NULL, -- 도서코드
	b_sub_code   INTEGER(2)  NOT NULL, -- 도서중복코드
	c_name       VARCHAR(50) NULL,     -- 분류
	b_name       VARCHAR(20) NULL,     -- 도서명
	author       VARCHAR(20) NULL,     -- 저자
	p_code       CHAR(4)     NULL,     -- 출판사코드
	price        INTEGER     NULL,     -- 가격
	insert_date  DATE        NULL,     -- 도서등록일
	b_lend_count INTEGER     NULL     DEFAULT 0, -- 총 대여횟수
	is_lending   BOOLEAN     NULL     DEFAULT false, -- 대여여부
	is_del       BOOLEAN     NULL     DEFAULT false -- 도서폐기여부
);

-- 도서
ALTER TABLE book_project.bookInfo
	ADD CONSTRAINT PK_bookInfo -- 도서 기본키
		PRIMARY KEY (
			b_code,     -- 도서코드
			b_sub_code  -- 도서중복코드
		);

-- 회원
CREATE TABLE book_project.memberInfo (
	m_code       CHAR(4)     NOT NULL, -- 회원코드
	m_pass       VARCHAR(20) NULL,     -- 비밀번호
	m_name       VARCHAR(20) NULL,     -- 성명
	m_tel        CHAR(13)    NULL,     -- 연락처
	m_zip_code   INTEGER(5)  NULL,     -- 우편번호
	m_address    VARCHAR(50) NULL,     -- 주소
	is_posbl     BOOLEAN     NULL     DEFAULT true, -- 대여가능여부
	delay_count  INTEGER     NULL     DEFAULT 0, -- 연체 횟수
	m_lend_count INTEGER     NULL     DEFAULT 0, -- 총 대여권수
	m_now_count  INTEGER     NULL     DEFAULT 0, -- 현재 대여권수
	black_date   DATE        NULL     DEFAULT null, -- 대여금지일
	m_group      CHAR(1)     NULL,     -- 회원그룹
	is_secsn     BOOLEAN     NULL     DEFAULT false -- 탈퇴여부
);

-- 회원
ALTER TABLE book_project.memberInfo
	ADD CONSTRAINT PK_memberInfo -- 회원 기본키
		PRIMARY KEY (
			m_code -- 회원코드
		);

-- 출납
CREATE TABLE book_project.paymentIO (
	no          INTEGER    NOT NULL, -- 출납번호
	b_code      CHAR(4)    NOT NULL, -- 도서코드
	b_sub_code  INTEGER(2) NULL,     -- 도서중복코드
	m_code      CHAR(4)    NOT NULL, -- 회원코드
	lend_date   DATE       NULL,     -- 대여일
	return_date DATE       NULL     DEFAULT null -- 반납일
);

-- 출납
ALTER TABLE book_project.paymentIO
	ADD CONSTRAINT PK_paymentIO -- 출납 기본키
		PRIMARY KEY (
			no -- 출납번호
		);

ALTER TABLE book_project.paymentIO
	MODIFY COLUMN no INTEGER NOT NULL AUTO_INCREMENT;

-- 출판사
CREATE TABLE book_project.publisherInfo (
	p_code     CHAR(4)     NOT NULL, -- 출판사코드
	publisher  VARCHAR(50) NULL,     -- 출판사명
	p_name     VARCHAR(20) NULL,     -- 담당자명
	p_tel      VARCHAR(13) NULL,     -- 연락처
	p_zip_code INTEGER(5)  NULL,     -- 우편번호
	p_address  VARCHAR(50) NULL      -- 주소
);

-- 출판사
ALTER TABLE book_project.publisherInfo
	ADD CONSTRAINT PK_publisherInfo -- 출판사 기본키
		PRIMARY KEY (
			p_code -- 출판사코드
		);

-- 도서분류
CREATE TABLE book_project.coden (
	c_name VARCHAR(50) NOT NULL, -- 분류
	c_code CHAR(2)     NOT NULL  -- 코드
);

-- 도서분류
ALTER TABLE book_project.coden
	ADD CONSTRAINT PK_coden -- 도서분류 기본키
		PRIMARY KEY (
			c_name -- 분류
		);

-- 도서
ALTER TABLE book_project.bookInfo
	ADD CONSTRAINT FK_publisherInfo_TO_bookInfo -- 출판사 -> 도서
		FOREIGN KEY (
			p_code -- 출판사코드
		)
		REFERENCES book_project.publisherInfo ( -- 출판사
			p_code -- 출판사코드
		)
		ON UPDATE CASCADE;

-- 도서
ALTER TABLE book_project.bookInfo
	ADD CONSTRAINT FK_coden_TO_bookInfo -- 도서분류 -> 도서
		FOREIGN KEY (
			c_name -- 분류
		)
		REFERENCES book_project.coden ( -- 도서분류
			c_name -- 분류
		)
		ON UPDATE CASCADE;

-- 출납
ALTER TABLE book_project.paymentIO
	ADD CONSTRAINT FK_bookInfo_TO_paymentIO -- 도서 -> 출납
		FOREIGN KEY (
			b_code,     -- 도서코드
			b_sub_code  -- 도서중복코드
		)
		REFERENCES book_project.bookInfo ( -- 도서
			b_code,     -- 도서코드
			b_sub_code  -- 도서중복코드
		)
		ON UPDATE CASCADE;

-- 출납
ALTER TABLE book_project.paymentIO
	ADD CONSTRAINT FK_memberInfo_TO_paymentIO -- 회원 -> 출납
		FOREIGN KEY (
			m_code -- 회원코드
		)
		REFERENCES book_project.memberInfo ( -- 회원
			m_code -- 회원코드
		)
		ON UPDATE CASCADE;
		
-- --------------------------------------------------------------------------------------

		
-- --------------------------------------------------------------------------------------
INSERT INTO book_project.publisherInfo (p_code, publisher, p_name, p_tel, p_zip_code, p_address) VALUES 
('P001','한빛미디어', '교보문고', '123-456-7890',04029,'서울특별시 마포구 양화로7길 83'),
('P002','길벗', '교보문고', '123-456-7890',04003,'서울특별시 마포구 월드컵로10길 56'),
('P003','제이펍', '교보문고', '123-456-7890',10881,'경기도 파주시 회동길 159 3층 3-B호'),
('P004','책세상', '교보문고', '123-456-7890',03176,'서울특별시 종로구 경희궁길 33 내자빌딩'),
('P005','민음사', '교보문고', '123-456-7890',06027,'서울특별시 강남구 도산대로1길 62'),
('P006','인플루엔셜', '교보문고', '123-456-7890',04511,'서울특별시 중구 통일로2길 16 에이아이에이타워 8층'),
('P007','부키', '교보문고', '123-456-7890',03785,'서울특별시 서대문구 신촌로3길 15 산성빌딩'),
('P008','돌베개', '교보문고', '123-456-7890',10881,'경기도 파주시 회동길 77-20'),
('P009','와이즈베리', '교보문고', '123-456-7890',06532,'서울특별시 서초구 신반포로 321'),
('P010','아시아', '교보문고', '123-456-7890',06972,'서울특별시 동작구 서달로 161-1'),
('P011','학이시습', '교보문고', '123-456-7890',37186,'경상북도 상주시 서문길 111-24'),
('P012','씨네21북스', '교보문고', '123-456-7890',04550,'서울특별시 중구 충무로5길 2 '),
('P013','문학동네', '교보문고', '123-456-7890',10881,'경기도 파주시 회동길 210'),
('P014','나무자전거', '교보문고', '123-456-7890',10441,'경기도 고양시 덕양구 강매로 256-21 1층'),
('P015','연두', '교보문고', '123-456-7890',03911,'서울특별시 마포구 매봉산로 18'),
('P016','더퀘스트', '교보문고', '123-456-7890',04558,'서울특별시 중구 창경궁로 17'),
('P017','흐름출판', '교보문고', '123-456-7890',55019,'전라북도 전주시 덕진구 정언신로 59'),
('P018','21세기북스', '교보문고', '123-456-7890',04560,'서울특별시 중구 퇴계로 293-1'),
('P019','보문사', '교보문고', '123-456-7890',23007,'인천광역시 강화군 삼산면 삼산남로828번길 44'),
('P020','메디치미디어', '교보문고', '123-456-7890',03027,'서울특별시 종로구 사직로9길 22'),
('P021','에이콘출판사', '교보문고', '123-456-7890',07967,'서울특별시 양천구 국회대로 287 2층'),
('P022','다산지식하우스', '교보문고', '123-456-7890',07626,'서울특별시 강서구 공항대로8길 77-24'),
('P023','한빛미디어', '교보문고', '123-456-7890',04768,'서울특별시 성동구 서울숲4길 28');

insert into book_project.coden (c_name, c_code) values 
('IT', 'T'),
('인문', 'H'),
('사회', 'S'),
('여행', 'J'),
('자기계발', 'D');


INSERT INTO book_project.bookInfo(b_code, b_sub_code, c_name, b_name, author, p_code, price, insert_date, is_lending, b_lend_count) values
('T001',00, 'IT','이것이자바다', '신용권', 'P001', 30000,'2016-01-01', true, 1),
('T001',01, 'IT','이것이자바다', '신용권', 'P001', 30000,'2016-01-01', true, 2),
('T001',02, 'IT','이것이자바다', '신용권', 'P001', 30000,'2016-04-01', true, 0),
('T002',00,'IT', '자바+안드로이드를다루는기술', '정재곤', 'P002', 40000,'2016-01-10', true, 1),
('T003',00,'IT', '인사이드자바스크립트','송형주','P023',18000,'2016-01-15', true, 4),
('T004',00,'IT', '자바스크립트&제이쿼리','존두켓','P003',36000,'2016-01-20', true, 1),
('T005',00,'IT', '퀄리티 코드', '스티븐 밴스', 'P021', 30000,'2016-01-31', true, 2),
('H001',00,'인문', '어떻게죽음을마주할것인가','모니카렌츠','P004',13950,'2016-02-03', true, 2),
('H002',00,'인문','공부할권리','정여울','P005',16500,'2016-02-10', true, 2),
('H003',00,'인문','미움받을용기','기시미이치로','P006',14900,'2016-02-15', true, 2),
('H004',00,'인문','나는생각이너무많아','크리스텔프리콜랭','P007',14800,'2016-02-20', true, 1),
('S001',00,'사회','국가란무엇인가','유시민','P008',15000,'2016-02-28', true, 1),
('S002',00,'사회','정의란무엇인가','마이클샌델','P009',15000,'2016-03-01', true, 3),
('S002',01,'사회','정의란무엇인가','마이클샌델','P009',15000,'2016-03-01', true, 1),
('S002',02,'사회','정의란무엇인가','마이클샌델','P009',15000,'2016-03-15', true, 1),
('S003',00,'사회','한국사회어디로','김우창','P010',16000,'2016-03-01', true, 2),
('S004',00,'사회','페페의희망교육','로베르트프란시스가르시아','P011',15000,'2016-03-05', true, 1),
('S005',00,'사회','국가가 할 일은 무엇인가','이헌재,이원재','P020',12500,'2016-03-05', true, 1),
('S006',00,'사회', '기록 너머에 사람이 있다 ', '안종오', 'P022', 13800,'2016-03-14', true, 2),
('J001',00,'여행','여행이아니면알수없는것들','손미나','P012',15000,'2016-03-15', false, 0),
('J001',01,'여행','여행이아니면알수없는것들','손미나','P012',15000,'2016-03-15', false, 4),
('J002',00,'여행','후쿠오카여행가는길','김남규','P015',14000,'2016-03-20', true, 2),
('J003',00,'여행','런던여행백서','정꽃나래','P014',18000,'2016-03-07', true, 1),
('J003',01,'여행','런던여행백서','정꽃나래','P014',18000,'2016-03-17', true, 0),
('D001',00,'자기계발', '쓸모없는짓의행복', '크리스길아보', 'P016', 15000,'2016-03-22', true, 1),
('D002',00,'자기계발', '버리고시작하라', '위르겐볼프', 'P017', 12000,'2016-04-03', true, 1);


INSERT INTO book_project.memberInfo (m_code, m_name, m_tel, m_zip_code, m_address, is_secsn, m_pass, m_group, is_posbl, delay_count, m_lend_count, m_now_count, black_date) VALUES
('C001', '김유정', '010-1111-1234',04524,'서울특별시 중구 세종대로 110',false, '1234', 'C', true, 0, 2, 2, null),
('C002', '박보영', '010-1234-2255',35242,'대전광역시 서구 둔산로 100',false, '4567', 'C', true, 1, 2, 2, null), 
('C003', '박보영', '010-2222-4567',41911,'대구광역시 중구 공평로 88',false, '5864', 'C', true, 0, 4, 1, null),
('C004', '전지현', '010-7777-2255',47545,'부산광역시 연제구 중앙대로 1001',false, 'aaba', 'C', true, 0, 5, 4, null),						-- 4권 빌린사람
('C005', 'Emma Watson', '010-5555-4567',41908,'대구광역시 중구 국채보상로139길 1',false, 'bbbb', 'C', false, 1, 7, 5, null),            -- 5권 빌린사람
('C006', '고수', '010-1234-1234',41185,'대구광역시 동구 아양로 207',true, '8888', 'C', false, 0, 1, 0, null), -- 탈퇴상태
('C007', '박보검', '010-5432-1234',41777,'대구광역시 서구 국채보상로 257',false, '9595', 'C', false, 0, 1, 0, null),            -- 탈퇴회원
('C008', '박형식', '010-1234-9999',42429,'대구광역시 남구 이천로 51',false, '5555', 'C', false, 1, 3, 1, null),            -- 책 연체 중인 사람(일반)
('C009', 'Dan Stevens', '010-9876-1200',41590,'대구광역시 북구 옥산로 65',false, '4444', 'C', true, 2, 4, 2, null),               -- 곧 블랙.. 연체횟수 2번이나 연체중 아님
('C010', '원빈', '010-9876-5432',42424,'대구 남구 중앙대로 220 3층',false, '8811', 'C', false, 2, 6, 2, null),             -- 곧 블랙리스트 될 사람.. 연체횟수2번에 연체중인사람
('C050', '원빈', '010-234-1234',42424,'대구 남구 중앙대로 220 3층',false, '8811', 'C', false, 3, 5, 0, '2017-03-23'), 	-- 현재 블랙리스트
('A001', '관리자', '010-234-1234',42424,'대구 남구 중앙대로 220 3층',false, 'admin', 'A', false, 0, 0, 0, null), -- 관리자
('B001', '사서', '010-234-1234',42424,'대구 남구 중앙대로 220 3층',false, '8811', 'B', false, 0, 0, 0, null);      -- 사서



INSERT INTO book_project.paymentIO (no, b_code, b_sub_code, m_code, lend_date, return_date) values
(1,'S002',02,'C003','2017-01-20' , '2017-01-21'),
(2,'J002',00,'C003','2017-01-22' , '2017-01-25'),
(3,'J001',01,'C007','2017-01-23' , '2017-01-25'),
(4,'S002',00,'C010','2017-01-23' , '2017-02-02'),   -- 연체도서
(5,'J001',01,'C010','2017-01-25' , '2017-02-05'),   -- 연체도서
(6,'S002',01,'C007','2017-01-31' , '2017-02-01'),
(7,'T003',00,'C010','2017-02-07' , '2017-02-08'),
(8,'J001',01,'C005','2017-02-10' , '2017-02-12'),
(9,'T003',00,'C009','2017-02-18' , '2017-02-19'),
(10,'S002',00,'C009','2017-02-19' , '2017-02-28'),   -- 연체도서
(11,'T003',00,'C004','2017-02-23' , '2017-02-24'),
(12,'J001',01,'C003','2017-02-28' , '2017-03-02'),
(13,'T005',00,'C005','2017-03-04' , '2017-03-06'),
(14,'H002',00,'C008','2017-03-05' , '2017-03-10'),   -- 연체도서
(15,'T001',01,'C010','2017-03-05' , '2017-03-06'),
(16,'S006',00,'C010','2017-03-08' , '2017-03-15'),  -- 연체도서
(17,'S003',00,'C009','2017-03-08' , '2017-03-09'),
(18,'T001',00,'C009','2017-03-09' , '2017-03-20'),   -- 연체도서
(19,'H003',00,'C008','2017-03-15' , '2017-03-20'),   -- 연체도서
(20,'H001',00,'C006','2017-03-19' , '2017-03-21'),
(21,'H002',00,'C009','2017-03-20' , null), -- 연체중
(22,'T001',01,'C001','2017-03-21' , null),
(23,'T003',00,'C002','2017-03-21' , null),
(24,'T004',00,'C002','2017-03-21' , null),
(25,'S004',00,'C003','2017-03-21' , null),
(26,'J002',00,'C004','2017-03-21' , null),
(27,'S001',00,'C005','2017-03-22' , null),
(28,'S006',00,'C005','2017-03-22' , null),
(29,'H001',00,'C004','2017-03-22' , null),
(30,'D002',00,'C004','2017-03-22' , null),
(31,'S005',00,'C005','2017-03-22' , null),
(32,'T005',00,'C005','2017-03-22' , null),
(33,'J003',00,'C005','2017-03-22' , null),
(34,'S002',00,'C007','2017-03-22' , null),
(35,'H004',00,'C008','2017-03-23' , null),
(36,'S003',00,'C008','2017-03-23' , null),
(37,'T002',00,'C001','2017-03-23' , null),
(38,'D001',00,'C004','2017-03-23' , null),
(39,'H003',00,'C009','2017-03-23' , null);

-- 테스트

SELECT `no`, io.b_code, io.b_sub_code, c_name, b_name, author, p_code,
		price, insert_date, b_lend_count, is_lending, is_del, lend_date,
		return_date,io.m_code, m_pass, m_name, m_tel, m_zip_code, m_address,
		is_posbl, delay_count, m_lend_count, m_now_count, black_date, m_group,
		is_secsn
		FROM book_project.paymentio io
		right outer join book_project.bookinfo b on io.b_code = b.b_code and
		io.b_sub_code = b.b_sub_code
		left outer join book_project.memberinfo m on io.m_code = m.m_code
		UNION
		SELECT `no`, io.b_code, io.b_sub_code, c_name, b_name,
		author, p_code, price, insert_date, b_lend_count, is_lending, is_del,
		lend_date, return_date,io.m_code, m_pass, m_name, m_tel, m_zip_code,
		m_address, is_posbl, delay_count, m_lend_count, m_now_count,
		black_date, m_group, is_secsn
		FROM book_project.paymentio io
		right outer join book_project.bookinfo b on io.b_code = b.b_code and
		io.b_sub_code = b.b_sub_code
		right outer join book_project.memberinfo m on io.m_code = m.m_code
		

		
SELECT `no`, io.b_code, io.b_sub_code, c_name, b_name, author, p_code,
		price, insert_date, b_lend_count, is_lending, is_del, lend_date,
		return_date,io.m_code, m_pass, m_name, m_tel, m_zip_code, m_address,
		is_posbl, delay_count, m_lend_count, m_now_count, black_date, m_group,
		is_secsn
		FROM paymentio io
		right outer join bookinfo b on io.b_code = b.b_code and
		io.b_sub_code = b.b_sub_code
		left outer join memberinfo m on io.m_code = m.m_code
		where return_date is null and io.b_code='T003' and io.b_sub_code=0 and io.m_code='C002'
		union
SELECT `no`, io.b_code, io.b_sub_code, c_name, b_name,
		author, p_code, price, insert_date, b_lend_count, is_lending, is_del,
		lend_date, return_date,io.m_code, m_pass, m_name, m_tel, m_zip_code,
		m_address, is_posbl, delay_count, m_lend_count, m_now_count,
		black_date, m_group, is_secsn
		FROM paymentio io
		right outer join bookinfo b on io.b_code = b.b_code and
		io.b_sub_code = b.b_sub_code
		right outer join memberinfo m on io.m_code = m.m_code
		where return_date is null and io.b_code='T003' and io.b_sub_code=0 and io.m_code='C002';

		SELECT `no`, io.b_code, io.b_sub_code, c_name, b_name, author, p_code,
		price, insert_date, b_lend_count, is_lending, is_del, lend_date,
		return_date,io.m_code, m_pass, m_name, m_tel, m_zip_code, m_address,
		is_posbl, delay_count, m_lend_count, m_now_count, black_date, m_group,
		is_secsn
		FROM paymentio io
		right outer join bookinfo b on io.b_code = b.b_code and
		io.b_sub_code = b.b_sub_code
		left outer join memberinfo m on io.m_code = m.m_code
		where return_date is null and io.b_code='H002' and io.b_sub_code='00' and io.m_code='C009';
		
		SELECT `no`, io.b_code, io.b_sub_code, c_name, b_name,
		author, p_code, price, insert_date, b_lend_count, is_lending, is_del,
		lend_date, return_date,io.m_code, m_pass, m_name, m_tel, m_zip_code,
		m_address, is_posbl, delay_count, m_lend_count, m_now_count,
		black_date, m_group, is_secsn
		FROM paymentio io
		right outer join bookinfo b on io.b_code = b.b_code and
		io.b_sub_code = b.b_sub_code
		right outer join memberinfo m on io.m_code = m.m_code
		where io.return_date is null and b.b_code='H002' and b.b_sub_code='00' and m.m_code='C009';
		
		-- -----
		
		SELECT `no`, io.b_code, io.b_sub_code, c_name, b_name, author, p_code,
		price, insert_date, b_lend_count, is_lending, is_del, lend_date,
		return_date,io.m_code, m_pass, m_name, m_tel, m_zip_code, m_address,
		is_posbl, delay_count, m_lend_count, m_now_count, black_date, m_group,
		is_secsn
		FROM paymentio io
		right outer join bookinfo b on io.b_code = b.b_code and
		io.b_sub_code = b.b_sub_code
		left outer join memberinfo m on io.m_code = m.m_code
		where return_date is null and lend_date is not null
		union
SELECT `no`, io.b_code, io.b_sub_code, c_name, b_name,
		author, p_code, price, insert_date, b_lend_count, is_lending, is_del,
		lend_date, return_date,io.m_code, m_pass, m_name, m_tel, m_zip_code,
		m_address, is_posbl, delay_count, m_lend_count, m_now_count,
		black_date, m_group, is_secsn
		FROM paymentio io
		right outer join bookinfo b on io.b_code = b.b_code and
		io.b_sub_code = b.b_sub_code
		right outer join memberinfo m on io.m_code = m.m_code
		where return_date is null and lend_date is not null;
		
		
		
-- ////////////////////////////
		
SELECT `no`, io.b_code, io.b_sub_code, c_name, b_name, author, p_code, price, insert_date, b_lend_count, is_lending, is_del, lend_date, return_date,io.m_code, m_pass, m_name, m_tel, m_zip_code, m_address, is_posbl, delay_count, m_lend_count, m_now_count, black_date, m_group, is_secsn FROM paymentio io right outer join bookinfo b on io.b_code = b.b_code and io.b_sub_code = b.b_sub_code left outer join memberinfo m on io.m_code = m.m_code WHERE lend_date is not null and return_date is null union SELECT `no`, io.b_code, io.b_sub_code, c_name, b_name, author, p_code, price, insert_date, b_lend_count, is_lending, is_del, lend_date, return_date,io.m_code, m_pass, m_name, m_tel, m_zip_code, m_address, is_posbl, delay_count, m_lend_count, m_now_count, black_date, m_group, is_secsn FROM paymentio io right outer join bookinfo b on io.b_code = b.b_code and io.b_sub_code = b.b_sub_code right outer join memberinfo m on io.m_code = m.m_code WHERE lend_date is not null and return_date is null