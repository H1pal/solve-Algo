#include <string>
#include <vector>

using namespace std;

int solution(vector<int> array) {
    int answer = 0;
    int size = array.size();
    for (int i = 0;i < size;i++) {
        for (int j = 0;j < size-i-1;j++) {
            if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;    
            }
            
        }
    }
    answer = size % 2 == 1 ? array[size/2] : array[size/2-1];
    return answer;
}