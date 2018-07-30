# Hashtable is a little different form dictionary class of python
# It does not map key to value: it does but the key is derived by hashing the value
# Instead, HashTable is an array of arrays. An item being inserted gets hashed and 
# that hash value determines which row it is placed into. 

class HashTable(object):
    # use mod to decide which bucket. 
    # rehashed when reaching this. 
    def __init__(self, capacity = 16):
        self.loadfactor = 0.75
        self.itemCount = 0
        self.buckets = 16
        # if itemcount/buckets >=.75, double buckets
        # Storage format: [ [ [key1, value], [key2, value] ], [ [key3, value] ] ]
        self.table = [[] for _ in range(self.buckets)]
    
    # Hash function % buckets, returns index you will use
    def hash(self, key):
        return hash(key) % self.buckets
        # return (sum([ord(c) for c in key]) % self.buckets)

    def key_exists(self, key, index):
        #returns -1 if key exists, index otherwise 
        bucket = self.table[index]
        for i in range(len(bucket)):
            if (bucket[i][0] == key):
                return(i)
        return(-1)

    # updates if exists, insert otherwise.
    def insert(self, key, value):
        bucket_number = self.hash(key)
        index_in_bucket = self.key_exists(key,bucket_number)
        # exists and will update
        if (index_in_bucket >= 0):
            self.table[bucket_number][index_in_bucket][1] = value
        # does not exist, insert into some bucket
        else:
            self.table[bucket_number].append([key,value])

    # get value at key
    def get(self, key):
        bucket_number = self.hash(key)
        index_in_bucket = self.key_exists(key,bucket_number)
        if (index_in_bucket >=0):
            return(self.table[bucket_number][index_in_bucket][1])
        else:
            # error
            return None

    # def delete(value):
    # def has(value): hash then goes to linkedlist and goes thorugh it. 
    # def resize()
    # Load Factor = n/k where n is number of items, k is buckets


if __name__ == "__main__":
    t = HashTable(16)
    t.insert(1, "what")
    t.insert(1, "new_value")
    t.insert(17,"modded")
    t.insert(16,"last_value")
    t.insert(0, "another_last_value")
    t.insert("key", "value")
    for i in range(18,40):
        t.insert(i, "meow" + str(i))
    print("PRINT HASHTABLE")
    for i in t.table:
        print("row " + str(t.table.index(i)) + ": " + str(i))
    print("")
    print("Value of " + str(1) + " is " + t.get(1))
    print("Value of " + str(17) + " is " + t.get(17))
    print("Value of " + "key" + " is " + t.get("key"))

