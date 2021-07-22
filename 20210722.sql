-- Oracle SQL에서도 MySQL처럼 프로그래밍을 할 수 있습니다.
-- 단, 변수 선언이나 호출 등의 문법, 그리고 콘솔창에 출력하는 문법이
-- 똑같지 않기 때문에 oracle쪽의 문법을 따로 익혀주셔야 합니다.
-- Oracle에서 진행하는 프로그래밍은 PL/SQL이라고 부르기도 합니다.

--PL/SQL 문법
-- 문법)
-- DECLARE
--      변구명 자료형;
--      .......
--   ERGIN
--      실행문
--END;

-- 익명 블록 => DECLEAR ~ END 구간을 블록이라고 부릅니다.
-- 익명 블록은 명칭을 붙이지 않고 사용하는 PL/SQ L프로그래밍 구간을 의미합니다.
/*
DECLARE
    vi_num NUMBER;
BEGIN
    vi_num := 100;
    DBMS_OUTPUT.PUT_LINE(vi_num); --pront구문은 좌측에
END;
*/
-- Sql Develpoer에서 콘솔창을 여는 방법
-- 상단 메뉴의 보기 -> DBMS 출력 클릭
-- DBMS 출력 창에서 좌상단 녹색 십자가 클릭후 접속계정 연결

-- 내부적으로 일반 프로그래밍처럼 연산자를 사용할 수 있습니다.
DECLARE
     a INTEGER := 2**2 * 3 ** 2;
BEGIN
    DBMS_OUTPUT.PUT_LINE('a = ' || TO_CHAR(a));
END;



