#include <string>
#include <vector>

using namespace std;

string solution(string my_string) {
    string answer = "";
    int interval = 'a' - 'A';
    for (const char ch: my_string) {
        if (ch >= 'A' && ch <= 'Z') answer += ch + interval;
        else if (ch >= 'a' && ch <= 'z') answer += ch - interval;
    }
    return answer;
}