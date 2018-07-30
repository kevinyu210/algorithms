def bestRotation(A):
    best = [0,0]
#     each rotation
    for i in range(len(A)):
        rotated = A[i:] + A[:i]
        print(rotated)
        total = 0
        for j in range(len(A)):
            if rotated[j] > j:
                total+=1
        print(total)
        if total > best[1]:
            best= [i,total]
    return best[0]

if __name__ == "__main__":
    a = [2,3,1,4,0]  
    print(bestRotation(a))      