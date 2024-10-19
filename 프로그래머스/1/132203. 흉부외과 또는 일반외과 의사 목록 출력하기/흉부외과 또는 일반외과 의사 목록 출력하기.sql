-- 진료과 흉부외과(cs) or 일반외과(gs)인 의사 이름, ID, 진료과, 고용일자 조회 (고용일자 내림 고용일자 같으면 이름 오름)

SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, "%Y-%m-%d") AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD IN("CS", "GS")
ORDER BY HIRE_YMD DESC, DR_NAME