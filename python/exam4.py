# 정처기 실기 준비, 트리 노드 및 조건문 기반 누적합 계산
class TreeNode:
    def __init__(self, value):
        self.value = value
        self.children = []

def build_tree(values):
    nodes = [TreeNode(v) for v in values]
    for i in range(1, len(values)): # i 는 1부터 values의 length 값 - 1 까지 반복문을 실행한다
        parent_index = (i - 1) // 2
        nodes[parent_index].children.append(nodes[i])
    return nodes[0]

def sum_odd_levels(node, level=0):
    if node is None:
        return 0
    current_value = node.value if level % 2 == 1 else 0 # if 조건식에 의해 level % 2 가 1이 아닌경우 else문에 의해 0을 current_value에 대입한다
    children_sum = sum(sum_odd_levels(child, level + 1) for child in node.children)
    return current_value + children_sum

values = [3, 5, 8, 12, 15, 18, 21]
root = build_tree(values)
result = sum_odd_levels(root)
print(result)