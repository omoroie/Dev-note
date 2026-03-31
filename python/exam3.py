a = [10, 20, 30, 40, 50]
res = 0
for i in range(1, 4):
    if a[i] % 3 == 0:
        res += a[i]
    else:
        res -= a[i]
print(res + a[-1])