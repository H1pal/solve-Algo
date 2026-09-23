#include <string>
#include <vector>
#include <map>

using namespace std;

map<string, char> MORSE = {
    {".-", 'a'}, {"-...", 'b'}, {"-.-.", 'c'}, {"-..", 'd'}, {".", 'e'}, {"..-.", 'f'},
    {"--.", 'g'}, {"....", 'h'}, {"..", 'i'}, {".---", 'j'}, {"-.-", 'k'}, {".-..", 'l'},
    {"--", 'm'}, {"-.", 'n'}, {"---", 'o'}, {".--.", 'p'}, {"--.-", 'q'}, {".-.", 'r'},
    {"...", 's'}, {"-", 't'}, {"..-", 'u'}, {"...-", 'v'}, {".--", 'w'}, {"-..-", 'x'},
    {"-.--", 'y'}, {"--..", 'z'}
};

string solution(string letter) {
    string answer = "";
    string ch = "";
    int lenth = letter.size();
    for (int i = 0;i < lenth;i++) {
        if (letter[i] == ' ' && ch != "") {
            answer += MORSE[ch];
            ch = "";
        }
        else {
            ch += letter[i];
            if (i == lenth-1) answer += MORSE[ch];
        }
    }
    return answer;
}