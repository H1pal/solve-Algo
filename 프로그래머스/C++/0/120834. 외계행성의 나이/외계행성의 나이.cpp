#include <string>
#include <vector>
#include <algorithm>

using namespace std;


string solution(int age) {
    string answer = "";
    while (age != 0) {
        char alpha = (age % 10) + 'a';
        answer += alpha;
        
        age /= 10;
    }
    ranges::reverse(answer);
    return answer;
}