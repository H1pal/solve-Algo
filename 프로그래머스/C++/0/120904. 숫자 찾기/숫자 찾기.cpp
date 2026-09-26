#include <string>
#include <vector>

using namespace std;

int solution(int num, int k) {
    int answer = -1;
    int digit = 1;
    while (num > 0) {
        if (num % 10 == k) answer = digit;
        digit++;
        num /= 10;
    }
    if (answer != -1) answer = digit - answer;
    return answer;
}