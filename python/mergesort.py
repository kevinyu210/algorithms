def mergesort(unsorted_list):
    # Base Case: no list or one item only
    if (len(unsorted_list) ==1 or len(unsorted_list) ==0):
        return(unsorted_list)

    else:

        middle_index = len(unsorted_list)/2
        right = unsorted_list[middle_index:]
        left = unsorted_list[:middle_index]
        return (merge(mergesort(left), mergesort(right)))

def merge(left, right):
    # merge two sorted lists.
    left_index = 0
    right_index = 0
    sorted_list=[]
    # while both lists still have items...
    while (left_index < len(left) and right_index < len(right)):
        next_left = left[left_index]
        next_right = right[right_index]
        if (next_left <next_right):
            sorted_list.append(next_left)
            left_index +=1
        else:
            sorted_list.append(next_right)
            right_index +=1
    # Not Both lists have items...
    # Case 1: Both lists are empty
    # Case 2: List one empty
    # Case 3: List two empty
    # Conclusion.... Add remainder of both lists.

    sorted_list += left[left_index:] + right[right_index:]
    return sorted_list



if __name__ == "__main__":
    # merge lists of different lengths
    print("Test Merge")
    a = [1,8,10,50]
    b = [2,3]
    print(a)
    print(b)
    print(merge(a,b))
    print("")
    print("Test Merge Order Doesn't Matter")
    c = [1,2,3,4]
    d = []
    # merge with empty list, in either order
    print(c)
    print(d)
    print(merge(c,d) == merge(d,c))
    print("")
    print("Test MergeSort")
    a = [1,6,4,3,3,8,2,3,5]
    print(a)
    print(mergesort(a))
