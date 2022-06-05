package datastructures.hashtable;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTable {
    ArrayList<KeyValue> data[];
    int length;

    public HashTable(int size) {
        data = new ArrayList[size];
        length = 0;
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.codePointAt(i) * i) % data.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int addr = hash(key);
        if (data[addr] == null) {
            data[addr] = new ArrayList<KeyValue>();
            length++;
        }
        KeyValue pair = new KeyValue(key, value);
        data[addr].add(pair);

    }

    public Integer get(String key) {
        int addr = hash(key);
        ArrayList<KeyValue> bucket = data[addr];
        if (bucket != null) {
            for (KeyValue keyValue : bucket) {
                if (keyValue.getKey().equals(key))
                    return keyValue.getValue();
            }
        }
        return null;
    }

    public String[] getKeys() {
        ArrayList<KeyValue>[] bucket = data;
        String[] keyArray = new String[length];
        int count = 0;
        for (ArrayList<KeyValue> keyValues : bucket) {
            if (keyValues != null) {
                keyArray[count] = keyValues.get(0).getKey();
                count++;
            }
        }

        return keyArray;
    }
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(50);
        hashTable.set("grapes", 1200);
        hashTable.set("apple", 1500);
        System.out.println("value for key grapes: " + hashTable.get("grapes"));
        System.out.println("value for key apple: " + hashTable.get("apple"));
        System.out.println("list of keys: " + Arrays.toString(hashTable.getKeys()));
    }
}
