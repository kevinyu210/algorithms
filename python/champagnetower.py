def champagneTower(poured, query_row, query_glass):
    """
    :type poured: int
    :type query_row: int
    :type query_glass: int
    :rtype: float
    """
    Tower = [[0]]
    def pourRecursive(tower,amount, i, j):
#            the row
        total = tower[i][j] + amount
#          If overfilled.... take remainder and distribute. 
        if (total >=1):
            tower[i][j] = float(1)
            remainder = total -float(1)
#            if there are no cups below... make them... so if len(tower) ==1 there is 1 cup only and i+2 == row 2. row 2 does not exist yet. 
            if (i+2 >len(tower)):
                tower.append([0]* (i+2))
            pourRecursive(Tower,remainder/2,i+1, j)
            pourRecursive(Tower,remainder/2,i+1, j+1)
#            now we should fill the two underneath it. 
        else:
            tower[i][j] = float(total)

    # return Tower
    def pourIterative(tower,amount,row,glass):
        total = amount
        # fill the first cup. 
        tower[0][0] = total
        for i in range(query_row+1):
            # for each row... create the next row? up until the query_row at least.
            tower.append([0] * (i+2))
            for j in range(i+1):
                # if cup is not full yet it is <1 and will be negative. So next cup will get 0 instead of negative. 
                tower[i+1][j] += max((tower[i][j]-1)/2,0)
                tower[i+1][j+1] += max((tower[i][j]-1)/2,0)
                tower[i][j] -= max((tower[i][j]-1),0)

                
    pourIterative(Tower, float(poured),0, 0)
    if (query_row+1 > len(Tower)):
        return (0.0)
    return (Tower[query_row][query_glass])
    # return(Tower)
        


if __name__ == "__main__":
    # for i in champagneTower(2,5,0):
    #     print(i)
    print(champagneTower(2,1,1))
    # print(champagneTower(1000000000,99,99))

        