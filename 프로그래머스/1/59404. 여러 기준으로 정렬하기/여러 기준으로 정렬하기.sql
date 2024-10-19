-- 모든 동물의 아이디, 이름, 보호 시작일을 이름 순으로 조회 (이름이 같으면 보호 나중에 시작한 동물 먼저)

SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME, DATETIME DESC