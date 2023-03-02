def solution(keymap, targets):
    answer = []
    match = {}

    for key in keymap:
        index = 0

        while True:
            ch = key[index]
            if ch in match:
                val = match[ch]
                if val > index: 
                    match[ch] = index
            else:
                match[ch] = index

            index += 1
            if index == len(key): break
    
    for target in targets:
        sum = 0

        for ch in target:
            if ch in match:
                sum += (match[ch] + 1)
            else:
                sum = -1
                break
        answer.append(sum)

    return answer

        
keymap = ["ABACD", "BCEFD"]
targets = ["ABCD","AABB"]
# keymap = ["AA"]
# targets = ["B"]
# keymap = ["AGZ", "BSSS"]
# targets = ["ASA","BGZ"]

print(solution(keymap, targets))