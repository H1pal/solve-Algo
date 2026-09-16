#include <string>
#include <vector>

using namespace std;

string solution(string my_string, string letter) {
    string answer = "";
    for (const char i : my_string) {
        if (letter[0] != i) {
            answer += i;
        }
    }
    return answer;
}