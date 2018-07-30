# Various ways of implementing
# pivot can be:
#   Last element
#   First element
#   Average element
#   Median element
def quicksort(unsorted_list):
    # Base Case: no list or one item only
    if (len(unsorted_list) <1):
        return(unsorted_list)
    
    else:
        pivot = unsorted_list[-1]
        left = []
        right = []
        for i in unsorted_list[:-1]:
            if (i <=pivot):
                left.append(i)
            else:
                right.append(i)
        return(quicksort(left) + [pivot] + quicksort(right))



if __name__ == "__main__":
    print(quicksort([8,9,7,9,5,1]))
    print(quicksort([]))
