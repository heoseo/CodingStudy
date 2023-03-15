# lv2-구명보트
# https://school.programmers.co.kr/learn/courses/30/lessons/42885

people = [60, 40, 60, 40]
limit = 100


def solution(people, limit):
    answer = 0
    # 새로운 정렬된 리스트를 반환하는 함수는 sorted 함수이고,
    # 리스트 자체를 정렬시켜버리는 것은 sort 함수.

    people.sort()
    print(people)

    bottom = 0
    top = len(people)-1

    print("top", top)



    while bottom <= top:
        if people[bottom] + people[top] <= limit:
            bottom += 1

        top -= 1
        answer += 1

    return answer


print(solution(people, limit))
