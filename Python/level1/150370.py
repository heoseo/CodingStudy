# lv1 - 개인정보 수집 유효기간
# https://school.programmers.co.kr/learn/courses/30/lessons/150370
from datetime import datetime
from dateutil.relativedelta import relativedelta
def solution(today, terms, privacies):
    today = datetime.strptime(today, '%Y.%m.%d').date()
    answer = []
    termDict = {}

    #약관 유효기간
    for term in terms:
        split = term.split()
        termDict[split[0]] = int(split[1])


    #개인정보
    for i in range(0, len(privacies)):
        privacy = privacies[i]
        split = privacy.split()
        #약관종류
        termType = split[1]
        #수집일자
        startDate = datetime.strptime(split[0], '%Y.%m.%d').date()
        #만료일자
        endDate = startDate + relativedelta(months=termDict[termType])

        if today >= endDate:
            answer.append(i+1)

    return answer

today = "2022.05.19"
terms =	["A 6", "B 12", "C 3"]
privacies = ["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]
# today = "2020.01.01"
# terms =	["Z 3", "D 5"]
# privacies = ["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]

print(solution(today, terms, privacies))