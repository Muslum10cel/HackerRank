test_case = int(input())

for t in range(test_case):
    arrivalCount = 0
    n_k = [int(x) for x in input().split()]
    arr = [int(x) for x in input().split()]
    for a in arr:
        if a <= 0:
            arrivalCount += 1
    if arrivalCount >= n_k[1]:
        print("NO")
    else:
        print("YES")
