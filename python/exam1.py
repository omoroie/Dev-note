lst = [1,2,3]
dst = {i : i* 2 for i in lst}
print(dst)
# 결과 {1: 2, 2: 4, 3: 6}, dst는 i : i*2 라는 key,value 형식의 딕셔너리로 생성한다

s = set(dst.values())
# s = {2, 4, 6} dst의 value값만 가져오게 됨
lst[0] = 99
# lst = [99,2,3]
dst[2] = 7
# dst = {1: 2, 2: 7, 3: 6}
s.add(99)
# s = {2, 4, 6, 99}

print(len(s & set(dst.values())))
# s & dst의 교집합 결과의 length 함수 결과를 출력한다, 교집합 결과는 2,6 이고 즉 2를 출력함