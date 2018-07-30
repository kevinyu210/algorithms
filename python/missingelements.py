# Given a list of ordered distinct integers from [0-99] summarize missing elements in string format.
# Input: [0,1,2,50,52,75]
# Output: "3-49,51,53-74,76-99"  
def missingelements(lst):
    if (len(lst) == 0):
        return "0-99"
    current_num = lst[0]
    output = ""
    for i in range(1,len(lst)):
        if (current_num +1 != lst[i]):
            output += str(current_num +1) + "-" + str(lst[i] - 1) + ","
            current_num = lst[i]
        else:
            current_num +=1
    if (current_num < 99):
        output += str(current_num +1) + "-" +str(99) + ","
    return output[:-1]

if __name__ == "__main__":
    # merge lists of different lengths
    print(missingelements([0,1,3,50,52,98]))
