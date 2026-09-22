#include <string>
#include <vector>

using namespace std;

string solution(string rsp) {
    string answer = "";
    for (const char i: rsp) {
        if (i == '0') answer += '5';
        else if (i == '5') answer += '2';
        else answer += '0';
    }
    return answer;
}