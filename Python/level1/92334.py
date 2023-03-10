#lv1 - 신고 결과 받기
#https://school.programmers.co.kr/learn/courses/30/lessons/92334

def solution(id_list, reports, k):
    answer = [0 for i in range(len(id_list))]
    reportedCnt = dict()
    reportedList = []

    id_dict = {id: i for i,id in enumerate(id_list)}

    # 신고 중복 제거
    reports = set(reports)

    # dictionary list로 정리
    for report in reports:
        split = report.split()
        er = split[0]
        ee = split[1]

        reportedList.append({"er": er, "ee": ee})
        if ee in reportedCnt:
            reportedCnt[ee] += 1
        else:
            reportedCnt[ee] = 1


    # 정지된 유저 찾기
    for ee in reportedCnt.keys():
        if reportedCnt[ee] >= k:    # 정지됨

            # 처리 횟수 +1
            for reported in reportedList:
                if ee == reported['ee']:
                    indexOfReporter = id_dict[reported['er']]
                    answer[indexOfReporter] += 1


    return answer


id_list = ["muzi", "frodo", "apeach", "neo"]
reports = ["muzi frodo","muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]
k = 3

print(solution(id_list, reports, k ))