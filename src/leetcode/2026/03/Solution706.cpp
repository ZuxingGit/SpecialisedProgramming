#include <iostream>
#include <vector>
using namespace std;

class Node {
public:
    int key;
    int val;
    Node* next;
    Node(int k = -1, int v = -1, Node* n = nullptr) : key(k), val(v), next(n) {}
};

class MyHashMap {
private:
    vector<Node*> map;

public:
    MyHashMap() {
        map.resize(1000);
        for (int index = 0; index < 1000; index++) {
            map[index] = new Node();
        }
    }
    
    int hash(int key) {
        return key % 1000;
    }

    void put(int key, int value) {
        int hash_key = hash(key);
        Node* cur = map[hash_key];

        while (cur->next) {
            if (cur->next->key == key) {
                cur->next->val = value;
                return;
            }
            cur = cur->next;
        }

        cur->next = new Node(key, value);
    }
    
    int get(int key) {
        int hash_key = hash(key);
        Node* cur = map[hash_key];

        while (cur->next) {
            if (cur->next->key == key) {
                return cur->next->val;
            }
            cur = cur->next;
        }

        return -1;
    }
    
    void remove(int key) {
        int hash_key = hash(key);
        Node* cur = map[hash_key];

        while (cur->next) {
            if (cur->next->key == key) {
                Node* temp = cur->next;
                cur->next = cur->next->next;
                delete temp;
                return;
            }
            cur = cur->next;
        }
    }
};

int main() {
    MyHashMap* obj = new MyHashMap();
    obj->put(1, 1);
    obj->put(2, 2);
    int param_2 = obj->get(1);
    cout << "Get(1): " << param_2 << endl; // Should print 1
    obj->remove(2);
    int param_3 = obj->get(2);
    cout << "Get(2): " << param_3 << endl; // Should print -1
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap* obj = new MyHashMap();
 * obj->put(key,value);
 * int param_2 = obj->get(key);
 * obj->remove(key);
 */