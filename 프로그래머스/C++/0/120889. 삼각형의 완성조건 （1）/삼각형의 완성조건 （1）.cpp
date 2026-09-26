#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> sides) {
    int answer = 0;
    auto side_max = max_element(sides.begin(), sides.end());
    int sum = 0;
    for (const int side: sides) {
        sum += side;
    }
    answer = sum > *side_max * 2 ? 1: 2;
    
    return answer;
}