-- 나이 정보가 없는 회원 몇 명인지 출력 (컬럼명은 USERS)

SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE AGE IS NULL