-- Python 스킬 가진 개발자 정보조회 id, 이메일, 이름, 성 조회 (id기준 오름)

SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPER_INFOS
WHERE SKILL_1 IN ("Python") OR SKILL_2 IN ("Python") OR SKILL_3 IN ("Python")
ORDER BY ID