#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> emergency) {
    vector<int> answer;
    int len = emergency.size();
    for (int i = 0;i < len;i++) {
        int rank = 1;
        for (int j = 0;j < len;j++) {
            if (emergency[i] < emergency[j]) rank++;
        }
        answer.push_back(rank);
    }
    return answer;
}