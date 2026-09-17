#include <string>
#include <vector>

using namespace std;

int solution(int n, int k) {
    int answer = 0;
    int services = n / 10;
    answer += 12000 * n;
    answer += 2000 * (k - services);
    return answer;
}