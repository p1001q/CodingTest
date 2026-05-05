def solution(my_string, overwrite_string, s):
    return my_string[:s]+overwrite_string+my_string[s+len(overwrite_string):]
#앞부분+덮어쓸부분+나머지부분