#include <string>
#include <vector>

using namespace std;

int solution(string my_string) {
    int answer = 0;
    bool isSeq = true;
    int temp = 0;
    for (const char ch: my_string) {
        if (ch >= '0' && ch <= '9') {
            isSeq = true;
            temp *= 10;
            temp += ch - '0';
        }
        else isSeq = false;
        if (!isSeq && temp != 0) {
            answer += temp;
            temp = 0;
        }
    }
    answer += temp;
    return answer;
}