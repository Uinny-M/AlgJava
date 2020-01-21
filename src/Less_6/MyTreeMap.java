package Less_6;

import java.util.NoSuchElementException;

public class MyTreeMap<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node {
        Key key;
        Value value;
        Node left;
        Node right;
        int size;

        private Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            this.size = 1;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.size;
    }

    private boolean isEmpty() {
        return root == null;
    }

    private boolean isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("key не должен быть null");
        }
        return true;
    }

    boolean contains(Key key) {
        return get(key) != null;
    }

    final Value get(Key key) {
        isKeyNotNull(key);
        return getit(root, key);
    }

    private Value getit(Node node, Key key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            return node.value;
        } else if (cmp < 0) {
            return getit(node.left, key);
        } else {
            return getit(node.right, key);
        }
    }

    final void put(Key key, Value value) {
        isKeyNotNull(key);
        if (value == null) {

            return;
        }
        root = put(root, key, value);
    }

    private Node put(Node node, Key key, Value value) {
        if (node == null) {
            return new Node(key, value);
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            node.value = value;
        } else if (cmp < 0) {
            node.left = put(node.left, key, value);
        } else {
            node.right = put(node.right, key, value);
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public Key minKey() {
        return min(root).key;
    }

    private Node min(Node node) {
        if (node.left == null) {
            return node;
        }
        return min(node.left);
    }

    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        root = deleteMin(root);
    }

    private Node deleteMin(Node node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    void delete(Key key) {
        isKeyNotNull(key);
        root = delete(root, key);
    }

    private Node delete(Node node, Key key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = delete(node.left, key);
        } else if (cmp > 0) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            Node tmp = node;
            node = min(node.right);
            node.right = deleteMin(tmp.right);
            node.left = tmp.left;
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public Node getRoot(MyTreeMap myTreeMap) {
        return root;
    }

    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(Node node) {
        if (node == null) {
            return "";
        }
        return toString(node.left)
                + "[" + node.key + "=" + node.value + "], "
                + toString(node.right);
    }

    //Поиск глубины дерева
    public int deepOfTree(Node node) {
        int deep = 0;
        int d1 = 0, d2 = 0;
        if (node == null) return 0;
        else if (node.left != null) {
            d1 = deepOfTree(node.left);
        } else if (node.right != null) {
            d2 = deepOfTree(node.right);
        }

        if (d1 > d2) deep = d1 + 1;
        else deep = d2 + 1;

        return deep;
    }

    //оценка сбалансированности
    boolean isBalance(Node node) {
        return Math.abs(deepOfTree(node.left) - deepOfTree(node.right)) <= 1;
    }
}
