/*
 * C# Program to Implement Binary Search Tree using Linked List
 */
using System;
using System.Collections.Generic;
using System.Text;
namespace TreeSort
{
    class Node
    {
        public int item;
        public Node leftc;
        public Node rightc;
        public void display()
        {
            Console.Write("[");
            Console.Write(item);
            Console.Write("]");
        }
    }
    class Tree
    {
        public Node root;
        public Tree()
        { 
            root = null; 
        }
        public Node ReturnRoot()
        {
            return root;
        }
        public void Insert(int id)
        {
            Node newNode = new Node();
            newNode.item = id;
            if (root == null)
                root = newNode;
            else
            {
                Node current = root;
                Node parent;
                while (true)
                {
                    parent = current;
                    if (id < current.item)
                    {
                        current = current.leftc;
                        if (current == null)
                        {
                            parent.leftc = newNode;
                            return;
                        }
                    }
                    else
                    {
                        current = current.rightc;
                        if (current == null)
                        {
                            parent.rightc = newNode;
                            return;
                        }
                    }
                }
            }
        }
        public void Preorder(Node Root)
        {
            if (Root != null)
            {
                Console.Write(Root.item + " ");
                Preorder(Root.leftc);
                Preorder(Root.rightc);
            }
        }
        public void Inorder(Node Root)
        {
            if (Root != null)
            {
                Inorder(Root.leftc);
                Console.Write(Root.item + " ");
                Inorder(Root.rightc);
            }
        }
        public void Postorder(Node Root)
        {
            if (Root != null)
            {
                Postorder(Root.leftc);
                Postorder(Root.rightc);
                Console.Write(Root.item + " ");
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Tree theTree = new Tree();
            theTree.Insert(20);
            theTree.Insert(25);
            theTree.Insert(45);
            theTree.Insert(15);
            theTree.Insert(67);
            theTree.Insert(43);
            theTree.Insert(80);
            theTree.Insert(33);
            theTree.Insert(67);
            theTree.Insert(99);
            theTree.Insert(91);            
            Console.WriteLine("Inorder Traversal : ");
            theTree.Inorder(theTree.ReturnRoot());
            Console.WriteLine(" ");
            Console.WriteLine();
            Console.WriteLine("Preorder Traversal : ");
            theTree.Preorder(theTree.ReturnRoot());
            Console.WriteLine(" ");
            Console.WriteLine();
            Console.WriteLine("Postorder Traversal : ");
            theTree.Postorder(theTree.ReturnRoot());
            Console.WriteLine(" ");
            Console.ReadLine();
        }
    }
}