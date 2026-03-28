class Node:
    def __init__(self, value):
        self.value = value
        self.children = []

def tree(li):
    nodes = [Node(i) for i in li]
    for i in range(l, len(li)):
        nodes[(i - 1) // 2].children.append(nodes[i])
    return nodes[0]
    
def calc(node, level=0):
    if node is None:
        return 0
    return (node.value if level % 2 == 0 else -node.value) + sum(calc(child, level + 1) for child in node.children)

li = [3, 5, 8, 12, 15, 18, 21]
root = tree(li)
print(calc(root))