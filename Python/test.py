report = ["abc def", "abc def"]
print(report)
report = set(report)
print(report)




cnt = dict()
print(cnt)
cnt['frodo'] = 0
print(cnt)
cnt['frodo'] = 1
print(cnt)
print(cnt['frodo'])
cnt['frodo'] +=1
print(cnt)
print('apeach' in cnt)

# a = "neo"
# print(cnt[a])


print("abc")
print('abc')

text1 = "abc"
text2 = 'abc'

list = [[0] * 2 for i in range(3)]
print(list)

print( 7 % 4)

print(text1[1])
print(text1.index('b'))

import dateutil
from datetime import datetime
from dateutil.relativedelta import relativedelta

s = "2011.11.11"
d = datetime.strptime(s, '%Y.%m.%d').date()
print(type(d))
after = d+relativedelta(months=5)
print(after)
print(d < after)
