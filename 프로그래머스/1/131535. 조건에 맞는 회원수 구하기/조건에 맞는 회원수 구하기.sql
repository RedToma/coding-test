-- 2021년에 가입한 회원 중 나이가 20이상 29세 이하인 회원 몇명인지 출력
SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE DATE_FORMAT(JOINED, "%Y") = "2021" AND AGE BETWEEN 20 AND 29