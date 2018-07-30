# # # On a 2x3 board, there are 5 tiles represented by the integers 1 through 5, and an empty square represented by 0.

# # # A move consists of choosing 0 and a 4-directionally adjacent number and swapping it.

# # # The state of the board is solved if and only if the board is [[1,2,3],[4,5,0]].

# # # Given a puzzle board, return the least number of moves required so that the state of the board is solved. If it is impossible for the state of the board to be solved, return -1.


# # Input: board = [[4,1,2],[5,0,3]]
# # Output: 5
# # Explanation: 5 is the smallest number of moves that solves the board.
# # An example path:
# # After move 0: [[4,1,2],[5,0,3]]
# # After move 1: [[4,1,2],[0,5,3]]
# # After move 2: [[0,1,2],[4,5,3]]
# # After move 3: [[1,0,2],[4,5,3]]
# # After move 4: [[1,2,0],[4,5,3]]
# # After move 5: [[1,2,3],[4,5,0]]

# class Solution(object):
#     def slidingPuzzle(self, board):
#         """
#         :type board: List[List[int]]
#         :rtype: int
#         """
# #         Gotta use heuristics probably...
#         solution = [[1,2,3],[4,5,6]]
    
#         def difference(table1, table2, zero):
# #             calculate the difference between two tables so that we can pick best solution...

#         current_state = board    
#         current_zero = [0,0]
#         for i in range(len(board)):
#             for j in range(len(board[0])):
#                 if board[i][j] == 0:
#                     current_zero = [i,j]
        
#         while current_state != solution:
#             # best_state = current_state
#             # best_difference = 2*32
#             best_state
#             best_difference
            
#             if current_zero[0] ==0:
#                 bottom_value = current_state[1][current_zero[1]]
#                 new_state = current_state[:]
#                 new_state[1][current_zero[1]] = 0
#                 new_state[0][current_zero[1]] = bottom_vaue
#                 dif = difference(solution, new_state)     
#                 best_difference = dif
#                 best_state = new_state
#                 #there exists a left value
#                 if current_zero[1] >0:
#                     left_value = current_state[current_zero[0]][current_zero[1] -1]
#                     new_state = current_state[:]
#                     new_state[current_zero[0]][current_zero[1] -1] = 0
#                     new_state[current_zero[0]][current_zero[1]] = left_value
#                     dif = difference(solution, new_state)
#                     if dif < best_difference:
#                         best_state = new_state
#                         best_difference = dif
#                 if current_zero[1] < 2:
#                     right_value = current_state[current_zero[0]][current_zero[1] +1]
#                     new_state = current_state[:]
#                     new_state[current_zero[0]][current_zero[1] +1] = 0
#                     new_state[current_zero[0]][current_zero[1]] = right_value
#                     dif = difference(solution, new_state) 
#                     if dif < best_difference:
#                         best_state = new_state
#                         best_difference = dif

                
#                 current_state = best_state
#             if current_zero[0] == 1:
#                 top_value = current_state[0][current_zero[1]]
#                 new_state = current_state[:]
#                 new_state[0][current_zero[1]] = 0
#                 new_state[1][current_zero[1]] = top_vaue
#                 dif = difference(solution, new_state)     
#                 best_difference = dif
#                 #there exists a left value
#                 if current_zero[1] >0:
#                     left_value = current_state[current_zero[0]][current_zero[1] -1]
#                     new_state = current_state[:]
#                     new_state[current_zero[0]][current_zero[1] -1] = 0
#                     new_state[current_zero[0]][current_zero[1]] = left_value
#                     dif = difference(solution, new_state)
#                     if dif < best_difference:
#                         best_state = new_state
#                         best_difference = dif
#                 if current_zero[1] < 2:
#                     right_value = current_state[current_zero[0]][current_zero[1] +1]
#                     new_state = current_state[:]
#                     new_state[current_zero[0]][current_zero[1] +1] = 0
#                     new_state[current_zero[0]][current_zero[1]] = right_value
#                     dif = difference(solution, new_state) 
#                     if dif < best_difference:
#                         best_state = new_state
#                         best_difference = dif
#             current_state = best_state
            
            

        