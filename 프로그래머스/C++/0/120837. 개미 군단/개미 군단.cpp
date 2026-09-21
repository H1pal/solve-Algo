#include <string>
#include <vector>

using namespace std;

int solution(int hp) {
    int answer = 0;
    int general = hp / 5;
    hp %= 5;
    int soldier = hp / 3;
    int common = hp % 3;
    answer = general + soldier + common;
    return answer;
}