str = input()
#문자열을 하나씩 돌면서 문자 바꿔줘야되는데 어케하지.
#print(str.swapcase()) #소>대, 대>소 바꿔주는 함수가 존재함
answer = ""

for ch in str:
    if ch.islower(): #소문자인가?
        answer += ch.upper() #대문자로
    else:
        answer += ch.lower() #소문자로

print(answer)