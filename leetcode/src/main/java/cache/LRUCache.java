package cache;

import java.util.HashMap;

public class LRUCache {
    private HashMap<String, Node> hashMap;
    private int limit;
    private Node head;
    private Node end;

    public LRUCache(int limit) {
        this.limit = limit;
        this.hashMap = new HashMap<String, Node>();
    }

    public Object get(String key) {
        Node node = hashMap.get(key);
        if (node == null) {
            return null;
        }
        refreshNode(node);
        return node.value;
    }

    public void put(String key, Object obj) {
        Node node = hashMap.get(key);
        if (node == null) {
            if (hashMap.size() >= limit) {
                String oldKey = removeNode(head);
                hashMap.remove(oldKey);
            }
            node = new Node(key, obj);
            addNode(node);
            hashMap.put(key, node);
        } else {
            node.value = obj;
            refreshNode(node);
        }
    }

    public void refreshNode(Node node) {
        if (node == null) {
            return;
        }

        removeNode(node);
        addNode(node);
    }

    public void addNode(Node node) {
        if (end != null) {
            end.next = node;
            node.pre = end;
            node.next = null;
        }
        end = node;
        if (head == null) {
            head = node;
        }
    }

    public String removeNode(Node node) {
        if (node == head && node == end) {
            head = null;
            end = null;
        } else if (node == end) {
            end = end.pre;
            end.next = null;
        } else if (node == head) {
            head = head.next;
            head.pre = null;
        } else {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        return node.key;
    }

    class Node {
        String key;
        Object value;
        Node pre;
        Node next;

        Node(String key, Object obj) {
            this.key = key;
            this.value = obj;
        }
    }
}
