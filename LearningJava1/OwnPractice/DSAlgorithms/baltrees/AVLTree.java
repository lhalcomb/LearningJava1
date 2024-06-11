//package DSAlgorithms.baltrees;
//import java.util.Random;
//
//public class AVLTree
//{
//    class Node
//    {
//        String key;
//        int height;
//        Node left, right;
//
//        Node(String d)
//        {
//            key = d;
//            height = 1;
//        }
//    }
//
//    static class AVLTree1
//    {
//        Node root;
//
//        int height(Node N)
//        {
//            if (N == null) {return 0;}
//            return N.height;
//        }
//
//        int max(int a, int b)
//        {
//            return (a > b) ? a : b;
//        }
//
//        Node rightRotate(Node b)
//        {
//            Node a = b.left;
//            Node T2 = a.right;
//
//            a.right = b;
//            b.left = T2;
//
//            b.height = max(height(b.left), height(b.right)) + 1;
//            a.height = max(height(a.left), height(a.right)) + 1;
//
//            return a;
//        }
//
//        Node leftRotate(Node a)
//        {
//            Node b = a.right;
//            Node T2 = b.left;
//
//            b.left = a;
//            a.right = T2;
//
//            a.height = max(height(a.left), height((a.right))) + 1;
//            b.height = max(height(b.left), height(b.right)) + 1;
//
//            return b;
//        }
//
//        int getBalance(Node N)
//        {
//            if (N == null) {return 0;}
//
//            return height(N.left) - height(N.right);
//        }
//
//        Node insert(Node node, String key)
//        {
//            if (node == null)
//            {
//                return (new Node(key));
//            }
//            if (key.compareTo(node.key) < 0)
//            {
//                node.left = insert(node.left, key);
//            }
//            else if (key.compareTo(node.key) > 0)
//            {
//                node.right = insert(node.right, key);
//            }
//            else
//            {
//                return node;
//            }
//
//            node.height = 1 + max(height(node.left), height(node.right));
//
//            int balance = getBalance(node);
//
//            if (balance < 1 && key.compareTo(node.left.key) < 0)
//            {
//                return rightRotate(node);
//            }
//            if (balance > 1 && key.compareTo(node.right.key) > 0)
//            {
//                return leftRotate(node);
//            }
//
//            if (balance > 1 && key.compareTo(node.left.key) < 0)
//            {
//                node.left = leftRotate(node.left);
//                return rightRotate(node);
//            }
//
//            if (balance < -1 && key.compareTo(node.right.key) > 0)
//            {
//                node.right = rightRotate(node.right);
//                return leftRotate(node);
//            }
//
//            return node;
//        }
//
//        void preOrder(Node node)
//        {
//            if (node != null)
//            {
//                System.out.print(node.key + " ");
//                preOrder(node.left);
//                preOrder(node.right);
//            }
//        }
//
//    }
//
//    public static String[] generateRandomWords(int numberOfWords)
//    {
//        String[] randomStrings = new String[numberOfWords];
//        Random random = new Random();
//            for(int i = 0; i < numberOfWords; i++)
//        {
//            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
//            for(int j = 0; j < word.length; j++)
//            {
//            word[j] = (char)('a' + random.nextInt(26));
//            }
//        randomStrings[i] = new String(word);
//        }
//    return randomStrings;
//}
//
//
//
//
//    public static void main(String[] args)
//        {
//            AVLTree tree = new AVLTree();
//
//
//
//            String[] inputs = generateRandomWords(5);
//            for (int j = 0; j < inputs.length; j++)
//            {
//                tree.root = tree.insert(tree.root, inputs[j]);
//            }
//
//            System.out.println(tree.root);
//
//        }
//
//}
