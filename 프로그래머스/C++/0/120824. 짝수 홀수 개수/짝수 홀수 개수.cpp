#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    vector<int> answer(2, 0);
    for (const int i : num_list) answer[i % 2] += 1;
    return answer;
}