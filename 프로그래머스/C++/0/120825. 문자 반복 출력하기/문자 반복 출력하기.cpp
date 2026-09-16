#include <string>
#include <vector>

using namespace std;

string solution(string my_string, int n) {
    string answer = "";
    for (const char i: my_string) answer += string(n, i);
    return answer;
}