import sys
abc = sys.stdin.readline

while True:
    try:
        n1, n2 = map(int, abc().split())
        print(n1 + n2)
    except:
        break