#include<iostream>
#include<vector>
using namespace std;
#define DB(x) cout<<#x<<": "<<x<<'\n'

class VigenereCipher {
    const string AlphabetSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    string key;
    int m;
    public:
    VigenereCipher(const string key){
       this->key = key;
       this-> m = (int)key.size();
    }

    string encryption(string plainText){
      
        string cipherText = "";
       for(int i = 0;i<(int)plainText.size(); i++){
           cipherText += AlphabetSet[( (plainText[i] - 65) + (key[i%m] - 65) ) %26];
       }
        return cipherText;
    }

    string decryption(const string cipherText){
    
        string plainText = "";
       for(int i = 0;i<(int)cipherText.size(); i++){
           int k = ( (cipherText[i] - 65) - (key[i%m] - 65) ) %26;
           //There is a chance of k being negative.
           if(k < 0) k += 26; //same as (k%26 + 26)%26 since above line will be in mod 26 form itself
            
            plainText += AlphabetSet[k]; 
       }
        return plainText;
    }

};


int main(){
    
    
    string plainText; //P.T
    cout<<"Enter plainText: ";
    cin>>plainText;
    VigenereCipher HC("nikhlbwtameojpqrcxudsfvyzg"); //pass the key

    string cipherText = HC.encryption(plainText);
    cout<<"Ciphertext: "<<cipherText<<'\n';
    string decryptedText = HC.decryption(cipherText);
    cout<<"decryptedText: "<<decryptedText<<'\n';

   
}