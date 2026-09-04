#include <iostream>
#include <vector>

using namespace std;

int gcd(int dividend, int divisor) {
    return divisor == 0 ? dividend : gcd(divisor, dividend % divisor);
}

int examine(int n1, int n2) { return n1 > n2 ? gcd(n1, n2) : gcd(n2, n1); }

vector<int> make_irreducible(vector<int> arr) {
    int least = examine(arr[0], arr[1]);

    return vector<int> { arr[0] / least, arr[1] / least };
}

vector<int> solution(int numer1, int denom1, int numer2, int denom2) {
    vector<int> answer;
    int numerResult = numer1 * denom2 + numer2 * denom1;
    int denomResult = denom1 * denom2;

    answer.push_back(numerResult);
    answer.push_back(denomResult);
    cout << answer[0] << answer[1];

    answer = make_irreducible(answer);

    return answer;
}

