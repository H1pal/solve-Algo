#include <string>
#include <vector>

using namespace std;

int sqrt(int n) {
    if (n <= 0) return 0;
    if (n == 1) return 1; 

    int x = n;
    int next_x = (x + n / x) / 2;

    while (next_x < x) {
        x = next_x;
        next_x = (x + n / x) / 2;
    }

    return x;
}

int solution(int n) {
    int answer = 0;
    for (int i = 1;i <= sqrt(n);i++) {
        if (n % i == 0) {
            answer += i*i == n ? 1 : 2;
        }
    }
    return answer;
}