#include <iostream>
#include "linked_list.h"

int main() {

    List list;
    list.AddElementEnd(2);
    list.AddElementEnd(4);
    list.AddElementEnd(5);
    list.AddElementStart(1);
    list.AddElementAt(3, 2);
    list.DisplayList();

    list.DeleteLast();
    list.DeleteAt(2);
    list.DeleteFirst();
    list.DisplayList();
}
