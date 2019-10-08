/*
 * C# Program to Implement Traversal in Singly Linked List
 */
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
namespace Program
{
    class singlelist
    {
        private int data;
        private singlelist next;
        public singlelist()
        {
            data = 0;
            next = null;
        }
        public singlelist(int value)
        {
            data = value;
            next = null;
        }
        public singlelist InsertNext(int value)
        {
 
            singlelist node = new singlelist(value);
            if (this.next == null)
            {
                node.next = null; 
                this.next = node;
            }
           else
            {
                singlelist temp = this.next;
                node.next = temp;
                this.next = node;
            }
            return node;
        }
        public int DeleteNext()
        {
            if (next == null)
                return 0;
            singlelist node = this.next;
            this.next = this.next.next;  
            node = null;
            return 1;
        }
        public void Traverse(singlelist node)
        {
            if (node == null)
                node = this;
            System.Console.WriteLine("Traversing :");
            while (node != null)
            {
                System.Console.WriteLine(node.data);
                node = node.next;
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            singlelist node1 = new singlelist(11);
            singlelist node2 = node1.InsertNext(12);
            singlelist node3 = node2.InsertNext(13);
            singlelist node4 = node3.InsertNext(14);
            singlelist node5 = node4.InsertNext(15);
            node1.Traverse(null);
            Console.WriteLine("Deleting !!");
            node3.DeleteNext();
            node2.Traverse(null);
            System.Console.ReadLine();
        }
    }
}