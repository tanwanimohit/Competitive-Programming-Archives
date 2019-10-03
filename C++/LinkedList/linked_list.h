#ifndef LINKEDLIST
#define LINKEDLIST

class ListElement {
  public:
    ListElement();
    ListElement(int data);

    void setData(int data) { data_ = data; }
    int  getData() { return data_; }

    void setNext(ListElement *next) { next_ = next; }
    ListElement* getNext() { return next_; }

  private:
    int data_;
    ListElement* next_;
};


class List {
  public:
    List();
    void AddElementEnd(int data);
    void AddElementStart(int data);
    void AddElementAt(int data, int pos);

    void DeleteLast();
    void DeleteFirst();
    void DeleteAt(int pos);

    void DisplayList();
    bool isEmpty() { return (head_ == nullptr); }
    int Length();

  private:
    ListElement* head_;
    ListElement* tail_;
};

#endif
