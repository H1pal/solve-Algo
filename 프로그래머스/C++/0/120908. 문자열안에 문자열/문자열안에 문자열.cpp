#include <string>
#include <vector>

using namespace std;

int solution(string str1, string str2) {
    int answer = 2;
    const int len1 = str1.length();
    const int len2 = str2.length();

    for (int i = 0;i <= len1 - len2;i++) {
        bool isMatched = true;
        for (int j = 0;j < len2;j++) {
            if (str1[i + j] != str2[j]) {
                isMatched = false;
                break;
            }
        }
        if (isMatched) {
            answer = 1;
            break;
        }
    }
    return answer;
}