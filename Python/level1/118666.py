# lv1 - 성격 유형 검사하기
# https://school.programmers.co.kr/learn/courses/30/lessons/118666

def solution(surveys, choices):
    answer = ''
    order = 'RCJATFMN'

    sum = [[0] * 2 for i in range(4)]

    for i in range(len(surveys)):
        survey = surveys[i]
        choice = choices[i]

        #점수
        point = choice % 4 if choice >= 4 else (4 - choice % 4)
        #유형
        type = survey[int(choice / 4)]

        first = order.index(type) % 4
        second = (int)(order.index(type) / 4)


        sum[first][second] += point


    #점수 높은 유형 판단
    for i in range(4):
        if sum[i][0] < sum[i][1]:
            answer += order[4 + i]
        else:
            answer += order[i]


    return answer

surveys = ["AN", "CF", "MJ", "RT", "NA"]
choices = [5, 3, 2, 7, 5]

print(solution(surveys, choices))