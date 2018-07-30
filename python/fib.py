# Two version of fibonacci... Naive or the one that saves values. 
# Recursive Fib
def fib(number):
    def helper(num):

        if (number<3):
            return(1)
        else:
            return(fib(number-1) + fib(number-2))
    return(helper(number))
# Recursive Fib with memoization
def fibBetter(number):
    lst = [0] * number
    def helper(num):
        lst[0] +=1
        if  (num <3):
            return (1)
        else:
            if (lst[num-1] != 0):
                return(lst[num-1])
            else:
                lst[num-1] = helper(num-1) + helper(num-2)
                return(lst[num-1])
    return(helper(number))
    # return(memo[0])
    


if __name__ == "__main__":
    print(fibBetter(3))