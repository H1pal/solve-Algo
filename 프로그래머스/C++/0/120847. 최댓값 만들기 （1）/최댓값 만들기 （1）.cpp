#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    int len = numbers.size();
    for (int i = 0;i < len-1;i++) {
        for (int j = 0;j < len-i-1;j++) {
            if (numbers[j] < numbers[j+1]) {
                int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
            }
        }
    }
    answer = numbers[0] * numbers[1];
    
    return answer;
}