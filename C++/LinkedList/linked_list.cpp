#include <iostream>

#include "linked_list.h"

ListElement::ListElement()
    : data_(0),
      next_(nullptr) {
}

ListElement::ListElement(int data)
    : data_(data),
      next_(nullptr) {
}

List::List()
    : head_(nullptr),
      tail_(nullptr){
}

void List::AddElementEnd(int data) {
    ListElement *elem = new ListElement;
    elem->setData(data);
    if (head_ == nullptr) {
        head_ = elem;
        tail_ = elem;
    } else {
        tail_->setNext(elem);
        tail_ = elem;
    }
}

void List::AddElementStart(int data) {
    ListElement *elem = new ListElement;
    elem->setData(data);
    if (head_ == nullptr) {
        head_ = elem;
        tail_ = elem;
    } else {
        elem->setNext(head_);
        head_ = elem;
    }
}

void List::AddElementAt(int data, int pos) {
    ListElement *elem = new ListElement;
    elem->setData(data);
    if (head_ == nullptr) {
        head_ = elem;
        tail_ = elem;
    } else {
        ListElement *current = new ListElement;
        ListElement *pre = new ListElement;
        elem->setData(data);
        current = head_;
        for (int i = 0; i < pos; i++) {
            pre=current;
            current = current->getNext();
        }
        pre->setNext(elem);
        elem->setNext(current);
    }
}

void List::DeleteFirst() {
    if (head_ == nullptr) {
        return;
    } else if (head_->getNext() == nullptr) {
        head_ = nullptr;
        tail_ = nullptr;
    } else {
        ListElement *elem = new ListElement;
        elem = head_;
        head_ = head_->getNext();
        delete elem;
    }
}

void List::DeleteLast() {
    if (head_ == nullptr) {
        return;
    } else if (head_->getNext() == nullptr) {
        head_ = nullptr;
        tail_ = nullptr;
    } else {
        ListElement *current = new ListElement;
        ListElement *pre = new ListElement;
        current = head_;
        while(current->getNext() != nullptr) {
            pre=current;
            current=current->getNext();
        }
        tail_ = pre;
        pre->setNext(nullptr);
        delete current;
    }
}

void List::DeleteAt(int pos) {
    if (head_ == nullptr) {
        return;
    } else if (head_->getNext() == nullptr) {
        head_ = nullptr;
        tail_ = nullptr;
    } else {
        ListElement *current = new ListElement;
        ListElement *pre = new ListElement;
        current = head_;
        for(int i = 1; i < pos; i++) {
            pre = current;
            current = current->getNext();
        }
        pre->setNext(current->getNext());
    }
}

void List::DisplayList() {
    if (head_ == nullptr) {
        std::cout << "empty" << std::endl;
    } else {
        ListElement *temp;
        temp = head_;
        while(temp->getNext() != nullptr) {
            std::cout << "(" << temp->getData() << ")-->";
            temp = temp->getNext();
        }
        std::cout << "(" << temp->getData() << ")" << std::endl;
    }
}

int List::Length() {
    int count = 0;
    if (head_ == nullptr) {
        return 0;
    } else {
        ListElement *temp;
        temp = head_;
        while(temp->getNext() != nullptr) {
            count += 1;
            temp = temp->getNext();
        }
        count += 1;
    }
    return count;
}
