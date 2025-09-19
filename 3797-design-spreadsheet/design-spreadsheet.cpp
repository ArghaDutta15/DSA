#include <bits/stdc++.h>
using namespace std;

class Spreadsheet {
private:
    unordered_map<string, int> mpp; // store cell -> value

public:
    Spreadsheet(int rows) {
        // rows parameter not used directly (could be used for validation if needed)
    }
    
    void setCell(string cell, int value) {
        mpp[cell] = value;
    }
    
    void resetCell(string cell) {
        if (mpp.count(cell)) {
            mpp.erase(cell);
        }
    }
    
    int getValue(string formula) {
        // formula always starts with '='
        string s = formula.substr(1);

        // check if contains '+'
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == '+') {
                string s1 = s.substr(0, i);
                string s2 = s.substr(i + 1);

                int left = (isalpha(s1[0])) ? mpp[s1] : stoi(s1);
                int right = (isalpha(s2[0])) ? mpp[s2] : stoi(s2);
                return left + right;
            }
        }

        // no '+', single value or cell
        if (isalpha(s[0])) {
            return mpp[s];  // it's a cell reference
        }
        return stoi(s); // it's just a number
    }
};

/**
 * Example usage:
int main() {
    Spreadsheet* obj = new Spreadsheet(10);
    obj->setCell("A1", 5);
    obj->setCell("B2", 7);

    cout << obj->getValue("=A1") << endl;       // 5
    cout << obj->getValue("=10") << endl;       // 10
    cout << obj->getValue("=A1+5") << endl;     // 10
    cout << obj->getValue("=A1+B2") << endl;    // 12
    
    obj->resetCell("A1");
    // obj->getValue("=A1") -> undefined behavior if accessed after reset
    
    return 0;
}
 */
