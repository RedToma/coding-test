-- 물고기 중 가장 큰 물고기의 길이 cm 붙여 출력 (컬럼명 MAX_LENGTH)

SELECT CONCAT(MAX(LENGTH), "cm") AS MAX_LENGTH
FROM FISH_INFO