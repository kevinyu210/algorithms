def func(data, time, lst):
    if len(lst) ==0:
        lst.append((data,time))
        print(data)
        return lst
    for i in range(len(lst)):
        if time - lst[i][1] < 10:
            lst = lst[i:]
            break
        elif i == len(lst)-1:
            lst = []
    if data not in [i[0] for i in lst]:
        print(data)
    lst.append((data,time))
    return lst


if __name__ == "__main__":
    # merge lists of different lengths
    lst = []
    lst = func("foo", 0, lst)
    print(lst)
    lst = func("foo", 5, lst)
    print(lst)
    lst = func("bar", 6, lst)
    print(lst)
    lst = func("foo", 9, lst)
    print(lst)
    lst = func("foo", 16, lst)
    print(lst)
    