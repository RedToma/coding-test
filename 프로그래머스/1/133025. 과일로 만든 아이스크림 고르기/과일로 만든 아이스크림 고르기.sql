-- 상반기 주문량 3000보다 높고 주 성분 과일인 아이스크림 맛 총 주문량이 큰 순서대로 조회

SELECT A.FLAVOR
FROM FIRST_HALF AS A
INNER JOIN ICECREAM_INFO AS B
ON A.FLAVOR = B.FLAVOR
WHERE SUBSTR(INGREDIENT_TYPE, 1, 5) = 'fruit' AND TOTAL_ORDER > 3000
ORDER BY TOTAL_ORDER DESC