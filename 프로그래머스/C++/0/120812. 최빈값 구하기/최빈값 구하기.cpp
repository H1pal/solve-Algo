#include <string>
#include <vector>

using namespace std;

int solution(vector<int> array) {
    int answer = 0;
    int counter[1004] = { 0 };
    int maxCount = 0;
    for (const int i : array) {
        counter[i]++;
    }
    for (int i = 0; i < 1001; i++) {
        if (counter[i] > maxCount) {
            maxCount = counter[i];
            answer = i; 
        }
        else if (counter[i] == maxCount && counter[i] != 0) {
            answer = -1; // 동점 발생
        }

    }


    return answer;
}