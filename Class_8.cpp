#include <iostream>
using namespace std;

class BankAcc {
    string holderName;
    double accNo;
    float Balance=0;
    public : 
        BankAcc() {
            cout << "Enter Your Name as per bank Account : ";
            cin >> holderName;
            cout << "Enter Your accout number : ";
            cin >> accNo;
            cout << "Enter Your Present Balance : ";
            cin >> Balance;
        }

        void deposit() {
            float amount;
                cout << "Enter the amount of deposit : ";
                cin >> amount;
            Balance += amount;
        }

        void withdraw() {
            float amount;
                cout << "Enter the amount of withdraw : ";
                cin >> amount;
            Balance -= amount;
        }

        void displayData() {
            cout << "Hello ," << holderName << endl;
            cout << "Your account Number is : " << accNo << endl;
            cout << "Currently your balance is : " << Balance << endl;
        }

};


int main () {
    int get;
    BankAcc c;
    c.displayData();
    
    return 0;
}