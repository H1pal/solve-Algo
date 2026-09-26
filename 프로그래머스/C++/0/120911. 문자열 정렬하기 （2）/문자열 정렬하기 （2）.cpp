#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string my_string) {
    string answer = "";
    transform(my_string.begin(), my_string.end(), back_inserter(answer), ::tolower);
    sort(answer.begin(), answer.end());
    return answer;
}