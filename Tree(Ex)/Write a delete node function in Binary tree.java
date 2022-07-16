
	public void DeleteNode(int value) {
		root = DeleteNode(root, value);
	}

	private Node DeleteNode(Node node, int value) {
		Node temp = null;
		if (node != null) {
			if (node.value == value) {
				if (node.lChild == null && node.rChild == null) {
					return null;
				} else {
					if (node.lChild == null) {
						temp = node.rChild;
						return temp;
					}
					if (node.rChild == null) {
						temp = node.lChild;
						return temp;
					}
					Node minNode = FindMinNode(node.rChild);
					int minValue = minNode.value;
					node.value = minValue;
					node.rChild = DeleteNode(node.rChild, minValue);
				}
			} else {
				if (node.value > value) {
					node.lChild = DeleteNode(node.lChild, value);
				} else {
					node.rChild = DeleteNode(node.rChild, value);
				}
			}
		}
		return node;
	}
