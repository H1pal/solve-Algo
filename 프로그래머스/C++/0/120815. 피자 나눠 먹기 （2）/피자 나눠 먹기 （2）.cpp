#include <string>
#include <vector>

using namespace std;

int gcd(int n1, int n2) {
    if (n1 > n2) return n2 == 0 ? n1 : gcd(n2, n1 % n2);
    return n1 == 0 ? n2 : gcd(n1, n2 % n1);
}

int lcm(int a, int b) {
    return a * b / gcd(a, b);
}


int solution(int n) {
    int answer = 0;
    answer = lcm(6, n) / 6;

    return answer;
}