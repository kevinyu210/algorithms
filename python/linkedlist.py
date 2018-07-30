
class LinkedList:
    # Node Structure
    def __init__ (self, data = None, next_node = None):
        self.data = data
        self.next_node = next_node


if __name__ == "__main__":
    a = LinkedList(1)
    print(a.data)
    print(a.next_node)
    
