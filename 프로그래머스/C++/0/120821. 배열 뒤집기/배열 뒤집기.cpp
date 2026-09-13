#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    const int size = num_list.size();
    vector<int> answer(size);
    
    for (int i = 0;i < size;i++) {
        answer[i] = num_list[size - i - 1];
    }
    
    return answer;
}