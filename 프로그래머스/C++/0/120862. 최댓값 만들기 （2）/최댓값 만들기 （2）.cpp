#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    sort(numbers.begin(), numbers.end());
    
    int n1 = numbers[0] * numbers[1];
    int n2 = numbers.back() * *(numbers.end()-2);
    answer = max(n1, n2);
    return answer;
}