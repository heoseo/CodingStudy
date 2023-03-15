def solution(n, a, b):
    answer = 1

    if a > b:
        a, b = b, a

    while True:
        if b - a == 1:
            if a % 2 != 0:
                break

        answer += 1

        a = int((a+1) / 2)
        b = int((b+1) / 2)
        print('a:', a, 'b:', b)

    return answer


n = pow(2, 20)
a = pow(2, 19) * 4
b = pow(2, 19) * 5

print(solution(n, a, b))
